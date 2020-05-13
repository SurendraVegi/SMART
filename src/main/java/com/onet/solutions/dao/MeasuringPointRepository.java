package com.onet.solutions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.MeasuringPoint;


@Repository
public interface MeasuringPointRepository extends JpaRepository<MeasuringPoint,Long>{

}
