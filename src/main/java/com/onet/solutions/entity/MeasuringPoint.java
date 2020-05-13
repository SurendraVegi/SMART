package com.onet.solutions.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class MeasuringPoint {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getUOM() {
		return UOM;
	}

	public void setUOM(String uOM) {
		UOM = uOM;
	}

	public double getTarget_val() {
		return target_val;
	}

	public void setTarget_val(double target_val) {
		this.target_val = target_val;
	}

	public double getLower_limit() {
		return lower_limit;
	}

	public void setLower_limit(double lower_limit) {
		this.lower_limit = lower_limit;
	}

	public double getUpper_limit() {
		return upper_limit;
	}

	public void setUpper_limit(double upper_limit) {
		this.upper_limit = upper_limit;
	}

	public double getAnnaul_reading() {
		return annaul_reading;
	}

	public void setAnnaul_reading(double annaul_reading) {
		this.annaul_reading = annaul_reading;
	}

	@NotNull
	  @Size(max = 100)
	  private String equip;
	
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
	  private String UOM;
	
	@NotNull
	  @Size(max = 100)
	  private double target_val;
	
	@NotNull
	  @Size(max = 100)
	  private double lower_limit;
	
	@NotNull
	  @Size(max = 100)
	  private double upper_limit;
	
	@NotNull
	  @Size(max = 100)
	  private double annaul_reading;
	
	@Override
	public String toString() {
		return "MeasuringPoint [id=" + id + ", equip=" + equip + ", equip_desc=" + equip_desc + ", meas_pos=" + meas_pos
				+ ", meas_desc=" + meas_desc + ", UOM=" + UOM + ", target_val=" + target_val + ", lower_limit="
				+ lower_limit + ", upper_limit=" + upper_limit + ", annaul_reading=" + annaul_reading + "]";
	}

	public MeasuringPoint() {
		super();
		// TODO Auto-generated constructor stub
	}

}
