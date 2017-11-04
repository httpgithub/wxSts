package com.baosight.wechat.message.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.baosight.util.JSONUtil;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/30 12:26  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 * <p/>TODO 说明类用途
 */
public class MessageUtil {
	public static <T> T weChatXml2Bean(String xml, Class t, List<String> omitFields) {
		Map<String, Class> aliasMap = new HashMap<>();
		aliasMap.put("xml", t);
		return JSONUtil.xml2Bean(xml, t, omitFields, aliasMap);
	}

	public static <T> T weChatXml2Bean(String xml, Class t) {
		return weChatXml2Bean(xml, t, null);
	}

	public static <T> String bean2WeChatXml(T t) {
		Map<String, Class> aliasMap = new HashMap<>();
		aliasMap.put("xml", t.getClass());
		return JSONUtil.bean2Xml(t, aliasMap);
	}

	public static <T> String bean2WeChatXml(T t, Map<String, Class> aliasMap) {
		aliasMap.put("xml", t.getClass());
		return JSONUtil.bean2Xml(t, aliasMap);
	}
}
