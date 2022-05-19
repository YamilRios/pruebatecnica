package com.indra.model.to;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.indra.model.LineaMovil;

public class OfertaTo {
	private Long codigo_oferta;
	
	private Long descripcion_oferta;
	
	private Date fecha_inicio;
	
	private Date fecha_fin;
    
	private Date fecha_oferta;
	
	
	
	public OfertaTo(Long codigo_oferta, Long descripcion_oferta, Date fecha_inicio, Date fecha_fin, Date fecha_oferta) {
		super();
		this.codigo_oferta = codigo_oferta;
		this.descripcion_oferta = descripcion_oferta;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.fecha_oferta = fecha_oferta;
	}

	
	public OfertaTo() {
		super();
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

	public Date getFecha_oferta() {
		return fecha_oferta;
	}

	public void setFecha_oferta(Date fecha_oferta) {
		this.fecha_oferta = fecha_oferta;
	}
	
}
