package com.baosight.wechat.message.model;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Getter;
import lombok.Setter;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/31 10:31  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 * <p/>TODO 说明类用途
 */
@Getter
@Setter
public class NewsMessageArticle implements Serializable {
	@JSONField(name = "Title")
	private String Title;

	@JSONField(name = "Description")
	private String Description;

	@JSONField(name = "PicUrl")
	private String PicUrl;

	@JSONField(name = "Url")
	private String Url;
}
