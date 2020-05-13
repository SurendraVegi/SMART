package com.onet.solutions.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class EquipmentReadings {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotNull
	  @Size(max = 100)
	  private String meas_point_num;
	
	@NotNull
	  @Size(max = 100)
	  private double counter_reading;
	
	@NotNull
	  @Size(max = 100)
	  private double difference;
	
	@NotNull
	  @Size(max = 100)
	  private double tot_cnt_reading;
	
	@NotNull
	  @Size(max = 10)
	  private double UOM;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMeas_point_num() {
		return meas_point_num;
	}

	public void setMeas_point_num(String meas_point_num) {
		this.meas_point_num = meas_point_num;
	}

	public double getCounter_reading() {
		return counter_reading;
	}

	public void setCounter_reading(double counter_reading) {
		this.counter_reading = counter_reading;
	}

	public double getDifference() {
		return difference;
	}

	public void setDifference(double difference) {
		this.difference = difference;
	}

	public double getTot_cnt_reading() {
		return tot_cnt_reading;
	}

	public void setTot_cnt_reading(double tot_cnt_reading) {
		this.tot_cnt_reading = tot_cnt_reading;
	}

	public double getUOM() {
		return UOM;
	}

	public void setUOM(double uOM) {
		UOM = uOM;
	}

	public EquipmentReadings() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EquipmentReadings [meas_point_num=" + meas_point_num + ", counter_reading=" + counter_reading
				+ ", difference=" + difference + ", tot_cnt_reading=" + tot_cnt_reading + ", UOM=" + UOM + "]";
	}

}
