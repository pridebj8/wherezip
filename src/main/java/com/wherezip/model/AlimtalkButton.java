package com.wherezip.model;

import com.wherezip.model.type.ButtonType;
import lombok.Builder;
import lombok.Getter;

@Getter
public class AlimtalkButton {

    private ButtonType type;
    private String name;
    private String linkMobile;
    private String linkPc;
    private String schemeIos;
    private String schemeAndroid;

    @Builder
    public AlimtalkButton(ButtonType type, String name, String linkMobile, String linkPc, String schemeIos, String schemeAndroid) {
        this.type = type;
        this.name = name;
        this.linkMobile = linkMobile;
        this.linkPc = linkPc;
        this.schemeIos = schemeIos;
        this.schemeAndroid = schemeAndroid;
    }

}
