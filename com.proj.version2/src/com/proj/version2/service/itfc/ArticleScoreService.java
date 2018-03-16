package com.proj.version2.service.itfc;

import java.util.List;

import com.proj.version2.model.ArticleScore;


public interface ArticleScoreService {
	//��ѯĳ����һ��ʱ���ڵ����µ÷�
	public List<ArticleScore> getArticleScoresById(Integer period, Integer id, Integer source);
	//���޶�ĳ����
	public List<ArticleScore> getArticlesByTime(Integer period, Integer source);
	//ĳ�˵���
	public List<ArticleScore> getArticleDetailById(Integer userId, Integer source);
	
}
