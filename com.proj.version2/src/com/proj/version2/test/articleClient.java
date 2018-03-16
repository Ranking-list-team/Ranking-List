package com.proj.version2.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.proj.version2.service.itfc.ArticleScoreService;
import com.proj.version2.service.itfc.PlatformScoreService;

public class articleClient {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		ArticleScoreService articleScoreService = (ArticleScoreService)ac.getBean("articleScoreService");
		//articleScoreService.getArticleScoresById(7, 1020, 1);
		//articleScoreService.getArticlesByTime(7,1);
		articleScoreService.getArticleDetailById(1020, 1);
	}
}
