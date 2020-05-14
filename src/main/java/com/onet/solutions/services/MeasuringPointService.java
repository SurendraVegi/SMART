package com.onet.solutions.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onet.solutions.dao.EquipmentRepository;
import com.onet.solutions.dao.MeasuringPointRepository;
import com.onet.solutions.entity.Equipment;
import com.onet.solutions.entity.EquipmentReadings;
import com.onet.solutions.entity.MeasuringPoint;

@Service
public class MeasuringPointService {
	
	@Autowired
	private MeasuringPointRepository measPointRepository;
	
	public void addMeasPoints(MeasuringPoint measuringPoints) {

		//measuringPoints.setEquipment(equip);
		measPointRepository.save(measuringPoints);
	}
	
	
	public List<MeasuringPoint> findMeasPoints() {

		return measPointRepository.findAll();
	}
	

}
