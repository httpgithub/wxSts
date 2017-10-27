package com.baosight.wechat.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/27 14:16  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
@Getter
@Setter
public class UserAccessTokenModel implements Serializable {
	private String access_token;

	private String expires_in;

	private String refresh_token;

	private String openid;

	private String scope;

	private String unionid;
}
