package com.proj.version2.service.real;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.version2.model.PlatformScore;
import com.proj.version2.repository.PlatformScoreRepository;
import com.proj.version2.service.itfc.PlatformScoreService;

@Service("platformScoreService")
public class PlatformScoreServiceImpl implements PlatformScoreService {

	@Autowired
	private PlatformScoreRepository platformScoreRepository;
	
	@Override
	public List<PlatformScore> getPersonScoresById(Integer peroid, Integer id, Integer source) {
		List<PlatformScore> list = platformScoreRepository.findSource(peroid,  id, source);
		return list;
	}

	@Override
	public List<PlatformScore> getPeopleByTime(Integer period, Integer source) {
		
		return platformScoreRepository.findSourceNoId(period,source);
	}

}
