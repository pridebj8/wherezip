package com.wherezip.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Setter
@Getter
@ConfigurationProperties(prefix = "wherezip")
@Component
public class Config {

    private String plusFriendId;

    private String sensApiUrl;

    private String sensServiceId;

    private String sensAccessKeyId;

    private String sensSecretKey;

}
