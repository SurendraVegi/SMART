package com.onet.solutions.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onet.solutions.dao.CatalogRepository;
import com.onet.solutions.entity.Catalog;


@Service
public class CatalogService {
	
	@Autowired
	private CatalogRepository catalogRepository;
	
	
	public void addCatalog(Catalog catalog) {
		
		
		
			catalogRepository.save(catalog);
	}
	
	
	
public List<Catalog>  findCatalogs(){
		
		return catalogRepository.findAll();
	}



public List<Catalog> findAll() {
	// TODO Auto-generated method stub
	return null;
}

}
