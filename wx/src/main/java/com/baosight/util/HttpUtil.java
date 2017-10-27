package com.baosight.util;

import static org.slf4j.LoggerFactory.getLogger;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/26 14:23  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 * //http://www.baeldung.com/httpclient-guide
 //https://hc.apache.org/httpcomponents-client-ga/quickstart.html
 */
public class HttpUtil {
	private static final Logger log = getLogger(HttpUtil.class);

	public static String doGet(String url) throws IOException, URISyntaxException {
		return doGet(url, null);
	}

	public static String doGet(String url, Map<String, String> param) throws IOException, URISyntaxException {
		CloseableHttpClient httpclient = HttpClients.createDefault();

		URIBuilder uriBuilder = new URIBuilder(url);
		if (MapUtils.isNotEmpty(param)) {
			for (String key : param.keySet()) {
				uriBuilder.addParameter(key, param.get(key));
			}
		}

		HttpGet httpGet = new HttpGet(uriBuilder.build());
		String responseBody = StringUtils.EMPTY;
		try {
			if (log.isInfoEnabled()) {
				log.info("请求参数{}", httpGet.getURI());
			}
			responseBody = (String) httpclient.execute(httpGet, getResponseHandler());
			if (log.isInfoEnabled()) {
				log.info("响应结果{}", responseBody);
			}

		}
		finally {
			httpclient.close();
		}
		return responseBody;
	}

	public static String doPost(String url, Object param) throws IOException {
		CloseableHttpClient httpclient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		if (Objects.nonNull(param)) {

			if (param instanceof JSONObject) {
				StringEntity s = new StringEntity(param.toString(),"utf-8");
				httpPost.setEntity(s);
			}
			else if (param instanceof Map) {
				Map paramMap = (Map) param;
				if (MapUtils.isNotEmpty(paramMap)) {
					List<NameValuePair> nvps = new ArrayList<>();
					for (Object key : paramMap.keySet()) {
						nvps.add(new BasicNameValuePair(key + "", paramMap.get(key) + ""));
					}

					httpPost.setEntity(new UrlEncodedFormEntity(nvps));
				}
			}
			else {
				throw new IllegalArgumentException("param 参数类型不对");
			}
		}


		String responseBody = StringUtils.EMPTY;

		try {
			if (log.isInfoEnabled()) {
				log.info("请求地址:{},参数{}", url, EntityUtils.toString(httpPost.getEntity()));
			}
			responseBody = (String) httpclient.execute(httpPost, getResponseHandler());
			if (log.isInfoEnabled()) {
				log.info("请求响应:{},结果{}", url, responseBody);
			}
		}
		finally {
			httpclient.close();
		}
		return responseBody;
	}

	public static String doPostMap(String url, Map<String, String> param) throws IOException {
		return doPost(url, param);
	}

	public static String doPostJson(String url, JSONObject jsonObject) throws IOException {
		return doPost(url, jsonObject);
	}

	public static ResponseHandler getResponseHandler() {
		return response -> {
			int status = response.getStatusLine().getStatusCode();
			if (status >= 200 && status < 300) {
				HttpEntity entity = response.getEntity();
				return entity != null ? EntityUtils.toString(entity,"utf-8") : null;
			}
			else {
				throw new ClientProtocolException("Unexpected response status: " + status);
			}
		};
	}
}
