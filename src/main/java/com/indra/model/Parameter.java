package com.indra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity (name = "parameters")
public class Parameter {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long parameter_pk;
	
	@Column(name = "DESCRIPCION")
	private String description;
	
	@ManyToOne
	@JoinColumn(name = "MASTER_FK")
	private Master master_fk;
	
	public Parameter() {
		super();
	}
	
	public Parameter(Long parameter_pk, String description, Master master_fk) {
		super();
		this.parameter_pk = parameter_pk;
		this.description = description;
		this.master_fk = master_fk;
	}
	
	public Long getParameter_pk() {
		return parameter_pk;
	}
	public void setParameter_pk(Long parameter_pk) {
		this.parameter_pk = parameter_pk;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Master getMaster_fk() {
		return master_fk;
	}

	public void setMaster_fk(Master master_fk) {
		this.master_fk = master_fk;
	}
	
	

}
