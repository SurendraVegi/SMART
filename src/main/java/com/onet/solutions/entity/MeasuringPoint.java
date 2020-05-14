package com.onet.solutions.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.TableGenerator;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class MeasuringPoint {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "meas_seq")
	  @GenericGenerator(
	      name = "meas_seq", 
	      strategy = "com.onet.solutions.entity.SeqIdGen", 
	      parameters = {
	      		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
	      		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "MEAS"),
	      		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
		@TableGenerator(table="meas_seq", name = "meas_seq")
		@Column ( name = "id", nullable = false ) 
	  private String id;
		
	
	
	
	
 
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	

	

	public String getMeas_pos() {
		return meas_pos;
	}

	public void setMeas_pos(String meas_pos) {
		this.meas_pos = meas_pos;
	}

	public String getMeas_desc() {
		return meas_desc;
	}

	public void setMeas_desc(String meas_desc) {
		this.meas_desc = meas_desc;
	}

	

	public String getTarget_val() {
		return target_val;
	}

	public void setTarget_val(String target_val) {
		this.target_val = target_val;
	}

	public String getLower_limit() {
		return lower_limit;
	}

	public void setLower_limit(String lower_limit) {
		this.lower_limit = lower_limit;
	}

	public String getUpper_limit() {
		return upper_limit;
	}

	public void setUpper_limit(String upper_limit) {
		this.upper_limit = upper_limit;
	}

	public String getAnnaul_reading() {
		return annaul_reading;
	}

	public void setAnnaul_reading(String annaul_reading) {
		this.annaul_reading = annaul_reading;
	}

	
	
	@NotNull
	  @Size(max = 100)
	  private String equip; 
	
	

	

	public MeasuringPoint(String equip, String equip_desc, String meas_pos, String meas_desc, String uOM,
			String equip_id, String target_val, String lower_limit, String upper_limit, String annaul_reading) {
		super();
		this.equip = equip;
		this.equip_desc = equip_desc;
		this.meas_pos = meas_pos;
		this.meas_desc = meas_desc;
		this.uom = uOM;
		this.equip_id = equip_id;
		this.target_val = target_val;
		this.lower_limit = lower_limit;
		this.upper_limit = upper_limit;
		this.annaul_reading = annaul_reading;
	}



	public String getUom() {
		return uom;
	}

	public void setUom(String uom) {
		this.uom = uom;
	}

	public String getEquip() {
		return equip;
	}

	public void setEquip(String equip) {
		this.equip = equip;
	}

	public String getEquip_desc() {
		return equip_desc;
	}

	public void setEquip_desc(String equip_desc) {
		this.equip_desc = equip_desc;
	}

	@NotNull
	  @Size(max = 100)
	  private String equip_desc;
	
	@NotNull
	  @Size(max = 100)
	  private String meas_pos;
	
	@NotNull
	  @Size(max = 100)
	  private String meas_desc;
	
	@NotNull
	  @Size(max = 10)
	  private String uom;
	
	@NotNull
	  @Size(max = 10)
	  private String equip_id;
	
	
	  public String getEquip_id() {
		return equip_id;
	}

	public void setEquip_id(String equip_id) {
		this.equip_id = equip_id;
	}


	@NotNull
	  @Size(max = 10)
	private String target_val;
	
	@NotNull
	  @Size(max = 10)
	  private String lower_limit;
	
	@NotNull
	  @Size(max = 10)
	  private String upper_limit;
	
	@NotNull
	  @Size(max = 10)
	  private String annaul_reading;
	
	
	
	public MeasuringPoint() {
		super();
		// TODO Auto-generated constructor stub
	}

}
