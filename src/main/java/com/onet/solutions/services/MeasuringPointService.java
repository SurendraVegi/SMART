package com.onet.solutions.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onet.solutions.dao.EquipmentRepository;
import com.onet.solutions.dao.MeasuringPointRepository;
import com.onet.solutions.entity.EquipmentReadings;
import com.onet.solutions.entity.MeasuringPoint;

@Service
public class MeasuringPointService {
	
	@Autowired
	private MeasuringPointRepository measPointRepository;
	
	public void addMeasPoints(MeasuringPoint measuringPoints) {

		measPointRepository.save(measuringPoints);
	}

}
