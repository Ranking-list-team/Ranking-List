package com.proj.version2.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.version2.model.*;

public interface UserSourceRepository extends JpaRepository<UserSource, Integer>{
	public List<UserSource> findSource(Integer id, Integer source);
}
