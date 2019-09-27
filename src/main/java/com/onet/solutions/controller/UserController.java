package com.onet.solutions.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.onet.solutions.entity.Task;
import com.onet.solutions.entity.User;
import com.onet.solutions.services.UserService;

@Controller
public class UserController {
	public final Logger log = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private UserService userService;
	
	@GetMapping("/users")
	public String listUsers(Model model) {
		
		List<User> usersListUpdated= new ArrayList<User>();
		
		List<User> usersList= userService.findAll();
		for (User user : usersList) {
			Task task = user.gettasks();
			log.info("task"+user.gettasks());
			 if (task != null) {
				 log.info("taskid"+task.getId());
				 user.setStatus("Busy");
				 
		        }	
			 usersListUpdated.add(user);
		}
		
		model.addAttribute("users", usersListUpdated);
		
		
		//User user = usersList.get(0);
		//Task task = user.gettasks();
		return "employee/empList";
	}

}
