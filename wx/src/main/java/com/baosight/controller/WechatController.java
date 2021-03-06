package com.baosight.controller;

import static org.slf4j.LoggerFactory.getLogger;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URISyntaxException;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.baosight.wechat.WeChatUtil;
import com.baosight.wechat.message.IWeChatMessageResponse;
import com.baosight.wechat.message.model.BaseMessage;
import com.baosight.wechat.message.model.MessageUtil;
import com.baosight.wechat.model.UserAccessTokenModel;
import com.baosight.wechat.model.WechaUserInfoModel;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/26 19:27  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
@Controller
public class WechatController {

	private static final Logger log = getLogger(WechatController.class);

	@Autowired
	private WeChatUtil weChatUtil;

	@Autowired
	private IWeChatMessageResponse iWeChatMessageResponse;

	/**
	 * https://gist.github.com/binjoo/5466968
	 * http://www.jianshu.com/p/56d8906ace28
	 * @param request
	 * @param response
	 * @throws IOException
	 */
	@RequestMapping("/authToken")
	public void authToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
		BufferedReader br = request.getReader();
		if (Objects.nonNull(br)) {
			String xml = br.lines().collect(Collectors.joining());
			if (StringUtils.isNotEmpty(xml)) {
				if (log.isInfoEnabled()) {
					log.info("微信接口请求报文:{}", xml);
				}
				//https://quanke.gitbooks.io/design-pattern-java/%E5%B7%A5%E5%8E%82%E4%B8%89%E5%85%84%E5%BC%9F%E4%B9%8B%E7%AE%80%E5%8D%95%E5%B7%A5%E5%8E%82%E6%A8%A1%E5%BC%8F%EF%BC%88%E4%B8%80%EF%BC%89.html
				BaseMessage baseMessage = MessageUtil.weChatXml2Bean(xml, BaseMessage.class);
				String responseXml = MessageUtil.bean2WeChatXml(iWeChatMessageResponse.responseWeChatMessage(baseMessage));
				if (log.isInfoEnabled()) {
					log.info("微信接口返回报文:{}", responseXml);
				}
				response.getWriter().print(responseXml);
			}
			else {
				// 微信加密签名
				String signature = request.getParameter("signature");
				// 随机字符串
				String echostr = request.getParameter("echostr");
				// 时间戳
				String timestamp = request.getParameter("timestamp");
				// 随机数
				String nonce = request.getParameter("nonce");

				response.getWriter().print(echostr);
			}
		}
		else {
			// 微信加密签名
			String signature = request.getParameter("signature");
			// 随机字符串
			String echostr = request.getParameter("echostr");
			// 时间戳
			String timestamp = request.getParameter("timestamp");
			// 随机数
			String nonce = request.getParameter("nonce");

			response.getWriter().print(echostr);
		}

	}

	@RequestMapping("/authorize")
	@ResponseBody
	public void login(HttpServletRequest request, HttpServletResponse response) throws IOException, URISyntaxException {
		String url = weChatUtil.getAuthorizeUrl();
		if (log.isInfoEnabled()) {
			log.info("登陆URL{}", url);
		}
		response.sendRedirect(url);
	}

	//redirect_uri/?code=CODE&state=STATE。
	@RequestMapping("/getCode")
	public String getCode(HttpServletRequest request, HttpServletResponse response) throws IOException, URISyntaxException {
		String code = request.getParameter("code");
		if (log.isInfoEnabled()) {
			log.info("code{}", code);
		}
		/**
		 * {"access_token":"9aL7vXt2lucwbR1psREh-a9SHRqPU8kvurwhUTwzwlY-IZ4X5QvoltKdbALPd1xyrr06rzcYnUXn1tErX9hvdZ89bdIYDaQtZSWaI-G6HjM","expires_in":7200,"refresh_token":"kMyip2s3KMCSFFqo4a7l5IblP3m-BopShFMDD8vte-6vHus4XR8PdRLMg5Z2vBzwHvCOBBWXkOxBPMBS4kuxztYtyQGZeXOcIlefvhthErs","openid":"oDbVpwAvy_ZkU2LODF_5Qvtz45XA","scope":"snsapi_userinfo","unionid":"oNnHe0S9wb4dmF1yBrujRUUm7QtM"}
		 */
		UserAccessTokenModel userAccessTokenModel = weChatUtil.getUserAccessToken(code);
		WechaUserInfoModel wechaUserInfoModel = weChatUtil.getUserinfo(userAccessTokenModel);
		return "pages/login";
	}
}
