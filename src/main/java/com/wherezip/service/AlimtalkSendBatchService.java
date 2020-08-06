package com.wherezip.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wherezip.config.Config;
import com.wherezip.model.send.AlimtalkSendRequestBody;
import com.wherezip.model.send.AlimtalkSendRequestMessage;
import com.wherezip.model.send.AlimtalkSendResponseBody;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.*;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.*;

@Slf4j
@RequiredArgsConstructor
@Service
public class AlimtalkSendBatchService implements BatchService {

    private final Config config;

    private RestTemplate restTemplate;

    @PostConstruct
    public void initialize() {
        restTemplate = new RestTemplate();
        MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
        mappingJackson2HttpMessageConverter
                .setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.TEXT_PLAIN));
        restTemplate.getMessageConverters().add(mappingJackson2HttpMessageConverter);
        ((SimpleClientHttpRequestFactory) restTemplate.getRequestFactory()).setReadTimeout(10 * 1000);
    }

    @Override
    public List<?> request() {
        return null;
    }

    public void sendMessage() {
        try {
            String url = config.getSensApiUrl() + "/services/" + config.getSensServiceId() + "/messages";

            HttpHeaders headers = new HttpHeaders();
            headers.setAccept(Collections.singletonList(new MediaType("application", "json", StandardCharsets.UTF_8)));
            headers.setContentType(new MediaType("application", "json", StandardCharsets.UTF_8));
            headers.set("x-ncp-apigw-timestamp", String.valueOf(new Date().getTime()));
            headers.set("x-ncp-iam-access-key", config.getSensAccessKeyId());
            headers.set("x-ncp-apigw-signature-v2", makeSignature());

            HttpEntity<String> entity = new HttpEntity<>("parameter", headers);

            List<AlimtalkSendRequestMessage> messages = new ArrayList<>();
            AlimtalkSendRequestMessage alimtalkSendRequestMessage =
                    AlimtalkSendRequestMessage.builder()
                            .to("01040069499")
                            .content("[내집어디?]\n" +
                                    "임시 비밀번호가 발급되었습니다.\n" +
                                    "임시 비밀번호 : #{임시비밀번호}\n" +
                                    "※로그인 후 비밀번호를 반드시 변경해주시기 바랍니다.")
                            .countryCode(null)
                            .alimtalkButtons(null)
                            .build();

            messages.add(alimtalkSendRequestMessage);

            AlimtalkSendRequestBody alimtalkSendRequestBody = AlimtalkSendRequestBody.builder()
                    .messages(messages)
                    .plusFriendId(config.getPlusFriendId())
                    .templateCode("RC20200803")
                    .reserveTime(null)
                    .reserveTimeZone(null)
                    .scheduleCode(null)
                    .build();


            HttpEntity requestEntity = new HttpEntity(alimtalkSendRequestBody, headers);

            log.info("url : {}", url);
            log.info("headers : {}", headers.toString());
            log.info("request body : {}", alimtalkSendRequestBody.toString());
            log.info("requestEntity : {}", requestEntity.getBody());

            ResponseEntity<String> responseEntity
                    = restTemplate.exchange(url, HttpMethod.POST, requestEntity, String.class);
            log.info("response getStatusCode : {}", responseEntity.getStatusCode());
            log.info("response getHeaders : {}", responseEntity.getHeaders());
            log.info("response body : {}", responseEntity.getBody());
            ObjectMapper mapper = new ObjectMapper();

            AlimtalkSendResponseBody alimtalkSendResponseBody = mapper.readValue(responseEntity.getBody(), AlimtalkSendResponseBody.class);
            log.info("alimtalkSendResponseBody : {}" , alimtalkSendResponseBody.toString());

        } catch (Exception e) {
            log.error("message : {}, cauese : {}", e.getMessage(), e.getCause());
            e.printStackTrace();
        }
    }

    public String makeSignature() throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException {
        String space = " ";
        String newLine = "\n";
        String method = "POST";
        String url = "/alimtalk/v2/services/" + config.getSensServiceId() + "/messages";
        String timestamp = String.valueOf(new Date().getTime());
        String accessKey = config.getSensAccessKeyId();
        String secretKey = config.getSensSecretKey();

        String message = new StringBuilder()
                .append(method)
                .append(space)
                .append(url)
                .append(newLine)
                .append(timestamp)
                .append(newLine)
                .append(accessKey)
                .toString();
        SecretKeySpec signingKey = new SecretKeySpec(secretKey.getBytes("UTF-8"), "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(signingKey);

        byte[] rawHmac = mac.doFinal(message.getBytes("UTF-8"));
        String encodeBase64String = Base64.encodeBase64String(rawHmac);

        return encodeBase64String;
    }

}