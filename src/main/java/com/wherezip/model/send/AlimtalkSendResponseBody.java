package com.wherezip.model.send;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class AlimtalkSendResponseBody {

    @JsonProperty(value = "requestId")
    private String requestId;

    @JsonProperty(value = "requestTime")
    private String requestTime;

    @JsonProperty(value = "statusCode")
    private String statusCode;

    @JsonProperty(value = "statusName")
    private String statusName;

    @JsonProperty(value = "messages")
    private List<AlimtalkSendResponseMessasge> messages;

//    public AlimtalkSendResponseBody(String requestId,
//                                    String requestTime,
//                                    String statusCode,
//                                    String statusName,
//                                    List<AlimtalkSendResponseMessasge> messages){
//        this.requestId = requestId;
//        this.requestTime = requestTime;
//        this.statusCode = statusCode;
//        this.statusName = statusName;
//        this.messages = messages;
//    }

}
