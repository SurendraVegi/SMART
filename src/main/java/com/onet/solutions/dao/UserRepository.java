package com.onet.solutions.dao;

import java.util.List;

import com.onet.solutions.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository  extends JpaRepository<User, String> {

	List<User> findByNameLike(String name); 
	

}
