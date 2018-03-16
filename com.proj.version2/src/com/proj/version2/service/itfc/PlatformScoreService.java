package com.proj.version2.service.itfc;

import java.util.List;

import com.proj.version2.model.*;

public interface PlatformScoreService {
	//查询某人在一段时间内的平台得分
	public List<PlatformScore> getPersonScoresById(Integer peroid, Integer id, Integer source);
	//
	public List<PlatformScore> getPeopleByTime(Integer peroid,Integer source);
}
