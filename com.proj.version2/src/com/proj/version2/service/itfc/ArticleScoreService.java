package com.proj.version2.service.itfc;

import java.util.List;

import com.proj.version2.model.ArticleScore;


public interface ArticleScoreService {
	//查询某人在一段时间内的文章得分
	public List<ArticleScore> getArticleScoresById(Integer period, Integer id, Integer source);
	//不限定某个人
	public List<ArticleScore> getArticlesByTime(Integer period, Integer source);
	//某人当天
	public List<ArticleScore> getArticleDetailById(Integer userId, Integer source);
	
}
