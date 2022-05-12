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
	
	private List<LineaMovil> lineamovil_fk = new ArrayList<LineaMovil>();
    
	private Date fecha_oferta;
	
	public OfertaTo(Long codigo_oferta, Long descripcion_oferta, Date fecha_inicio, Date fecha_oferta,
			List<LineaMovil> lineamovil_fk) {
		super();
		this.codigo_oferta = codigo_oferta;
		this.descripcion_oferta = descripcion_oferta;
		this.fecha_inicio = fecha_inicio;
		this.fecha_oferta = fecha_oferta;
		this.lineamovil_fk = lineamovil_fk;
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
	public Date getfecha_oferta() {
		return getfecha_oferta();
	}
	public void setfecha_oferta(Date fecha_oferta) {
		this.fecha_oferta = fecha_oferta;
	}
	public List<LineaMovil> getLineamovil_fk() {
		return lineamovil_fk;
	}
	public void setLineamovil_fk(List<LineaMovil> lineamovil_fk) {
		this.lineamovil_fk = lineamovil_fk;
	}
}
