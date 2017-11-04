package com.baosight.wechat.message.model;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.thoughtworks.xstream.XStream;
import lombok.Getter;
import lombok.Setter;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/31 10:15  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
@Getter
@Setter
public class NewsMessage extends BaseMessage {
	@JSONField(name = "ArticleCount")
	private String ArticleCount;

	@JSONField(name = "Articles")
	private List<NewsMessageArticle> Articles;

	public NewsMessage() {
		this.setMsgType("news");
	}

	public static void main(String[] args) {
		NewsMessage newsMessage = new NewsMessage();
		XStream xstream = new XStream();
		xstream.alias("xml", NewsMessage.class);
		xstream.alias("item",NewsMessageArticle.class);
		newsMessage.setToUserName("11");
		newsMessage.setCreateTime("1");
		List<NewsMessageArticle> newsMessageArticles = new ArrayList<>();
		NewsMessageArticle newsMessageArticle = new NewsMessageArticle();
		newsMessageArticle.setDescription("1");
		newsMessageArticles.add(newsMessageArticle);
		newsMessage.setArticles(newsMessageArticles);
		System.out.println(xstream.toXML(newsMessage));
	}
}
