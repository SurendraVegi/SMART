package com.onet.solutions.services;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import com.onet.solutions.entity.Employee;
import com.onet.solutions.dao.CatalogRepository;
import com.onet.solutions.entity.Catalog;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Service
public class CatalogService {

	@Autowired
	private CatalogRepository catalogRepository;

	public void addCatalog(Catalog catalog) {

		catalogRepository.save(catalog);
	}

	
	
	  public JasperPrint exportReport() throws JRException, IOException {
	  
	  String path = "F:\\report\\jreport"; 
	  List<Catalog> catalog =	  catalogRepository.findAll(); //load file and compile it 
	  File file =	  ResourceUtils.getFile("classpath:catalog.jrxml"); 
	  JasperReport jasperReport =	  JasperCompileManager.compileReport(file.getAbsolutePath());
	  JRBeanCollectionDataSource dataSource = new	  JRBeanCollectionDataSource(catalog);
	  Map<String, Object> parameters = new	  HashMap<>(); 
	  parameters.put("createdBy", "Sample");
	  JasperPrint jasperPrint =	  JasperFillManager.fillReport(jasperReport, parameters, dataSource);
	  
	  return jasperPrint;
	  
	  } 
	 
	 /** 
	 * response.setContentType("application/x-pdf");
	 * response.addHeader("Content-Disposition",
	 * String.format("attachment; filename=\"employees.pdf\"")); OutputStream out =
	 * response.getOutputStream();
	 * JasperExportManager.exportReportToPdfStream(jasperPrint,out);
	 * 
	 * JasperExportManager.exportReportToPdfFile(jasperPrint, path +
	 * "\\employees.pdf");
	 * 
	 * 
	 * return "report generated in path : " + path;
	 * 
	 * return jasperPrint;
	 * 
	 * }
	 */
	 
	public List<Catalog> findCatalogs() {

		return catalogRepository.findAll();
	}

	public List<Catalog> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
