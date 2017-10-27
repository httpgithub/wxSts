package com.baosight.wechat;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/26 13:57  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class WeChatUtilTest {
	@Autowired
	private WeChatUtil weChatUtil;

	@Test
	public void getWeChatAccessToken_test() throws IOException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, URISyntaxException {
		System.out.println(weChatUtil.getWeChatAccessToken());
	}

	@Test
	//{"errcode":0,"errmsg":"ok"}
	public void createMenu_test() throws IOException, InvocationTargetException, NoSuchMethodException, IllegalAccessException, URISyntaxException {
		String s = " {\n" +
				"    \"button\": [\n" +
				"        {\n" +
				"            \"type\": \"click\",\n" +
				"            \"name\": \"今日歌曲\",\n" +
				"            \"key\": \"V1001_TODAY_MUSIC\"\n" +
				"        },\n" +
				"        {\n" +
				"            \"name\": \"菜单\",\n" +
				"            \"sub_button\": [\n" +
				"                {\n" +
				"                    \"type\": \"view\",\n" +
				"                    \"name\": \"登陆\",\n" +
				"                    \"url\": \"http://b32830b1.ngrok.io/authorize/\"\n" +
				"                },\n" +
				"                {\n" +
				"                    \"type\": \"click\",\n" +
				"                    \"name\": \"赞一下我们\",\n" +
				"                    \"key\": \"V1001_GOOD\"\n" +
				"                }\n" +
				"            ]\n" +
				"        }\n" +
				"    ]\n" +
				"}";

		weChatUtil.createMenu(s);
	}


}
