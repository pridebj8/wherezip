package com.wherezip.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class Message {

    private String countryCode;
    private String to;
    private String content;
    private List<Button> buttons;

    @Builder
    public Message(String countryCode, String to, String content, List<Button> buttons){
        this.countryCode = countryCode;
        this.to = to;
        this.content = content;
        this.buttons = buttons;
    }

}
