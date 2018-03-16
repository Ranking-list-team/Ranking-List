package com.proj.version2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.version2.model.*;

public interface ArticleScoreRepository extends JpaRepository<ArticleScore, Integer>{
	public List<ArticleScore> findSource(Integer period, Integer id, Integer source);
	public List<ArticleScore> findSourceNoId(Integer period, Integer source);
	public List<ArticleScore> findSourceNoPeriod(Integer id, Integer source);
}
