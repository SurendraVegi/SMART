package com.onet.solutions.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.Code;

@Repository
public interface CodeRepository extends JpaRepository<Code, String>{
	
	List<Code> findAll();
  
}
   