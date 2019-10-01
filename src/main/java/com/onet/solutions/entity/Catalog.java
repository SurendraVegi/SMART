package com.onet.solutions.entity;

import java.io.Serializable;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Catalog  implements Serializable{
	  
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO , generator = "cat_seq")
    @GenericGenerator(
        name = "cat_seq", 
        strategy = "com.onet.solutions.entity.StringPrefixedSequenceIdGenerator",
        parameters = {
        		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.INCREMENT_PARAM, value = "1"),
        		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.VALUE_PREFIX_PARAMETER, value = "CAT"),
        		@org.hibernate.annotations.Parameter(name = StringPrefixedSequenceIdGenerator.NUMBER_FORMAT_PARAMETER, value = "%05d") })
	
	@TableGenerator(table="cat_seq", name = "cat_seq")
	@Column ( name = "id", nullable = false ) 
    private String id;

    @NotNull
    @Size(max = 100)
   
    private String name;
    
    @NotNull
    @Size(max = 100)
   
    private String cat_desc;

	

	public String getCat_desc() {
		return cat_desc;
	}

	public void setCat_desc(String cat_desc) {
		this.cat_desc = cat_desc;
	}

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
    
    
	public Catalog(String name, String cat_desc) {
		super();
		this.name = name;
		this.cat_desc = cat_desc;
	}
	
	public Catalog() {
		
	}


}
