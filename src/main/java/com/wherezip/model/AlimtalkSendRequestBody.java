package com.wherezip.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class AlimtalkSendRequestBody {

    private String plusFriendId;
    private String templateCode;
    private List<AlimtalkSendRequestMessage> alimtalkRequestMessages;
    private String reserveTime;
    private String reserveTimeZone;
    private String scheduleCode;

    @Builder
    public AlimtalkSendRequestBody(String plusFriendId,
                                   String templateCode,
                                   List<AlimtalkSendRequestMessage> alimtalkRequestMessages,
                                   String reserveTime,
                                   String reserveTimeZone,
                                   String scheduleCode) {
        this.plusFriendId = plusFriendId;
        this.templateCode = templateCode;
        this.alimtalkRequestMessages = alimtalkRequestMessages;
        this.reserveTime = reserveTime;
        this.reserveTimeZone = reserveTimeZone;
        this.scheduleCode = scheduleCode;
    }
}
