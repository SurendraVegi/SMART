package com.onet.solutions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.FLCreation;

@Repository
public interface FLCreatRepository extends JpaRepository<FLCreation, Long>{

}
