package com.wherezip.model.send;

import lombok.Builder;

public class AlimtalkReserveMessageResponse {

    private String reserveId;
    private String reserveTimeZone;
    private String reserveTime;
    private String reserveStatus;

    @Builder
    public AlimtalkReserveMessageResponse(String reserveId, String reserveTimeZone, String reserveTime, String reserveStatus) {
        this.reserveId = reserveId;
        this.reserveTimeZone = reserveTimeZone;
        this.reserveTime = reserveTime;
        this.reserveStatus = reserveStatus;
    }
}
