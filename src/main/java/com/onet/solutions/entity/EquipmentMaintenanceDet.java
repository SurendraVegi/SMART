package com.onet.solutions.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class EquipmentMaintenanceDet {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @NotNull
	  @Size(max = 100)
	  private String equipNo;
	
	 
	 @NotNull
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date plannedDate = new Date();
	 
	 @NotNull
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date callDate = new Date();
	 
	 
	 @NotNull
	  @Size(max = 100)
	  private String actualVariance;
	 
	 @NotNull
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date CompletedOn = new Date();
	 
	 @NotNull
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date nextDueDate = new Date();

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

	public Date getPlannedDate() {
		return plannedDate;
	}

	public void setPlannedDate(Date plannedDate) {
		this.plannedDate = plannedDate;
	}

	public Date getCallDate() {
		return callDate;
	}

	public void setCallDate(Date callDate) {
		this.callDate = callDate;
	}

	public String getActualVariance() {
		return actualVariance;
	}

	public void setActualVariance(String actualVariance) {
		this.actualVariance = actualVariance;
	}

	public Date getCompletedOn() {
		return CompletedOn;
	}

	public void setCompletedOn(Date completedOn) {
		CompletedOn = completedOn;
	}

	public Date getNextDueDate() {
		return nextDueDate;
	}

	public void setNextDueDate(Date nextDueDate) {
		this.nextDueDate = nextDueDate;
	}

	public EquipmentMaintenanceDet(String equipNo, Date plannedDate, Date callDate, String actualVariance,
			Date completedOn, Date nextDueDate) {
		super();
		this.equipNo = equipNo;
		this.plannedDate = plannedDate;
		this.callDate = callDate;
		this.actualVariance = actualVariance;
		CompletedOn = completedOn;
		this.nextDueDate = nextDueDate;
	}

	public EquipmentMaintenanceDet() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}
