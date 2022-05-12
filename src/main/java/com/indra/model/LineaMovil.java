package com.indra.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LINEAS_MOVILES")
public class LineaMovil {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "NUMERO_TELEFONO")
	private String numero_telefono;
	
	// Estado linea
	private Long estado_linea;
	
	// Tipo Linea
	private Long tipo_linea;
	
	// Nombre plan
	
	private Long nombre_plan;
	
	@ManyToOne
	@JoinColumn(name = "CODIGO_CLIENTE_FK")
	private Cliente codigo_cliente_fk;
	
	// bi-direccional
	@OneToMany(mappedBy = "numero_telefono")
	private List<LineaMovilOferta> lineasMoviles = new ArrayList<LineaMovilOferta>(); 
	
	public LineaMovil() {
		super();
	}

	public LineaMovil(String numero_telefono, Long estado_linea, Long tipo_linea, Long nombre_plan,
			Cliente codigo_cliente_fk) {
		super();
		this.numero_telefono = numero_telefono;
		this.estado_linea = estado_linea;
		this.tipo_linea = tipo_linea;
		this.nombre_plan = nombre_plan;
		this.codigo_cliente_fk = codigo_cliente_fk;
	}

	public String getNumero_telefono() {
		return numero_telefono;
	}

	public void setNumero_telefono(String numero_telefono) {
		this.numero_telefono = numero_telefono;
	}

	public Long getEstado_linea() {
		return estado_linea;
	}

	public void setEstado_linea(Long estado_linea) {
		this.estado_linea = estado_linea;
	}

	public Long getTipo_linea() {
		return tipo_linea;
	}

	public void setTipo_linea(Long tipo_linea) {
		this.tipo_linea = tipo_linea;
	}

	public Long getNombre_plan() {
		return nombre_plan;
	}

	public void setNombre_plan(Long nombre_plan) {
		this.nombre_plan = nombre_plan;
	}

	public Cliente getCodigo_cliente_fk() {
		return codigo_cliente_fk;
	}

	public void setCodigo_cliente_fk(Cliente codigo_cliente_fk) {
		this.codigo_cliente_fk = codigo_cliente_fk;
	}
	
	
}
