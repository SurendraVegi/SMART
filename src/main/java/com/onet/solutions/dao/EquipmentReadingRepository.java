package com.onet.solutions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.Readings;


@Repository
public interface EquipmentReadingRepository extends JpaRepository<Readings,String>{

}
