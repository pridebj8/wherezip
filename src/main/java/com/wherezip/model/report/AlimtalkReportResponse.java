package com.wherezip.model.report;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
public class AlimtalkReportResponse {

    private String messageId;
    private String requestId;
    private String requestTime;
    private String completeTime;
    private String plusFriendId;
    private String templateCode;
    private String countryCode;
    private String to;
    private String content;
    private String requestStatusCode;
    private String requestStatusName;
    private String requestStatusDesc;
    private String messageStatusCode;
    private String messageStatusName;
    private String messageStatusDesc;

    @Builder
    public AlimtalkReportResponse(String messageId,
                                  String requestId,
                                  String requestTime,
                                  String completeTime,
                                  String plusFriendId,
                                  String templateCode,
                                  String countryCode,
                                  String to,
                                  String content,
                                  String requestStatusCode,
                                  String requestStatusName,
                                  String requestStatusDesc,
                                  String messageStatusCode,
                                  String messageStatusName,
                                  String messageStatusDesc) {
        this.messageId = messageId;
        this.requestId = requestId;
        this.requestTime = requestTime;
        this.completeTime = completeTime;
        this.plusFriendId = plusFriendId;
        this.templateCode = templateCode;
        this.countryCode = countryCode;
        this.to = to;
        this.content = content;
        this.requestStatusCode = requestStatusCode;
        this.requestStatusName = requestStatusName;
        this.requestStatusDesc = requestStatusDesc;
        this.messageStatusCode = messageStatusCode;
        this.messageStatusName = messageStatusName;
        this.messageStatusDesc = messageStatusDesc;
    }
}
