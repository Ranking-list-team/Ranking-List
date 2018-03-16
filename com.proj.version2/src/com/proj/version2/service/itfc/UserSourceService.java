package com.proj.version2.service.itfc;

import java.util.List;


import com.proj.version2.model.UserSource;

public interface UserSourceService {
	//查询某人最近一天的用户对象select
	public List<UserSource> getPersonDetailById(Integer userId,Integer source);
	//把某人各平台相关数据更新到当天最新值update
}
