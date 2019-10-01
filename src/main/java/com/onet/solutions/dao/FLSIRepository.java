package com.onet.solutions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.FLStructureIndicator;

@Repository
public interface FLSIRepository extends JpaRepository<FLStructureIndicator, Long>{

}
