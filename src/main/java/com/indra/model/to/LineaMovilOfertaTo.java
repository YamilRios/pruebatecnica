package com.indra.model.to;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import com.indra.model.LineaMovil;
import com.indra.model.Oferta;

public class LineaMovilOfertaTo {
	private String numero_telefono;
	
	private Long estado_linea;
	
	private Long tipo_linea;
	
	private Long nombre_plan;
	
	private Long codigo_cliente_fk;
	
	private List<Oferta> oferta_fk;
	
	
	private Long codigo_oferta;
	
	private Long descripcion_oferta;
	
	private Date fecha_inicio;
	
	private Date fecha_fin;
	
	private String lineamovil_fk;
    
	private Date fecha_oferta;
	
	

	public LineaMovilOfertaTo() {
		super();
	}

	public LineaMovilOfertaTo(String numero_telefono, Long estado_linea, Long tipo_linea, Long nombre_plan,
			Long codigo_cliente_fk, List<Oferta> oferta_fk, Long codigo_oferta, Long descripcion_oferta,
			Date fecha_inicio, Date fecha_fin, String lineamovil_fk, Date fecha_oferta) {
		super();
		this.numero_telefono = numero_telefono;
		this.estado_linea = estado_linea;
		this.tipo_linea = tipo_linea;
		this.nombre_plan = nombre_plan;
		this.codigo_cliente_fk = codigo_cliente_fk;
		this.oferta_fk = oferta_fk;
		this.codigo_oferta = codigo_oferta;
		this.descripcion_oferta = descripcion_oferta;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.lineamovil_fk = lineamovil_fk;
		this.fecha_oferta = fecha_oferta;
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

	public Long getCodigo_oferta() {
		return codigo_oferta;
	}

	public void setCodigo_oferta(Long codigo_oferta) {
		this.codigo_oferta = codigo_oferta;
	}

	public Long getDescripcion_oferta() {
		return descripcion_oferta;
	}

	public void setDescripcion_oferta(Long descripcion_oferta) {
		this.descripcion_oferta = descripcion_oferta;
	}

	public Date getFecha_inicio() {
		return fecha_inicio;
	}

	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}

	public Date getFecha_fin() {
		return fecha_fin;
	}

	public void setFecha_fin(Date fecha_fin) {
		this.fecha_fin = fecha_fin;
	}

	public String getLineamovil_fk() {
		return lineamovil_fk;
	}

	public void setLineamovil_fk(String lineamovil_fk) {
		this.lineamovil_fk = lineamovil_fk;
	}

	public Date getFecha_oferta() {
		return fecha_oferta;
	}

	public void setFecha_oferta(Date fecha_oferta) {
		this.fecha_oferta = fecha_oferta;
	}
	
	
}
