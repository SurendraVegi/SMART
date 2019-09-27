package com.onet.solutions.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.onet.solutions.entity.Catalog;


public interface CatalogRepository extends JpaRepository<Catalog, String> {
	
	List<Catalog> findAll();

}
