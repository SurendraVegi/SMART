package com.onet.solutions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.Equipmentreadings;


@Repository
public interface EquipmentReadingRepository extends JpaRepository<Equipmentreadings,String>{

}
