package com.onet.solutions.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class CodeGroup extends AuditFields<String>  implements Serializable{
	  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "codeg_seq")
    @GenericGenerator(
        name = "codeg_seq", 
        strategy = "com.onet.solutions.entity.SeqIdGen", 
        parameters = {
        		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
        		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "CODEG"),
        		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	@TableGenerator(table="codeg_seq", name = "codeg_seq")
	@Column ( name = "id", nullable = false ) 
    private String id;

    @NotNull
    @Size(max = 100)
   
    private String name;
    
    @NotNull
    @Size(max = 100)
   
    private String codeg_desc;
    
    @NotNull
    @Size(max = 100)
   
    private String status;

    
    public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Catalog getCatalog() {
		return catalog;
	}

	public void setCatalog(Catalog catalog) {
		this.catalog = catalog;
	}

	@ManyToOne(fetch = FetchType.LAZY, cascade =  CascadeType.ALL,optional = false)
    @JoinColumn(name = "cat_id", nullable = false)
    private Catalog catalog;

    
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
    
    
	
	
	public CodeGroup(String name, String codeg_desc, String status, Catalog catalog) {
		super();
		this.name = name;
		this.codeg_desc = codeg_desc;
		this.status = status;
		this.catalog = catalog;
	}



	public String getCodeg_desc() {
		return codeg_desc;
	}

	public void setCodeg_desc(String codeg_desc) {
		this.codeg_desc = codeg_desc;
	}

	public CodeGroup() {
		
	}


}
