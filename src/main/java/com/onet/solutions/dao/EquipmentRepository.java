package com.onet.solutions.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.Catalog;
import com.onet.solutions.entity.Equipment;


@Repository
public interface EquipmentRepository extends JpaRepository<Equipment,String>{
	
	
	List<Equipment> findAll();
	
	
}
