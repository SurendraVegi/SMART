package com.onet.solutions.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class EquipTechSpecs {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @NotNull
	  @Size(max = 100)
	  private String equipNo;
	 
	 @NotNull
	  @Size(max = 100)
	  private String charName;
	 
	 @NotNull
	  @Size(max = 100)
	  private String charDesc;

	 @NotNull
	  @Size(max = 100)
	  private String charVal;
	 
	 @NotNull
	  @Size(max = 100)
	  private String UOM;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEquipNo() {
		return equipNo;
	}

	public void setEquipNo(String equipNo) {
		this.equipNo = equipNo;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public String getCharDesc() {
		return charDesc;
	}

	public void setCharDesc(String charDesc) {
		this.charDesc = charDesc;
	}

	public String getCharVal() {
		return charVal;
	}

	public void setCharVal(String charVal) {
		this.charVal = charVal;
	}

	public String getUOM() {
		return UOM;
	}

	public void setUOM(String uOM) {
		UOM = uOM;
	}

	public EquipTechSpecs(String equipNo, String charName, String charDesc, String charVal, String uOM) {
		super();
		this.equipNo = equipNo;
		this.charName = charName;
		this.charDesc = charDesc;
		this.charVal = charVal;
		UOM = uOM;
	}

	public EquipTechSpecs() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	
}
