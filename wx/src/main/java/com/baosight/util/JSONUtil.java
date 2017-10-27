package com.baosight.util;


import java.lang.reflect.Type;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.parser.deserializer.FieldTypeResolver;
import com.alibaba.fastjson.serializer.NameFilter;
import com.baosight.wechat.model.Message;
import com.thoughtworks.xstream.XStream;
import org.apache.commons.collections.CollectionUtils;
import org.jooq.lambda.Unchecked;

/**
 * json操作工具类
 *
 */
public final class JSONUtil {

	public static <T> T xml2Bean(String xml, Class t, List<String> omitFields) {
		XStream xstream = new XStream();
		if (CollectionUtils.isNotEmpty(omitFields)) {
			omitFields.forEach(Unchecked.consumer(d -> {
				xstream.omitField(t, d);
				xstream.omitField(t, d);
			}));

		}
		xstream.alias("xml", t);

		return (T) xstream.fromXML(xml);
	}

	public static <T> T xml2Bean(String xml, Class t) {
		return xml2Bean(xml, t, null);
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
		Message message = JSONUtil.xml2Bean(s, Message.class);
		//System.out.println(JSON.toJSON(message));
		System.out.println(JSONUtil.toJson(message));
		*//*Message message = new Message();
		message.setContent("11111");
		XStream xstream = new XStream();
		xstream.alias("xml",Message.class);
		xstream.omitField(Message.class,"PicUrl");
		xstream.omitField(Message.class,"MediaId");
		System.out.println(xstream.toXML(message));
		System.out.println(xstream.fromXML(s));*//*
	}
*/

}
