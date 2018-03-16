package com.proj.version2.service.itfc;

import com.proj.version2.model.UserDetail;

public interface UserDetailService {
	//插入用户信息
	
	//查询某人的详细信息
	public UserDetail queryBindList(Integer id);
	//更新某人的相信信息
	public boolean BindNewAcount(Integer userid,Integer source,String name);
}
