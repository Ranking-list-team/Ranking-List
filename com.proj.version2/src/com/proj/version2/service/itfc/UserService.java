package com.proj.version2.service.itfc;

import com.proj.version2.model.User;

public interface UserService {
	
	//插入用户（用户名和密码）
	public void saveUser(String name, String password);
	//查询用户名对应的密码
	public User queryUser(Integer userId);
	
}
