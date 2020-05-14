package com.onet.solutions.controller;

import java.util.List;

import javax.validation.Valid;

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
import org.springframework.web.bind.annotation.RequestMapping;

import com.onet.solutions.entity.Readings;
import com.onet.solutions.services.EquipmentReadingService;


@Controller
@RequestMapping("/equipr/")
public class EquipmentReadingsController {
	
	public final Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
    private EquipmentReadingService equipReadService;
 
 
 @GetMapping("equipReadingsCreate")
	public String loadERCreate(Model model) {
					
		return "equipr/equipReadingsCreate";
	}
 

 
 @PostMapping("equipReadingsCreate")
 public String addEquipReadings(@Valid @ModelAttribute("readings") Readings equipreadings,BindingResult bindingResult) {
	 if(bindingResult.hasErrors()) {
		 
		 log.info("issue in binding result");
		 
		 List<FieldError> errors = bindingResult.getFieldErrors();
		    for (FieldError error : errors ) {
		    	log.info (error.getObjectName() + " Binding Errors " + error.getDefaultMessage());
		    } 
		 return "equipr/equipReadingsCreate";
	 }
	 //String email = (String) session.getAttribute("email");
	 equipReadService.addEquipReadings(equipreadings);
	 
	return   "redirect:equipReadsList";
 }
 
 @GetMapping("equipReadsList")
	public String listEquipmentsReadings(Model model) {
					
		List<Readings> equipsReadings= equipReadService.findEquipReads();  
		
		model.addAttribute("equipsReadings", equipsReadings);
		
		return "equipr/equipReadsList";
	}
 

}
