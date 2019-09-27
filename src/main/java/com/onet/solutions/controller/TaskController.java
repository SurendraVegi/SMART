package com.onet.solutions.controller;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.onet.solutions.entity.Task;

import com.onet.solutions.entity.User;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.onet.solutions.services.TaskService;
import com.onet.solutions.services.UserService;

@Controller
public class TaskController {
	public final Logger log = LoggerFactory.getLogger(this.getClass());

	 @Autowired
	 private TaskService taskService;
	 @Autowired
	 private UserService  userService;
	 
	 @GetMapping("/task/viewTask")
		public String showProfilePage(Model model, Principal principal) {
			
			model.addAttribute("tasks", taskService.findTasks());
			
			log.info("taskss :::::::::"+taskService.findTasks());
			
			
			return "task/viewTask";
		}
	 @GetMapping("/task/myTask")
		public String showMyTask(Model model, Principal principal) {
			
			String email = principal.getName();
			User user = userService.findOne(email);
			
			model.addAttribute("tasks", taskService.findUserTask(user));
			
			//log.info("taskss :::::::::"+taskService.findTasks());
			
			
			return "task/viewTask";
		}
	 
	 @GetMapping("/task/addTask")
 public String taskForm(String email, Model model, HttpSession session) {
		 
		 session.setAttribute("email", email); 
		 model.addAttribute("task", new Task());
		 return "task/taskForm";
		 
	 }
	 
	 
	 @PostMapping("/task/addTask")
	 public String addTask(@Valid @ModelAttribute("task") Task task,BindingResult bindingResult, HttpSession session) {
		 if(bindingResult.hasErrors()) {
			 
			 log.info("issue in binding result");
			 
			 List<FieldError> errors = bindingResult.getFieldErrors();
			    for (FieldError error : errors ) {
			    	log.info (error.getObjectName() + " Binding Errors " + error.getDefaultMessage());
			    } 
			 return "task/taskForm";
		 }
		 String email = (String) session.getAttribute("email");
		 taskService.addTask(task, userService.findOne(email));
		 		 
		
		 
		return  "redirect:/task/viewTask";
	 }
}
