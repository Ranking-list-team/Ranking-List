package com.proj.version2.service.itfc;

import java.util.List;


import com.proj.version2.model.UserSource;

public interface UserSourceService {
	//��ѯĳ�����һ����û�����select
	public List<UserSource> getPersonDetailById(Integer userId,Integer source);
	//��ĳ�˸�ƽ̨������ݸ��µ���������ֵupdate
}
