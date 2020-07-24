package com.wherezip.model.send;

import lombok.Builder;
import lombok.Getter;

@Getter
public class AlimtalkSendRequestLookupResponseMessage {

    private String requestTime;
    private String messageId;
    private String countryCode;
    private String to;
    private String content;
    private String plusFriendId;
    private String templateCode;
    private String completeTime;
    private String requestStatusCode;
    private String requestStatusName;
    private String requestStatusDesc;
    private String messageStatusCode;
    private String messageStatusName;
    private String messageStatusDesc;

    @Builder
    public AlimtalkSendRequestLookupResponseMessage(String requestTime,
                                                    String messageId,
                                                    String countryCode,
                                                    String to,
                                                    String content,
                                                    String plusFriendId,
                                                    String templateCode,
                                                    String completeTime,
                                                    String requestStatusCode,
                                                    String requestStatusName,
                                                    String requestStatusDesc,
                                                    String messageStatusCode,
                                                    String messageStatusName,
                                                    String messageStatusDesc) {
        this.requestTime = requestTime;
        this.messageId = messageId;
        this.countryCode = countryCode;
        this.to = to;
        this.content = content;
        this.plusFriendId = plusFriendId;
        this.templateCode = templateCode;
        this.completeTime = completeTime;
        this.requestStatusCode = requestStatusCode;
        this.requestStatusName = requestStatusName;
        this.requestStatusDesc = requestStatusDesc;
        this.messageStatusCode = messageStatusCode;
        this.messageStatusName = messageStatusName;
        this.messageStatusDesc = messageStatusDesc;
    }


}
