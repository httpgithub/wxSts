package com.baosight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/26 11:32  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
@Controller
public class HomeController {
	@RequestMapping(value = {"/", ""})
	public String toHomePage() {
		return "pages/index";
	}

	@RequestMapping(value = {"/login"})
	public String toLoginPage() {
		return "pages/login";
	}

	@RequestMapping(value = {"/about"})
	public String toAboutPage() {
		return "pages/about";
	}

}
