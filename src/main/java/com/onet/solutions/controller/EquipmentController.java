package com.onet.solutions.controller;

import java.io.IOException;
import java.io.OutputStream;
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
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.onet.solutions.entity.Equipment;
import com.onet.solutions.entity.Equipmentreadings;
import com.onet.solutions.entity.MeasuringPoint;
import com.onet.solutions.entity.Task;
import com.onet.solutions.services.EquipmentReadingService;
import com.onet.solutions.services.EquipmentService;
import com.onet.solutions.services.MeasuringPointService;



@Controller
@RequestMapping("/equip/")
public class EquipmentController {
	
	public final Logger log = LoggerFactory.getLogger(this.getClass());
	
	 @Autowired
	    private EquipmentService equipmentService;
	 
	 @Autowired
	    private MeasuringPointService measPointService;
	 
	
	 
	 @GetMapping("equipCreateForm")
		public String loadEquipCreate(Model model) {
						
			return "equip/equipCreateForm";
		}
	 
	 @GetMapping("measPointCreate")
		public String loadMPCreate(String equipid, Model model, HttpSession session) {
		 
		 log.info("equipid :::::::::"+equipid);
		 
		// session.setAttribute("equip", equipid); 
		 //model.addAttribute("measuring_point", new MeasuringPoint());
						
			return "equip/measPointCreate";
		}
	
	 
	 @PostMapping("equipCreate")
	 public String addEquipments(@Valid @ModelAttribute("equipment") Equipment equip,BindingResult bindingResult, HttpSession session) {
		 if(bindingResult.hasErrors()) {
			 
			 log.info("issue in binding result");
			 
			 List<FieldError> errors = bindingResult.getFieldErrors();
			    for (FieldError error : errors ) {
			    	log.info (error.getObjectName() + " Binding Errors " + error.getDefaultMessage());
			    } 
			 return "equip/equipCreateForm";
		 }
		 //String email = (String) session.getAttribute("email");
		 equipmentService.addEquip(equip);
		 
		return   "redirect:equipList";
	 }
	 
	 @PostMapping("measPointCreate")
	 public String addMeasPoint(@Valid @ModelAttribute("measuringpoint") MeasuringPoint measpoint,BindingResult bindingResult, HttpSession session) {
		 if(bindingResult.hasErrors()) {
			 
			 log.info("issue in binding result");
			 
			 List<FieldError> errors = bindingResult.getFieldErrors();
			    for (FieldError error : errors ) {
			    	log.info (error.getObjectName() + " Binding Errors " + error.getDefaultMessage());
			    } 
			 return "equip/measPointCreate";
		 }
		 String equipId = (String) session.getAttribute("equip");
		 
		// measPointService.addMeasPoints(measpoint, equipmentService.findOne(equipId));
		 
		 measPointService.addMeasPoints(measpoint);
		 
		return   "redirect:measPointList";
	 }
	 
	 
	 @GetMapping("measPointList")
		public String listMeasuringPoint(Model model) {
						
			List<MeasuringPoint> measPoints= measPointService.findMeasPoints();  
			
			model.addAttribute("measPoints", measPoints);
			
			return "equip/measPointList";
		}
	 
	 @GetMapping("equipList")
		public String listEquipments(Model model) {
						
			List<Equipment> equips= equipmentService.findEquipments();  
			
			model.addAttribute("equips", equips);
			
			return "equip/equipList";
		}
		 
	 
	 @GetMapping("equipDetails/{id}")
		public String equipDetails(@PathVariable("id") String id,Model model) {
		 
		 
		 log.info("equips :::::::::"+id);
			Equipment equipDet= equipmentService.findOne(id); 
			
			log.info("equips :::::::::"+equipDet);
			
			model.addAttribute("equip", equipDet);
			
			
			
			return "equip/equipDetails";
		}
		 

	

}
