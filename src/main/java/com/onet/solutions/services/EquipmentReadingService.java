package com.onet.solutions.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onet.solutions.dao.EquipmentReadingRepository;
import com.onet.solutions.entity.Equipment;
import com.onet.solutions.entity.EquipmentReadings;

@Service
public class EquipmentReadingService {
	
	@Autowired
	private EquipmentReadingRepository equipReadRepository;

	
	public void addEquipReadings(EquipmentReadings equipmentReadings) {

		equipReadRepository.save(equipmentReadings);
	}
	
	
	public List<EquipmentReadings> findEquipReads() {

		return equipReadRepository.findAll();
	}
	
}
