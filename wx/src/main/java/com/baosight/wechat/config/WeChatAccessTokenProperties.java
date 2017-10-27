package com.baosight.wechat.config;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/26 12:47  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
@ConfigurationProperties(prefix = "weChat.accessToken")
@Getter
@Setter
public class WeChatAccessTokenProperties {
	private String grant_type = "client_credential";
	private String appid;
	private String secret;
	private String expires="7200";
	private String shortUrl="token";
}
