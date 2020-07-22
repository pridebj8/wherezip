package com.wherezip.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class AlimtalkRequestBody {

    private String plusFriendId;
    private String templateCode;
    private List<AlimtalkRequestMessage> alimtalkRequestMessages;
    private String reserveTime;
    private String reserveTimeZone;
    private String scheduleCode;

    @Builder
    public AlimtalkRequestBody(String plusFriendId, String templateCode, List<AlimtalkRequestMessage> alimtalkRequestMessages, String reserveTime, String reserveTimeZone, String scheduleCode) {
        this.plusFriendId = plusFriendId;
        this.templateCode = templateCode;
        this.alimtalkRequestMessages = alimtalkRequestMessages;
        this.reserveTime = reserveTime;
        this.reserveTimeZone = reserveTimeZone;
        this.scheduleCode = scheduleCode;
    }
}
