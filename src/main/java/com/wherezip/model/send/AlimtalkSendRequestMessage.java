package com.wherezip.model.send;

import com.wherezip.model.AlimtalkButton;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
public class AlimtalkSendRequestMessage {

    private String countryCode;
    private String to;
    private String content;
    private List<AlimtalkButton> alimtalkButtons;

    @Builder
    public AlimtalkSendRequestMessage(String countryCode,
                                      String to,
                                      String content,
                                      List<AlimtalkButton> alimtalkButtons){
        this.countryCode = countryCode;
        this.to = to;
        this.content = content;
        this.alimtalkButtons = alimtalkButtons;
    }

}
