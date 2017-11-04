package com.baosight.wechat.message;

import java.util.Date;

import com.baosight.wechat.message.model.BaseMessage;
import com.baosight.wechat.message.model.TextMessage;

import org.springframework.stereotype.Service;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/31 9:56  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 * <p/>TODO 说明类用途
 */
@Service
public class DBWeChatMessageResponse implements IWeChatMessageResponse {
	@Override
	public BaseMessage responseWeChatMessage(BaseMessage baseMessage) {
		TextMessage responseTextMessage = new TextMessage();
		responseTextMessage.setContent("test");
		responseTextMessage.setCreateTime(System.currentTimeMillis() + "");
		responseTextMessage.setFromUserName(baseMessage.getToUserName());
		responseTextMessage.setToUserName(baseMessage.getFromUserName());
		return responseTextMessage;
	}
}
