package com.proj.version2.service.real;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.version2.model.ArticleScore;
import com.proj.version2.repository.ArticleScoreRepository;
import com.proj.version2.service.itfc.ArticleScoreService;

@Service("articleScoreService")
public class ArticleScoreServiceImpl implements ArticleScoreService{

	@Autowired
	private ArticleScoreRepository articleScorRepository;
	
	@Override
	public List<ArticleScore> getArticleScoresById(Integer period, Integer id, Integer source) {
		
		return articleScorRepository.findSource(period, id, source);
	}

	@Override
	public List<ArticleScore> getArticlesByTime(Integer period, Integer source) {
		return articleScorRepository.findSourceNoId(period, source);
	}

	@Override
	public List<ArticleScore> getArticleDetailById(Integer userId, Integer source) {
		
		return articleScorRepository.findSourceNoPeriod(userId, source);
	}
}
