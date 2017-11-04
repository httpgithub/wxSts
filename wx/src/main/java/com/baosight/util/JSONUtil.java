package com.baosight.util;


import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.thoughtworks.xstream.XStream;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.jooq.lambda.Unchecked;

/**
 * json操作工具类
 *
 */
public final class JSONUtil {


	public static <T> T xml2Bean(String xml, Class t, List<String> omitFields, Map<String, Class> aliasMap) {
		XStream xstream = new XStream();
		if (CollectionUtils.isNotEmpty(omitFields)) {
			omitFields.forEach(Unchecked.consumer(d -> {
				xstream.omitField(t, d);
			}));

		}
		if (MapUtils.isNotEmpty(aliasMap)) {
			aliasMap.entrySet().stream().forEach(d -> xstream.alias(d.getKey(), d.getValue()));
		}

		xstream.ignoreUnknownElements();
		return (T) xstream.fromXML(xml);
	}


	public static <T> String bean2Xml(T t, Map<String, Class> aliasMap) {
		XStream xstream = new XStream();
		if (MapUtils.isNotEmpty(aliasMap)) {
			aliasMap.entrySet().stream().forEach(d -> xstream.alias(d.getKey(), d.getValue()));
		}
		return xstream.toXML(t);
	}

	public static String toJson(Object obj) {
		return JSON.toJSONString(obj);
	}

	public static <T> T toBean(String json, Class<T> t) {
		return JSON.parseObject(json, t);
	}

	/*public static void main(String[] args) {
		String s = "<xml>\n" +
				" <ToUserName><![CDATA[toUser]]></ToUserName>\n" +
				" <FromUserName><![CDATA[fromUser]]></FromUserName>\n" +
				" <CreateTime>1348831860</CreateTime>\n" +
				" <MsgType><![CDATA[image]]></MsgType>\n" +
				" <MsgId>1234567890123456</MsgId>\n" +
				" </xml>";
		TextMessage message = JSONUtil.weChatXml2Bean(s, TextMessage.class);
		//System.out.println(JSON.toJSON(message));
		System.out.println(JSONUtil.toJson(message));
		*//*TextMessage message = new TextMessage();
		message.setContent("11111");
		XStream xstream = new XStream();
		xstream.alias("xml",TextMessage.class);
		xstream.omitField(TextMessage.class,"PicUrl");
		xstream.omitField(TextMessage.class,"MediaId");
		System.out.println(xstream.toXML(message));
		System.out.println(xstream.fromXML(s));*//*
	}
*/

}
