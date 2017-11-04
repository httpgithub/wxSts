package com.baosight.sts.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import javax.xml.bind.JAXBElement;

import com.baosight.util.JSONUtil;
import org.junit.Test;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/31 19:06  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
public class MobileServiceTest {
	private URL wsdlURL = new URL("http://jmtest.imwork.net:91/ws/MobileService?wsdl");

	public MobileServiceTest() throws MalformedURLException {
	}

	@Test
	public void test() {
		MobileService ss = new MobileService(wsdlURL);
		MobileServicePortType port = ss.getMobileServiceHttpPort();
		Map<String, String> papam = new HashMap<>();
		papam.put("segNo", "J00025");
		papam.put("userId", "admin");
		papam.put("password", "1");

		String json = JSONUtil.toJson(papam);
		System.out.println(json);
		System.out.println(port.login(json));
	}

	@Test
	public void querySTRP0304_test() {
		MobileService ss = new MobileService(wsdlURL);
		MobileServicePortType port = ss.getMobileServiceHttpPort();
		//PageSearchDto<JAXBElement<>> pageSearchDto = new PageSearchDto();
		//System.out.println(port.querySTRP0304(""));
	}
}
