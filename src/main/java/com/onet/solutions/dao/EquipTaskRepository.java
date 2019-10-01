package com.onet.solutions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.EquipTaskList;

@Repository
public interface EquipTaskRepository extends JpaRepository<EquipTaskList, Long>{

}
