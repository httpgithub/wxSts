package com.baosight.util;

import java.util.Date;

/**
 * <p/>Project Name:wxSts  
 * <p/>cretate user:mayxys  
 * <p/>Date:2017/10/26 15:07  
 * <p/>Copyright (c) 2017, All Rights Reserved.
 */
public class DateUtil {
	public static long diffSeconds(Date date1, Date date2) {
		return (date2.getTime() - date1.getTime()) / 1000;
	}
}
