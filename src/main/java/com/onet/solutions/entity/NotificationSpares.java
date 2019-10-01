package com.onet.solutions.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class NotificationSpares {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @NotNull
	  @Size(max = 100)
	  private String equipNo;

	 @NotNull
	  @Size(max = 100)
	  private String materialCode;
	 

	 @NotNull
	  @Size(max = 100)
	  private String materialDesc;


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


	public String getMaterialCode() {
		return materialCode;
	}


	public void setMaterialCode(String materialCode) {
		this.materialCode = materialCode;
	}


	public String getMaterialDesc() {
		return materialDesc;
	}


	public void setMaterialDesc(String materialDesc) {
		this.materialDesc = materialDesc;
	}


	public NotificationSpares(String equipNo, String materialCode, String materialDesc) {
		super();
		this.equipNo = equipNo;
		this.materialCode = materialCode;
		this.materialDesc = materialDesc;
	}


	public NotificationSpares() {
		super();
		// TODO Auto-generated constructor stub
	}

}
