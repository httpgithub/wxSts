package com.baosight.wechat.message.model;

import com.alibaba.fastjson.annotation.JSONField;
import com.baosight.wechat.message.model.BaseMessage;
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
public class VoiceMessage extends BaseMessage {
	@JSONField(name = "MediaId")
	private String MediaId;

	@JSONField(name = "Format")
	private String Format;

	public VoiceMessage() {
		this.setMsgType("voice");
	}
}
