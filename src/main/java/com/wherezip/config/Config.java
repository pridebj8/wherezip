package com.wherezip.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Setter
@Getter
@ConfigurationProperties(prefix = "wherezip")
public class Config {

    private String sensApiUrl;

    private String sensServiceId;

    private String sensAccessKeyId;

    private String sensSecretKey;

}
