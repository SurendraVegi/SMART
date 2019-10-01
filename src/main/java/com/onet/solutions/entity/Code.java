package com.onet.solutions.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
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

@Entity
public class Code extends AuditFields<String>  implements Serializable{
	  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "code_seq")
  @GenericGenerator(
      name = "code_seq", 
      strategy = "com.onet.solutions.entity.SeqIdGen", 
      parameters = {
      		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
      		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "CODE"),
      		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	@TableGenerator(table="code_seq", name = "code_seq")
	@Column ( name = "id", nullable = false ) 
  private String id;

  @NotNull
  @Size(max = 100)
 
  private String name;
  
  @NotNull
  @Size(max = 100)
 
  private String code_desc;
  
  @ManyToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL,optional = false)
  @JoinColumn(name = "code_grp_id", nullable = false)
  private CodeGroup codeGrp;
  
 

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getCode_desc() {
	return code_desc;
}

public void setCode_desc(String code_desc) {
	this.code_desc = code_desc;
}

public CodeGroup getCodeGrp() {
	return codeGrp;
}

public void setCodeGrp(CodeGroup codeGrp) {
	this.codeGrp = codeGrp;
}

  
  public Code(String name, String code_desc, CodeGroup codeGrp) {
		super();
		this.name = name;
		this.code_desc = code_desc;
		this.codeGrp = codeGrp;
	}


	public Code() {
		
	}


}

