package com.wherezip.model.send;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
public class AlimtalkSendRequestBody {

    private String plusFriendId;
    private String templateCode;
    private List<AlimtalkSendRequestMessage> messages;
    private String reserveTime;
    private String reserveTimeZone;
    private String scheduleCode;

    @Builder
    public AlimtalkSendRequestBody(String plusFriendId,
                                   String templateCode,
                                   List<AlimtalkSendRequestMessage> messages,
                                   String reserveTime,
                                   String reserveTimeZone,
                                   String scheduleCode) {
        this.plusFriendId = plusFriendId;
        this.templateCode = templateCode;
        this.messages = messages;
        this.reserveTime = reserveTime;
        this.reserveTimeZone = reserveTimeZone;
        this.scheduleCode = scheduleCode;
    }
}
