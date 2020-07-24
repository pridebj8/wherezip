package com.wherezip.model.send;

import lombok.Builder;
import lombok.Getter;

@Getter
public class AlimtalkSendResponseMessasge {

    private String messageId;
    private String countryCode;
    private String to;
    private String content;
    private String requestStatusCode;
    private String requestStatusname;
    private String requestStatusDesc;

    @Builder
    AlimtalkSendResponseMessasge(String messageId,
                                 String countryCode,
                                 String to,
                                 String content,
                                 String requestStatusCode,
                                 String requestStatusname,
                                 String requestStatusDesc){
        this.messageId = messageId;
        this.countryCode = countryCode;
        this.to = to;
        this.content = content;
        this.requestStatusCode = requestStatusCode;
        this.requestStatusname = requestStatusname;
        this.requestStatusDesc = requestStatusDesc;
    }

}