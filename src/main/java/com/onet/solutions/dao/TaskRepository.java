package com.onet.solutions.dao;

import java.util.List;

import com.onet.solutions.entity.Task;
import com.onet.solutions.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository  extends JpaRepository<Task, Long>{

	List<Task> findByUser(User user); 
	
	List<Task> findAll(); 
	
}
