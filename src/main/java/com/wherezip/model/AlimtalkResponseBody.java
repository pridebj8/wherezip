package com.wherezip.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class AlimtalkResponseBody {

    private String requestId;
    private String requestTime;
    private String statusCode;
    private String statusName;
    private List<AlimtalkResponseMessasge> responseMessasges;

    @Builder
    public AlimtalkResponseBody(String requestId, String requestTime, String statusCode, String statusName, List<AlimtalkResponseMessasge> responseMessasges){
        this.requestId = requestId;
        this.requestTime = requestTime;
        this.statusCode = statusCode;
        this.statusCode = statusName;
        this.responseMessasges = responseMessasges;
    }

}
