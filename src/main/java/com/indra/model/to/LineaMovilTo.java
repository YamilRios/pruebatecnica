package com.indra.model.to;

import java.util.List;

import com.indra.model.Oferta;

public class LineaMovilTo {
	private String numero_telefono;
	
	private Long estado_linea;
	
	private Long tipo_linea;
	
	private Long nombre_plan;
	
	private Long codigo_cliente_fk;
	
	private List<Oferta> oferta_fk;

	
	public LineaMovilTo() {
		super();
	}

	public LineaMovilTo(String numero_telefono, Long estado_linea, Long tipo_linea, Long nombre_plan,
			Long codigo_cliente_fk, List<Oferta> oferta_fk) {
		super();
		this.numero_telefono = numero_telefono;
		this.estado_linea = estado_linea;
		this.tipo_linea = tipo_linea;
		this.nombre_plan = nombre_plan;
		this.codigo_cliente_fk = codigo_cliente_fk;
		this.oferta_fk = oferta_fk;
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

	public Long getCodigo_cliente_fk() {
		return codigo_cliente_fk;
	}

	public void setCodigo_cliente_fk(Long codigo_cliente_fk) {
		this.codigo_cliente_fk = codigo_cliente_fk;
	}

	public List<Oferta> getOferta_fk() {
		return oferta_fk;
	}

	public void setOferta_fk(List<Oferta> oferta_fk) {
		this.oferta_fk = oferta_fk;
	}
	
	
}
