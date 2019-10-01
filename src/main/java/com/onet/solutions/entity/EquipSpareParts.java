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
public class EquipSpareParts {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	 @NotNull
	  @Size(max = 100)
	  private String equipNo;
	 
	 @NotNull
	  @Size(max = 100)
	  private String matCode;
	 
	 @NotNull
	  @Size(max = 100)
	  private String matDesc;
	 
	 @NotNull
	  @Size(max = 100)
	  private String abcIndicator;
	 
	 @NotNull
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date warStartDate = new Date();
	 
	 @NotNull
	    @Temporal(TemporalType.TIMESTAMP)
	    private Date warEndDate = new Date();
	 
	 @NotNull
	  @Size(max = 100)
	  private String stockOverview;
	 
	 @NotNull
	  @Size(max = 100)
	  private String itemCategory;

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

	public String getMatCode() {
		return matCode;
	}

	public void setMatCode(String matCode) {
		this.matCode = matCode;
	}

	public String getMatDesc() {
		return matDesc;
	}

	public void setMatDesc(String matDesc) {
		this.matDesc = matDesc;
	}

	public String getAbcIndicator() {
		return abcIndicator;
	}

	public void setAbcIndicator(String abcIndicator) {
		this.abcIndicator = abcIndicator;
	}

	public Date getWarStartDate() {
		return warStartDate;
	}

	public void setWarStartDate(Date warStartDate) {
		this.warStartDate = warStartDate;
	}

	public Date getWarEndDate() {
		return warEndDate;
	}

	public void setWarEndDate(Date warEndDate) {
		this.warEndDate = warEndDate;
	}

	public String getStockOverview() {
		return stockOverview;
	}

	public void setStockOverview(String stockOverview) {
		this.stockOverview = stockOverview;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public EquipSpareParts(String equipNo, String matCode, String matDesc, String abcIndicator, Date warStartDate,
			Date warEndDate, String stockOverview, String itemCategory) {
		super();
		this.equipNo = equipNo;
		this.matCode = matCode;
		this.matDesc = matDesc;
		this.abcIndicator = abcIndicator;
		this.warStartDate = warStartDate;
		this.warEndDate = warEndDate;
		this.stockOverview = stockOverview;
		this.itemCategory = itemCategory;
	}

	public EquipSpareParts() {
		super();
		// TODO Auto-generated constructor stub
	}
	 

}
