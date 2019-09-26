package com.onet.solutions.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Task {
	
	@Id
    /*@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "task_sequence")
    @GenericGenerator(
        name = "task_sequence", 
        strategy = "com.onet.solutions.entity.StringPrefixedSequenceIdGenerator", 
        parameters = {
        		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "50"),
        		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "B_"),
        		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })*/
	
	
	@GeneratedValue
	private Long id;
	
	@NotEmpty
	private String date;
	@NotEmpty
	private String startTime;
	@NotEmpty
	private String stopTime;
	@NotEmpty
	@Column(length=1000)
	private String description;
	@ManyToOne
	@JoinColumn(name="USER_EMAIL")
	private User user;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStopTime() {
		return stopTime;
	}
	public void setStopTime(String stopTime) {
		this.stopTime = stopTime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Task(String date, String startTime, String stopTime, String description, User user) {
		this.date = date;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.description = description;
		this.user = user;
	}
	public Task(String date, String startTime, String stopTime, String description) {
		this.date = date;
		this.startTime = startTime;
		this.stopTime = stopTime;
		this.description = description;
	}
	public Task() {
	}
	
	

}
