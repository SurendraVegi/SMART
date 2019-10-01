package com.onet.solutions.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class EquipTaskList {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @NotNull
	  @Size(max = 100)
	  private String equipNo;
	  
	 @NotNull
	  @Size(max = 100)
	  private String taskType;
	 
	 @NotNull
	  @Size(max = 100)
	  private String taskGrp;
	 
	 @NotNull
	  @Size(max = 100)
	  private String counter;

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

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getTaskGrp() {
		return taskGrp;
	}

	public void setTaskGrp(String taskGrp) {
		this.taskGrp = taskGrp;
	}

	public String getCounter() {
		return counter;
	}

	public void setCounter(String counter) {
		this.counter = counter;
	}

	public EquipTaskList(String equipNo, String taskType, String taskGrp, String counter) {
		super();
		this.equipNo = equipNo;
		this.taskType = taskType;
		this.taskGrp = taskGrp;
		this.counter = counter;
	}

	public EquipTaskList() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 

}
