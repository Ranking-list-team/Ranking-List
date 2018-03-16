package com.proj.version2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proj.version2.service.itfc.PlatformScoreService;
import com.proj.version2.service.itfc.UserService;

public class platformScoreClient {
	
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		PlatformScoreService userService = (PlatformScoreService)ac.getBean("platformScoreService");
		userService.getPersonScoresById(7, 1020, 1);
		userService.getPeopleByTime(7,  1);
	}
}
