package com.onet.solutions.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import com.onet.solutions.entity.Employee;
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
	
	@GetMapping("/employee/delete")
    public ModelMap deleteConfirm(@RequestParam(value = "id", required = true) User user ) {
        return new ModelMap("user", user);
    }
	
	 @PostMapping("/employee/delete")
	    public Object delete(@ModelAttribute User user , SessionStatus status) {
	        try{
	        	userService.delete(user);
	        } catch (DataIntegrityViolationException exception) {
	            status.setComplete();
	            return new ModelAndView("error/errorHapus")
	                    .addObject("entityId", user.getName())
	                    .addObject("entityName", "user")
	                    .addObject("errorCause", exception.getRootCause().getMessage())
	                    .addObject("backLink","/users");
	        }
	        status.setComplete();
	        return "redirect:/users";
	    }

	
	@GetMapping("/employee/form")
    public ModelMap editForm(@RequestParam(value = "id", required = false) User user ) {
        if (user == null) {
            user = new User();
        }
        return new ModelMap("user", user);
    }
	
	@PostMapping("/employee/form")
    public String save(@Valid @ModelAttribute("employee") User user , BindingResult errors, SessionStatus status,HttpServletRequest request) {
        if (errors.hasErrors()) {
            return "employee/form";
        }
        userService.save(user);
        @SuppressWarnings("unchecked")
        List<String> messages = (List<String>) request.getSession().getAttribute("MY_SESSION_MESSAGES");
		if (messages == null) {
			messages = new ArrayList<>();
			request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
		}
		messages.add("123");
		request.getSession().setAttribute("MY_SESSION_MESSAGES", messages);
        
        status.setComplete();
        return "redirect:/employee/list";
    }



}
