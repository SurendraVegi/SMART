package com.onet.solutions.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onet.solutions.entity.NotificationTechnicianDet;

@Repository
public interface NotoficationTechRepository extends JpaRepository<NotificationTechnicianDet, Long>{


}
