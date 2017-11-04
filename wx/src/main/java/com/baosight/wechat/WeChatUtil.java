package com.baosight.wechat;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.baosight.util.DateUtil;
import com.baosight.util.HttpUtil;
import com.baosight.util.JSONUtil;
import com.baosight.wechat.config.WeChatAccessTokenProperties;
import com.baosight.wechat.config.WeChatAuthProperties;
import com.baosight.wechat.model.UserAccessTokenModel;
import com.baosight.wechat.model.WechaUserInfoModel;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.collections.map.HashedMap;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.client.utils.URIBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/26 12:53  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
@EnableConfigurationProperties({WeChatAccessTokenProperties.class, WeChatAuthProperties.class})
@Component
public class WeChatUtil {
	private static Map<String, WeChatAccessToken> WECHATACCESSTOKEN = new ConcurrentHashMap<>();

	private static String WECHATACCESSTOKEN_KEY = "WeChatAccessToken";

	private static long DEFAULTEXPIRES = 7200L;


	@Autowired
	private WeChatAccessTokenProperties weChatAccessTokenProperties;

	@Autowired
	private WeChatAuthProperties weChatAuthProperties;

	private String baseWeChatUrl = "https://api.weixin.qq.com/cgi-bin/";


	public String getWeChatAccessToken() throws IOException, URISyntaxException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
		if (false) {
			return "Ze-LdRDiMKW1Rqgy_-1tZcYYhkstZIzS7noYSsXkLzGiLYAvVnlTpsb3ZAtUf7UrvtXStGWYyfmC_D1ehavVkLFuDGkWfuRcFiM7apntKzyHHm_0B__4BVo9Xn6JA-fNXVJaAHACAO";
		}
		else {
			int reTry = 0;
			if (reTry > 3) {
				throw new IllegalAccessError("access_token获取失败");
			}
			WeChatAccessToken token = WECHATACCESSTOKEN.get(WECHATACCESSTOKEN_KEY);
			if (Objects.nonNull(token) && !asertTokenExpires(token)) {
				return token.accessToken;
			}
			Map<String, String> paramMap = BeanUtils.describe(weChatAccessTokenProperties);
			String result = HttpUtil.doGet(baseWeChatUrl + weChatAccessTokenProperties.getShortUrl(), paramMap);
			JSONObject jsonObject = JSON.parseObject(result);
			if (jsonObject.containsKey("access_token")) {

				return jsonObject.getString("access_token");
			}
			else {
				reTry++;
				getWeChatAccessToken();
			}
			return StringUtils.EMPTY;
		}

	}

	public void createMenu(String jsonString) throws URISyntaxException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, IOException {
		String url = baseWeChatUrl + "menu/create?access_token=" + getWeChatAccessToken();
		JSONObject jsonObject = JSON.parseObject(jsonString);
		HttpUtil.doPost(url, jsonObject);
	}

	//https://open.weixin.qq.com/connect/oauth2/authorize?appid=APPID&redirect_uri=REDIRECT_URI&response_type=code&scope=SCOPE&state=STATE#wechat_redirect 若提示“该链接无法访问”，请检查参数是否填写错误，是否拥有scope参数对应的授权作用域权限。
	//https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421140842
	public String getAuthorizeUrl() throws IOException, URISyntaxException {
		String baseUrl = "https://open.weixin.qq.com/connect/oauth2/authorize";
		Map<String, String> param = new HashedMap();
		param.put("appid", weChatAccessTokenProperties.getAppid());
		param.put("redirect_uri", weChatAuthProperties.getRedirect_uri());
		param.put("response_type", "code");
		param.put("scope", "snsapi_userinfo");
		//param.put("wechat_redirect","#wechat_redirect");
		URIBuilder uriBuilder = new URIBuilder(baseUrl);
		for (String key : param.keySet()) {
			uriBuilder.addParameter(key, param.get(key));
		}
		uriBuilder.setFragment("wechat_redirect");
		return uriBuilder.build().toString();
	}

	/**
	 * https://mp.weixin.qq.com/wiki?t=resource/res_main&id=mp1421140842
	 * 第二步：通过code换取网页授权access_token
	 * https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code
	 * @return
	 */
	public UserAccessTokenModel getUserAccessToken(String code) throws IOException, URISyntaxException {
		Map<String, String> param = new HashedMap();
		param.put("appid", weChatAccessTokenProperties.getAppid());
		param.put("secret", weChatAccessTokenProperties.getSecret());
		param.put("code", code);
		param.put("grant_type", "authorization_code");
		String result = HttpUtil.doGet(weChatAuthProperties.getOauthUrl(), param);
		return JSONUtil.toBean(result, UserAccessTokenModel.class);
	}

	/**
	 * 第四步：拉取用户信息(需scope为 snsapi_userinfo)
	 * http：GET（请使用https协议） https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN
	 * @return
	 */
	public WechaUserInfoModel getUserinfo(UserAccessTokenModel userAccessTokenModel) throws IOException, URISyntaxException {
		Map<String, String> param = new HashedMap();
		param.put("access_token", userAccessTokenModel.getAccess_token());
		param.put("openid", userAccessTokenModel.getOpenid());
		param.put("lang", weChatAuthProperties.getLang());
		String json = HttpUtil.doGet(weChatAuthProperties.getUserInfoUrl(), param);
		return JSONUtil.toBean(json, WechaUserInfoModel.class);
	}

	private class WeChatAccessToken {
		private String accessToken;

		private Date createTime;

		public String getAccessToken() {
			return accessToken;
		}

		public void setAccessToken(String accessToken) {
			this.accessToken = accessToken;
		}

		public Date getCreateTime() {
			return createTime;
		}

		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
		}
	}

	public boolean asertTokenExpires(WeChatAccessToken weChatAccessToken) {
		assert Objects.nonNull(weChatAccessToken);
		Date createTime = weChatAccessToken.getCreateTime();
		long diffSeconds = DateUtil.diffSeconds(new Date(), createTime);
		long expires = StringUtils.isNotEmpty(weChatAccessTokenProperties.getExpires()) ? Long.valueOf(weChatAccessTokenProperties.getExpires()) : DEFAULTEXPIRES;
		if (diffSeconds > expires - 200) {
			return true;
		}
		else {
			return false;
		}
	}
}
