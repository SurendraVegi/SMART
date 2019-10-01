package com.onet.solutions.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class FLStructureIndicator {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

  @NotNull
  @Size(max = 100)
  private String name;
  
  @NotNull
  @Size(max = 100)
  private String hier_level;
  
  
  @NotNull
  @Size(max = 100)
  private String mask;


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getHier_level() {
	return hier_level;
}


public void setHier_level(String hier_level) {
	this.hier_level = hier_level;
}


public String getMask() {
	return mask;
}


public void setMask(String mask) {
	this.mask = mask;
}


public FLStructureIndicator(String name, String hier_level, String mask) {
	super();
	this.name = name;
	this.hier_level = hier_level;
	this.mask = mask;
}


public FLStructureIndicator() {
	super();
	// TODO Auto-generated constructor stub
}
	  
	 
	  
	  
	

}
