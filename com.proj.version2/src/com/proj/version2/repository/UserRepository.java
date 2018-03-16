package com.proj.version2.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.proj.version2.model.*;

public interface UserRepository extends JpaRepository<User, Integer> {

}
