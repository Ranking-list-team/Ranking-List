package com.proj.version2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proj.version2.model.User;
import com.proj.version2.service.itfc.UserService;

public class userClient {
	
	private static void testAdd(UserService userService) {
		String name = "duyinuo";
		String pwd = "yangyang";
		userService.saveUser(name, pwd);
		
	}
	
	private static User testQuery(UserService userService) {
		User user = userService.queryUser(1);
		printUser(user);
		
		return user;
	}
	
	private static void printUser(User user) {
		StringBuilder sb = new StringBuilder();
		sb.append("username: " + user.getUsername() + " ");
		sb.append("password: " + user.getPassword() + " ");
		
		System.out.println(sb.toString());
	}
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		UserService userService = (UserService)ac.getBean("userService");
		
		testQuery(userService);
	}
}
