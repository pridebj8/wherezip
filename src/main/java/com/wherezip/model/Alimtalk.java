package com.wherezip.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class Alimtalk {

    private String plusFriendId;
    private String templateCode;
    private List<Message> messages;
    private String reserveTime;
    private String reserveTimeZone;
    private String scheduleCode;

    @Builder
    public Alimtalk(String plusFriendId, String templateCode, List<Message> messages, String reserveTime, String reserveTimeZone, String scheduleCode) {
        this.plusFriendId = plusFriendId;
        this.templateCode = templateCode;
        this.messages = messages;
        this.reserveTime = reserveTime;
        this.reserveTimeZone = reserveTimeZone;
        this.scheduleCode = scheduleCode;
    }
}
