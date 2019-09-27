package com.onet.solutions.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.onet.solutions.services.CatalogService;

@Controller
public class CatalogController {
	
	 @Autowired
	    private CatalogService catalogService;
	 
	 
	 @GetMapping("/catalog")
		public String loadCatalogs(Model model) {
			
			
			
			model.addAttribute("catalogs", catalogService.findCatalogs());
			
			
			return "views/profile";
		}
	 
	 

}
