package com.onet.solutions.services;

import java.util.List;

import com.onet.solutions.entity.Task;
import com.onet.solutions.entity.User;
import com.onet.solutions.dao.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
	
	@Autowired
	private TaskRepository taskRepository;
	
	public void addTask(Task task, User user) {
		task.setUser(user);
		taskRepository.save(task);
	}
	
	public List<Task>  findUserTask(User user){
		
		return taskRepository.findByUser(user);
	}
	
public List<Task>  findTasks(){
		
		return taskRepository.findAll();
	}


}
