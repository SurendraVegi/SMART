package com.onet.solutions.services;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.onet.solutions.dao.EquipmentRepository;
import com.onet.solutions.entity.Equipment;
import com.onet.solutions.entity.User;



@Service
public class EquipmentService {
	
	@Autowired
	private EquipmentRepository equipmentRepository;

	public void addEquip(Equipment equipment) {

		equipmentRepository.save(equipment);
	}
	
	
	 
	public List<Equipment> findEquipments() {

		return equipmentRepository.findAll();
	}
	
	

	public List<Equipment> findAll() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public Equipment findOne(String id) {
		
		  return equipmentRepository.getOne(id);
		}

}
