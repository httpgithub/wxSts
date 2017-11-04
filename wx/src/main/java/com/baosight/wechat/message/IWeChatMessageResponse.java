package com.baosight.wechat.message;

import com.baosight.wechat.message.model.BaseMessage;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/31 9:40  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
public interface IWeChatMessageResponse {
	BaseMessage responseWeChatMessage(BaseMessage baseMessage);
}
