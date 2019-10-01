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
public class Notification {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @NotNull
	  @Size(max = 100)
	  private String equipNo;
	 @NotNull
	  @Size(max = 100)
	  private String funLocNo;
	 @NotNull
	  @Size(max = 100)
	  private String funLocDesc;
	 @NotNull
	  @Size(max = 100)
	  private String equipmentNo;
	 @NotNull
	  @Size(max = 100)
	  private String equipmentDesc;
	 @NotNull
	 @Temporal(TemporalType.TIMESTAMP)
	    private Date startDate = new Date();
	 @NotNull
	  @Size(max = 100)
	  private String status;
	 @NotNull
	  @Size(max = 100)
	  private String reportedBy;
	 @NotNull
	 @Temporal(TemporalType.TIMESTAMP)
	    private Date reportedOn = new Date(); 
	 @NotNull
	  @Size(max = 100)
	  private String notificationDesc;
	 @NotNull
	  @Size(max = 100)
	  private String PMOrderNo;
	 @NotNull
	  @Size(max = 100)
	  private String damage;
	 @NotNull
	  @Size(max = 100)
	  private String rootCause;
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
	public String getFunLocNo() {
		return funLocNo;
	}
	public void setFunLocNo(String funLocNo) {
		this.funLocNo = funLocNo;
	}
	public String getFunLocDesc() {
		return funLocDesc;
	}
	public void setFunLocDesc(String funLocDesc) {
		this.funLocDesc = funLocDesc;
	}
	public String getEquipmentNo() {
		return equipmentNo;
	}
	public void setEquipmentNo(String equipmentNo) {
		this.equipmentNo = equipmentNo;
	}
	public String getEquipmentDesc() {
		return equipmentDesc;
	}
	public void setEquipmentDesc(String equipmentDesc) {
		this.equipmentDesc = equipmentDesc;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getReportedBy() {
		return reportedBy;
	}
	public void setReportedBy(String reportedBy) {
		this.reportedBy = reportedBy;
	}
	public Date getReportedOn() {
		return reportedOn;
	}
	public void setReportedOn(Date reportedOn) {
		this.reportedOn = reportedOn;
	}
	public String getNotificationDesc() {
		return notificationDesc;
	}
	public void setNotificationDesc(String notificationDesc) {
		this.notificationDesc = notificationDesc;
	}
	public String getPMOrderNo() {
		return PMOrderNo;
	}
	public void setPMOrderNo(String pMOrderNo) {
		PMOrderNo = pMOrderNo;
	}
	public String getDamage() {
		return damage;
	}
	public void setDamage(String damage) {
		this.damage = damage;
	}
	public String getRootCause() {
		return rootCause;
	}
	public void setRootCause(String rootCause) {
		this.rootCause = rootCause;
	}
	public Notification(String equipNo, String funLocNo, String funLocDesc, String equipmentNo, String equipmentDesc,
			Date startDate, String status, String reportedBy, Date reportedOn, String notificationDesc,
			String pMOrderNo, String damage, String rootCause) {
		super();
		this.equipNo = equipNo;
		this.funLocNo = funLocNo;
		this.funLocDesc = funLocDesc;
		this.equipmentNo = equipmentNo;
		this.equipmentDesc = equipmentDesc;
		this.startDate = startDate;
		this.status = status;
		this.reportedBy = reportedBy;
		this.reportedOn = reportedOn;
		this.notificationDesc = notificationDesc;
		PMOrderNo = pMOrderNo;
		this.damage = damage;
		this.rootCause = rootCause;
	}
	public Notification() {
		super();
		// TODO Auto-generated constructor stub
	}
	 
	 
}
