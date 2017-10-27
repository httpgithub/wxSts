package com.baosight.wechat.model;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/26 20:12  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
@Getter
@Setter
public class Message implements Serializable {
	@JSONField(name = "ToUserName")
	private String ToUserName;

	@JSONField(name = "FromUserName")
	private String FromUserName;

	@JSONField(name = "CreateTime")
	private String CreateTime;

	@JSONField(name = "MsgType")
	private String MsgType;

	@JSONField(name = "Content")
	private String Content;

	@JSONField(name = "MsgId")
	private String MsgId;

}
