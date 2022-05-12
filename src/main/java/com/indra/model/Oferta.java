package com.indra.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "OFERTAS")
public class Oferta {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CODIGO_OFERTA")
	private Long codigo_oferta;
	
	@Column(name = "DESCRIPCION_OFERTA")
	private Long descripcion_oferta;
	
	@Column(name = "FECHA_INICIO")
	private Date fecha_inicio;
	
	@Column(name = "FECHA_FIN")
	private Date fecha_fin;
	
	// bi-direccional
	@OneToMany(mappedBy = "codigo_oferta")
	private List<LineaMovilOferta> lstOfertas;
    
	@Column(name = "FECHA_OFERTA")
	private Date fecha_oferta;
	
	public Oferta(Long codigo_oferta, Long descripcion_oferta, Date fecha_inicio, Date fecha_oferta,
			List<LineaMovilOferta> lstOfertas) {
		super();
		this.codigo_oferta = codigo_oferta;
		this.descripcion_oferta = descripcion_oferta;
		this.fecha_inicio = fecha_inicio;
		this.fecha_oferta = fecha_oferta;
		this.lstOfertas = lstOfertas;
	}
	
	public Oferta() {
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
	public List<LineaMovilOferta> getLineamovil_fk() {
		return lstOfertas;
	}
	public void LineaMovilOferta(List<LineaMovilOferta> lstOfertas) {
		this.lstOfertas = lstOfertas;
	}
}
