package com.wherezip.model.report;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class AlimtalkSendRequestLookupResponseBody {

    private String requestId;
    private String statusCode;
    private String statusName;
    private List<AlimtalkSendRequestLookupResponseMessage> alimtalkReportResponseMessages;

    @Builder
    public AlimtalkSendRequestLookupResponseBody(String requestId,
                                                 String statusCode,
                                                 String statusName,
                                                 List<AlimtalkSendRequestLookupResponseMessage> alimtalkReportResponseMessages) {
        this.requestId = requestId;
        this.statusCode = statusCode;
        this.statusName = statusName;
        this.alimtalkReportResponseMessages = alimtalkReportResponseMessages;
    }

}
