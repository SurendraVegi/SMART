package com.onet.solutions.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Comments extends AuditFields<String> {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
@NotNull
@Size(max = 100)
private String documentNo;
	

@NotNull
@Size(max = 100)
private String documentType;


@NotNull
@Size(max = 100)
private String status;


@NotNull
@Size(max = 100)
private String comments;
	

@NotNull
@Size(max = 5)
private int counter;
	

public Comments() {
	super();
	// TODO Auto-generated constructor stub
}


public Comments(String documentNo, String documentType, String status, String comments, int counter) {
	super();
	this.documentNo = documentNo;
	this.documentType = documentType;
	this.status = status;
	this.comments = comments;
	this.counter = counter;
}


public Long getId() {
	return id;
}


public void setId(Long id) {
	this.id = id;
}


public String getDocumentNo() {
	return documentNo;
}


public void setDocumentNo(String documentNo) {
	this.documentNo = documentNo;
}


public String getDocumentType() {
	return documentType;
}


public void setDocumentType(String documentType) {
	this.documentType = documentType;
}


public String getStatus() {
	return status;
}


public void setStatus(String status) {
	this.status = status;
}


public String getComments() {
	return comments;
}


public void setComments(String comments) {
	this.comments = comments;
}


public int getCounter() {
	return counter;
}


public void setCounter(int counter) {
	this.counter = counter;
}

		
	
}
