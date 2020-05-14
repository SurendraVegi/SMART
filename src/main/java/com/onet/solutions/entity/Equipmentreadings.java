package com.onet.solutions.entity;

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
public class Equipmentreadings {
	
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
	  private String meas_point_num;
	
	@NotNull
	  @Size(max = 100)
	  private String counter_reading;
	
	@NotNull
	  @Size(max = 100)
	  private String difference;
	
	@NotNull
	  @Size(max = 100)
	  private String tot_cnt_reading;
	
	@NotNull
	  @Size(max = 10)
	  private String UOM;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMeas_point_num() {
		return meas_point_num;
	}

	public void setMeas_point_num(String meas_point_num) {
		this.meas_point_num = meas_point_num;
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

	public String getTot_cnt_reading() {
		return tot_cnt_reading;
	}

	public void setTot_cnt_reading(String tot_cnt_reading) {
		this.tot_cnt_reading = tot_cnt_reading;
	}

	public String getUOM() {
		return UOM;
	}

	public Equipmentreadings(String meas_point_num, String counter_reading, String difference, String tot_cnt_reading,
			String uOM) {
		super();
		this.meas_point_num = meas_point_num;
		this.counter_reading = counter_reading;
		this.difference = difference;
		this.tot_cnt_reading = tot_cnt_reading;
		UOM = uOM;
	}

	public void setUOM(String uOM) {
		UOM = uOM;
	}

	public Equipmentreadings() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "EquipmentReadings [meas_point_num=" + meas_point_num + ", counter_reading=" + counter_reading
				+ ", difference=" + difference + ", tot_cnt_reading=" + tot_cnt_reading + ", UOM=" + UOM + "]";
	}

}
