package com.proj.version2.service.itfc;

import java.util.List;

import com.proj.version2.model.*;

public interface PlatformScoreService {
	//��ѯĳ����һ��ʱ���ڵ�ƽ̨�÷�
	public List<PlatformScore> getPersonScoresById(Integer peroid, Integer id, Integer source);
	//
	public List<PlatformScore> getPeopleByTime(Integer peroid,Integer source);
}
