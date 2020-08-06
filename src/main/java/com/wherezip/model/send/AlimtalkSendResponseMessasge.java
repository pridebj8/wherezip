package com.wherezip.model.send;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;


@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AlimtalkSendResponseMessasge {

    @JsonProperty(value="messageId")
    private String messageId;

    @JsonProperty(value="countryCode")
    private String countryCode;

    @JsonProperty(value="to")
    private String to;

    @JsonProperty(value="content")
    private String content;

    @JsonProperty(value = "useSmsFailover")
    private boolean useSmsFailover;

    @JsonProperty(value="requestStatusCode")
    private String requestStatusCode;

    @JsonProperty(value="requestStatusName")
    private String requestStatusName;

    @JsonProperty(value="requestStatusDesc")
    private String requestStatusDesc;

//    AlimtalkSendResponseMessasge(String messageId,
//                                 String countryCode,
//                                 String to,
//                                 String content,
//                                 boolean useSmsFailover,
//                                 String requestStatusCode,
//                                 String requestStatusName,
//                                 String requestStatusDesc){
//        this.messageId = messageId;
//        this.countryCode = countryCode;
//        this.to = to;
//        this.content = content;
//        this.useSmsFailover = useSmsFailover;
//        this.requestStatusCode = requestStatusCode;
//        this.requestStatusName = requestStatusName;
//        this.requestStatusDesc = requestStatusDesc;
//    }

}
