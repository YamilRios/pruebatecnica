package com.indra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Master {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "MASTER_PK")
	private Long master_pk;
	
	@Column(name = "DESCRIPCION")
	private String description;
	
	public Master() {
		super();
	}
	
	public Master(Long master_pk, String descripcion) {
		super();
		this.master_pk = master_pk;
		this.description = descripcion;
	}
	
	public Long getMaster_pk() {
		return master_pk;
	}
	public void setMaster_pk(Long master_pk) {
		this.master_pk = master_pk;
	}
	public String getDescripcion() {
		return description;
	}
	public void setDescripcion(String descripcion) {
		this.description = descripcion;
	}
}
