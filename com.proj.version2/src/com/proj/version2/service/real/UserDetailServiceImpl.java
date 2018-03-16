package com.proj.version2.service.real;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.version2.model.UserDetail;
import com.proj.version2.repository.UserDetailRepository;
import com.proj.version2.service.itfc.UserDetailService;

@Service("userDetailService")
public class UserDetailServiceImpl implements UserDetailService{
	
	@Autowired 
	private UserDetailRepository userDetailRepository;
	
	@Override
	public UserDetail queryBindList(Integer id) {

		return userDetailRepository.findByUserId(id);
	}

	@Override
	public boolean BindNewAcount(Integer userId, Integer source, String name) {

		UserDetail user = userDetailRepository.findByUserId(userId);
		if(user == null || (source != 1 && source != 2 && source != 3))
			return false;
		else if(source == 1)
			user.setMicroblogId(name);
		else if(source == 2)
			user.setWechatId(name);
		else if(source == 3)
			user.setZhihuId(name);
		
		userDetailRepository.save(user);
		
		return true;
	}

}
