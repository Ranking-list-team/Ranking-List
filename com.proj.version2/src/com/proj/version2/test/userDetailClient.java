package com.proj.version2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.proj.version2.model.UserDetail;
import com.proj.version2.service.itfc.UserDetailService;


public class userDetailClient {
	
	private static void printUser(UserDetail user) {
		StringBuilder sb = new StringBuilder();
		sb.append("username: " + user.getMicroblogId() + " ");
		sb.append("password: " + user.getWechatId() + " ");
		sb.append("password: " + user.getZhihuId() + " ");
		System.out.println(sb.toString());
	}
	
	private static void testBindNewAcount(UserDetailService userDetailService) {
		Integer userid = 1020;
		Integer source = 4;
		String name = "spring-boot";
		boolean flag = userDetailService.BindNewAcount(userid, source, name);
		System.out.print(flag);
	}
	
	private static void testQueryBindList(UserDetailService userDetailService) {
		UserDetail user = userDetailService.queryBindList(1020);
		printUser(user);
	}
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserDetailService userService = (UserDetailService)ac.getBean("userDetailService");
		
		testBindNewAcount(userService);
	}
}
