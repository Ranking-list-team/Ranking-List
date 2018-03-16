package com.proj.version2.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.version2.model.*;

public interface PlatformScoreRepository extends JpaRepository<PlatformScore, Integer> {
	public List<PlatformScore> findSource(Integer period, Integer id, Integer source);
	public List<PlatformScore> findSourceNoId(Integer period,Integer source);
}
