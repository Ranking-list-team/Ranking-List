package com.proj.version2.service.itfc;

import com.proj.version2.model.User;

public interface UserService {
	
	//�����û����û��������룩
	public void saveUser(String name, String password);
	//��ѯ�û�����Ӧ������
	public User queryUser(Integer userId);
	
}
