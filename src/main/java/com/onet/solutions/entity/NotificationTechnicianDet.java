package com.onet.solutions.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class NotificationTechnicianDet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @NotNull
	  @Size(max = 100)
	  private String technician;

	 @NotNull
	  @Size(max = 100)
	  private String department;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTechnician() {
		return technician;
	}

	public void setTechnician(String technician) {
		this.technician = technician;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public NotificationTechnicianDet(String technician, String department) {
		super();
		this.technician = technician;
		this.department = department;
	}

	public NotificationTechnicianDet() {
		super();
		// TODO Auto-generated constructor stub
	}

}
