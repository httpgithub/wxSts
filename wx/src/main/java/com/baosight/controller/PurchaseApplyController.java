package com.baosight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/11/2 10:04  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 * 采购申请
 */
@Controller
public class PurchaseApplyController {
	@RequestMapping(value = "/toPurchaseApplyPage")
	public String toPurchaseApplyPage() {
		return "pages/purchaseApply";
	}

	@RequestMapping(value = "/toPurchaseApplyPreviewPage")
	public String toPurchaseApplyPreviewPage() {
		return "pages/purchaseApplyPreview";
	}

}
