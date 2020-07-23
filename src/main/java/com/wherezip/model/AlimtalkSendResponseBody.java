package com.wherezip.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class AlimtalkSendResponseBody {

    private String requestId;
    private String requestTime;
    private String statusCode;
    private String statusName;
    private List<AlimtalkSendResponseMessasge> responseMessasges;

    @Builder
    public AlimtalkSendResponseBody(String requestId,
                                    String requestTime,
                                    String statusCode,
                                    String statusName,
                                    List<AlimtalkSendResponseMessasge> responseMessasges){
        this.requestId = requestId;
        this.requestTime = requestTime;
        this.statusCode = statusCode;
        this.statusCode = statusName;
        this.responseMessasges = responseMessasges;
    }

}
