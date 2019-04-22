package com.mayangcheng.test;

import org.junit.Test;

import com.mayangcheng.StringUtil;

public class TestStringUtil {
	
	
	@Test
	public  void test1(){
		StringUtil su   = new StringUtil();
		boolean flag  = su.isMobile("1521aaa0094480");
		System.out.println(flag);
		
		boolean flag2 = su.isEmail("myc@yahoo.com.cn");
		System.out.println(flag2);
	
		String newStr = su.reverse("abcdef");
		System.out.println(newStr);
	}
	
	
}
