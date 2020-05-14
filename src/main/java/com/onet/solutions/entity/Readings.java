package com.onet.solutions.entity;

import java.io.Serializable;

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
public class Readings extends AuditFields<String>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mease_seq")
	  @GenericGenerator(
	      name = "mease_seq", 
	      strategy = "com.onet.solutions.entity.SeqIdGen", 
	      parameters = {
	      		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
	      		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "ER"),
	      		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
		@TableGenerator(table="mease_seq", name = "mease_seq")
		@Column ( name = "id", nullable = false ) 
	private String id;
	
	@NotNull
	  @Size(max = 100)
	  private String meas_pointnum;
	
	@NotNull
	  @Size(max = 100)
	  private String counter_reading;
	
	@NotNull
	  @Size(max = 100)
	  private String difference;
	
	@NotNull
	  @Size(max = 100)
	  private String tot_cntreading;
	
	@NotNull
	  @Size(max = 10)
	  private String uom;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMeas_pointnum() {
		return meas_pointnum;
	}

	public void setMeas_pointnum(String meas_pointnum) {
		this.meas_pointnum = meas_pointnum;
	}

	public String getCounter_reading() {
		return counter_reading;
	}

	public void setCounter_reading(String counter_reading) {
		this.counter_reading = counter_reading;
	}

	public String getDifference() {
		return difference;
	}

	public void setDifference(String difference) {
		this.difference = difference;
	}

	public String getTot_cntreading() {
		return tot_cntreading;
	}

	public void setTot_cntreading(String tot_cntreading) {  
		this.tot_cntreading = tot_cntreading;
	}

	
	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public Readings(String meas_pointnum, String counter_reading, String difference, String tot_cntreading,
			String uOM) {
		super();
		this.meas_pointnum = meas_pointnum;
		this.counter_reading = counter_reading;
		this.difference = difference;
		this.tot_cntreading = tot_cntreading;
		this.uom = uOM;
	}



	public Readings() {
		super();
		// TODO Auto-generated constructor stub
	}

	

}
