package com.indra.model.to;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.indra.model.LineaMovil;
import com.indra.model.Oferta;

public class ClienteTo {
	private Long codigo_cliente;
	
	private String nombre_completo;
	
	// TIPO_DOCUMENTO
	private Long tipo_documento;
	
	private String tipo_documento_descripcion;
	
	private String numero_documento;
	
	private Date fecha_nacimiento;
	
	private List<LineaMovil> lineasMoviles = new ArrayList<LineaMovil>(); 
	
	private List<LineaMovilOfertaTo> ofertas = new ArrayList<LineaMovilOfertaTo>();
	
	
	

	public ClienteTo(Long codigo_cliente, String nombre_completo, Long tipo_documento,
			String tipo_documento_descripcion, String numero_documento, Date fecha_nacimiento,
			List<LineaMovil> lineasMoviles, List<LineaMovilOfertaTo> ofertas) {
		super();
		this.codigo_cliente = codigo_cliente;
		this.nombre_completo = nombre_completo;
		this.tipo_documento = tipo_documento;
		this.tipo_documento_descripcion = tipo_documento_descripcion;
		this.numero_documento = numero_documento;
		this.fecha_nacimiento = fecha_nacimiento;
		this.lineasMoviles = lineasMoviles;
		this.ofertas = ofertas;
	}

	public ClienteTo() {
		super();
	}

	public Long getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(Long tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public List<LineaMovilOfertaTo> getOfertas() {
		return ofertas;
	}

	public void setOfertas(List<LineaMovilOfertaTo> ofertas) {
		this.ofertas = ofertas;
	}

	public Long getCodigo_cliente() {
		return codigo_cliente;
	}
	public void setCodigo_cliente(Long codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}
	public String getNombre_completo() {
		return nombre_completo;
	}
	public void setNombre_completo(String nombre_completo) {
		this.nombre_completo = nombre_completo;
	}
	public String getNumero_documento() {
		return numero_documento;
	}
	public void setNumero_documento(String numero_documento) {
		this.numero_documento = numero_documento;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public List<LineaMovil> getLineasMoviles() {
		return lineasMoviles;
	}

	public void setLineasMoviles(List<LineaMovil> lineasMoviles) {
		this.lineasMoviles = lineasMoviles;
	}

	public String getTipo_documento_descripcion() {
		return tipo_documento_descripcion;
	}

	public void setTipo_documento_descripcion(String tipo_documento_descripcion) {
		this.tipo_documento_descripcion = tipo_documento_descripcion;
	}
	
}
