package com.proj.version2.service.itfc;

import com.proj.version2.model.UserDetail;

public interface UserDetailService {
	//�����û���Ϣ
	
	//��ѯĳ�˵���ϸ��Ϣ
	public UserDetail queryBindList(Integer id);
	//����ĳ�˵�������Ϣ
	public boolean BindNewAcount(Integer userid,Integer source,String name);
}
