package com.wherezip.model;

import lombok.Builder;
import lombok.Getter;

@Getter
public class Button {

    private String type;
    private String name;
    private String linkMobile;
    private String linkPc;
    private String schemeIos;
    private String schemeAndroid;

    @Builder
    public Button(String type, String name, String linkMobile, String linkPc, String schemeIos, String schemeAndroid) {
        this.type = type;
        this.name = name;
        this.linkMobile = linkMobile;
        this.linkPc = linkPc;
        this.schemeIos = schemeIos;
        this.schemeAndroid = schemeAndroid;
    }

}
