package com.onet.solutions.controller;

import java.io.IOException;
import java.io.OutputStream;
import java.security.Principal;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
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
import org.springframework.web.servlet.ModelAndView;

import com.onet.solutions.entity.Catalog;

import com.onet.solutions.services.CatalogService;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperPrint;

@Controller
public class CatalogController {
	public final Logger log = LoggerFactory.getLogger(this.getClass());
	
	 @Autowired
	    private CatalogService catalogService;
	 
	 
	 @GetMapping("/catalog/catForm")
		public String loadCatalogs(Model model) {
						
			return "misc/Catalog";
		}
	 
	
	  @GetMapping("/catalog/report") 
	  public void generateReport(HttpServletResponse response) throws JRException, IOException {
	  
	  
	  JasperPrint jasperPrint = null;
	  
	  response.setContentType("application/x-download");
	  response.setHeader("Content-Disposition",String.format("attachment; filename=\"catalogList.pdf\""));
	  
	  OutputStream out = response.getOutputStream(); 
	  jasperPrint 	   = catalogService.exportReport();
	  JasperExportManager.exportReportToPdfStream(jasperPrint, out);
	  
	 
	  
	  }
	 
	 
	 
	 @PostMapping("/catalog/addCatalog")
	 public String addCat(@Valid @ModelAttribute("catalog") Catalog cat,BindingResult bindingResult, HttpSession session) {
		 if(bindingResult.hasErrors()) {
			 
			 log.info("issue in binding result");
			 
			 List<FieldError> errors = bindingResult.getFieldErrors();
			    for (FieldError error : errors ) {
			    	log.info (error.getObjectName() + " Binding Errors " + error.getDefaultMessage());
			    } 
			 return "misc/Catalog";
		 }
		 //String email = (String) session.getAttribute("email");
		 catalogService.addCatalog(cat);
		 
		return   "redirect:/catalog/catList";
	 }
	 
	 
	 @GetMapping("/catalog/catList")
		public String listCatalogs(Model model) {
						
			List<Catalog> catalogs= catalogService.findCatalogs();  
			
			model.addAttribute("cats", catalogs);
			
			return "misc/catList";
		}
		 

}
