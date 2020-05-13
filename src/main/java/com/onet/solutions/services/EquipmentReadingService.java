package com.onet.solutions.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onet.solutions.dao.EquipmentReadingRepository;

import com.onet.solutions.entity.EquipmentReadings;

@Service
public class EquipmentReadingService {
	
	@Autowired
	private EquipmentReadingRepository equipReadRepository;

	
	public void addEquipReadings(EquipmentReadings equipmentReadings) {

		equipReadRepository.save(equipmentReadings);
	}
}
