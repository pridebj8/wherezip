package com.wherezip.model;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
public class AlimtalkRequestMessage {

    private String countryCode;
    private String to;
    private String content;
    private List<AlimtalkButton> alimtalkButtons;

    @Builder
    public AlimtalkRequestMessage(String countryCode, String to, String content, List<AlimtalkButton> alimtalkButtons){
        this.countryCode = countryCode;
        this.to = to;
        this.content = content;
        this.alimtalkButtons = alimtalkButtons;
    }

}