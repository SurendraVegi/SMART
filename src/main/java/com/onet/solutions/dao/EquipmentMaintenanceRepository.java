package com.onet.solutions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.EquipmentMaintenanceDet;

@Repository
public interface EquipmentMaintenanceRepository extends JpaRepository<EquipmentMaintenanceDet, Long>{

}
