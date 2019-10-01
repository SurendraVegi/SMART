package com.onet.solutions.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Equipment extends AuditFields<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "equip_seq")
  @GenericGenerator(
      name = "equip_seq", 
      strategy = "com.onet.solutions.entity.SeqIdGen", 
      parameters = {
      		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
      		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "EQUIP"),
      		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	@TableGenerator(table="equip_seq", name = "equip_seq")
	@Column ( name = "id", nullable = false ) 
  private String id;
	
	
		
	  
	  @NotNull
	  @Size(max = 100)
	  private String equip_desc;
	  
	  
	  @NotNull
		@Size(max = 100)
		private String FL;
	  
	  
	  @NotNull
		@Size(max = 100)
		private String FL_name;
	  
	  
	  
	  @NotNull
		@Size(max = 100)
		private String manufacturer;
	  
	  @NotNull
		@Size(max = 100)
		private String manufacturerPartNo;
	  
	  @NotNull
		@Size(max = 100)
		private String manufacturerCountry;
	  
	  @NotNull
		@Size(max = 100)
		private String manufacturerConYear;
	  
	  @NotNull
		@Size(max = 100)
		private String shelflife;
	  
	  @NotNull
		@Size(max = 100)
		private String acquisitionValue;
	  
	  
	  
	  @NotNull
		@Size(max = 100)
		private String modelNo;
	  
	  
	  @NotNull
		@Size(max = 100)
		private String serialNo;

	  @NotNull
		@Size(max = 100)
		private String status;

	public String getEquip_desc() {
		return equip_desc;
	}

	public void setEquip_desc(String equip_desc) {
		this.equip_desc = equip_desc;
	}

	public String getFL() {
		return FL;
	}

	public void setFL(String fL) {
		FL = fL;
	}

	public String getFL_name() {
		return FL_name;
	}

	public void setFL_name(String fL_name) {
		FL_name = fL_name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getManufacturerPartNo() {
		return manufacturerPartNo;
	}

	public void setManufacturerPartNo(String manufacturerPartNo) {
		this.manufacturerPartNo = manufacturerPartNo;
	}

	public String getManufacturerCountry() {
		return manufacturerCountry;
	}

	public void setManufacturerCountry(String manufacturerCountry) {
		this.manufacturerCountry = manufacturerCountry;
	}

	public String getManufacturerConYear() {
		return manufacturerConYear;
	}

	public void setManufacturerConYear(String manufacturerConYear) {
		this.manufacturerConYear = manufacturerConYear;
	}

	public String getShelflife() {
		return shelflife;
	}

	public void setShelflife(String shelflife) {
		this.shelflife = shelflife;
	}

	public String getAcquisitionValue() {
		return acquisitionValue;
	}

	public void setAcquisitionValue(String acquisitionValue) {
		this.acquisitionValue = acquisitionValue;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Equipment(String equip_desc, String fL, String fL_name, String manufacturer, String manufacturerPartNo,
			String manufacturerCountry, String manufacturerConYear, String shelflife, String acquisitionValue,
			String modelNo, String serialNo, String status) {
		super();
		this.equip_desc = equip_desc;
		FL = fL;
		FL_name = fL_name;
		this.manufacturer = manufacturer;
		this.manufacturerPartNo = manufacturerPartNo;
		this.manufacturerCountry = manufacturerCountry;
		this.manufacturerConYear = manufacturerConYear;
		this.shelflife = shelflife;
		this.acquisitionValue = acquisitionValue;
		this.modelNo = modelNo;
		this.serialNo = serialNo;
		this.status = status;
	}

	public Equipment() {
		super();
		// TODO Auto-generated constructor stub
	}


}
