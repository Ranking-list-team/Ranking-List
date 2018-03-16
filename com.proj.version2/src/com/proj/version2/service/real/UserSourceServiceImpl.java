package com.proj.version2.service.real;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.version2.model.UserSource;
import com.proj.version2.repository.UserSourceRepository;
import com.proj.version2.service.itfc.UserSourceService;

@Service("userSourceService")
public class UserSourceServiceImpl implements UserSourceService{
	
	@Autowired
	private UserSourceRepository userSourceRepository;

	@Override
	public List<UserSource> getPersonDetailById(Integer userId, Integer source) {
		
		return userSourceRepository.findSource(userId, source);
	}
	
}
