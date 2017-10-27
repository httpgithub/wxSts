package com.baosight.wechat.model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/27 14:33  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
@Getter
@Setter
public class WechaUserInfoModel implements Serializable {
	private String openid;

	private String nickname;

	private String sex;

	private String language;

	private String city;

	private String province;

	private String country;

	private String headimgurl;

	private String privilege;

	private String unionid;
}
