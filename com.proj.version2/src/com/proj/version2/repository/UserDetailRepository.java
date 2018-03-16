package com.proj.version2.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.version2.model.*;

public interface UserDetailRepository extends JpaRepository<UserDetail, Integer>{
	
	public UserDetail findByUserId(Integer userId);
}
