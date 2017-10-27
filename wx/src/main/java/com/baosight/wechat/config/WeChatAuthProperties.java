package com.baosight.wechat.config;

import lombok.Getter;
import lombok.Setter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/27 13:37  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
@ConfigurationProperties(prefix = "weChat.auth")
@Getter
@Setter
public class WeChatAuthProperties {
	private String redirect_uri;
	private String oauthUrl;
	private String userInfoUrl;
	private String lang="zh_CN";
}
