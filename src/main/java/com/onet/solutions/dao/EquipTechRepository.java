package com.onet.solutions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.EquipTechSpecs;

@Repository
public interface EquipTechRepository extends JpaRepository<EquipTechSpecs, Long>{

}
