package com.onet.solutions.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class FLCreation {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

  @NotNull
  @Size(max = 100)
  private String fl_desc;
  
  @NotNull
  @Size(max = 100)
  private String sup_fl;
  
  
  @NotNull
  @Size(max = 100)
  private String SI_mask;
  
  @NotNull
  @Size(max = 3)
  private String equipInstall;
  
  
  @NotNull
  @Size(max = 100)
  private String status;


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getFl_desc() {
	return fl_desc;
}


public void setFl_desc(String fl_desc) {
	this.fl_desc = fl_desc;
}


public String getSup_fl() {
	return sup_fl;
}


public void setSup_fl(String sup_fl) {
	this.sup_fl = sup_fl;
}


public String getSI_mask() {
	return SI_mask;
}


public void setSI_mask(String sI_mask) {
	SI_mask = sI_mask;
}


public String getEquipInstall() {
	return equipInstall;
}


public void setEquipInstall(String equipInstall) {
	this.equipInstall = equipInstall;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}


public FLCreation(String fl_desc, String sup_fl, String sI_mask, String equipInstall, String status) {
	super();
	this.fl_desc = fl_desc;
	this.sup_fl = sup_fl;
	SI_mask = sI_mask;
	this.equipInstall = equipInstall;
	this.status = status;
}


public FLCreation() {
	super();
	// TODO Auto-generated constructor stub
}
  
  
  
  

}
