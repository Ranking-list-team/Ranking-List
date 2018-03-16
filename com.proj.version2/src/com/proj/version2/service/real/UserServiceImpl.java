package com.proj.version2.service.real;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.version2.model.User;
import com.proj.version2.repository.UserRepository;
import com.proj.version2.service.itfc.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void saveUser(String username, String password) {
		
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		
		userRepository.save(user);
		
	}

	@Override
	public User queryUser(Integer userId) {
		
		return userRepository.findOne(userId);
		
	}

}
