package com.indra.model.to;

import java.util.Date;

public class RespuestaTo {
	private Long codigo_oferta;
	
	private Long descripcion_oferta;
	
	private Date fecha_inicio;
	
	private Date fecha_fin;
    
	private Date fecha_oferta;
	
	
	
	private String numero_telefono;
	
	private Long estado_linea;
	
	private Long nombre_plan;
	
	private Long tipo_linea;
	
	private Long codigo_cliente_fk;
	
	
	
	private Long codigo_cliente;
	
	private String nombre_completo;
	
	// TIPO_DOCUMENTO
	private Long tipo_documento;
	
	private String numero_documento;
	
	private Date fecha_nacimiento;
	
	
	
	
	
	

	

	public RespuestaTo(Long codigo_oferta, Long descripcion_oferta, Date fecha_inicio, Date fecha_fin,
			Date fecha_oferta, String numero_telefono, Long estado_linea, Long nombre_plan, Long tipo_linea,
			Long codigo_cliente_fk, Long codigo_cliente, String nombre_completo, Long tipo_documento,
			String numero_documento, Date fecha_nacimiento) {
		super();
		this.codigo_oferta = codigo_oferta;
		this.descripcion_oferta = descripcion_oferta;
		this.fecha_inicio = fecha_inicio;
		this.fecha_fin = fecha_fin;
		this.fecha_oferta = fecha_oferta;
		this.numero_telefono = numero_telefono;
		this.estado_linea = estado_linea;
		this.nombre_plan = nombre_plan;
		this.tipo_linea = tipo_linea;
		this.codigo_cliente_fk = codigo_cliente_fk;
		this.codigo_cliente = codigo_cliente;
		this.nombre_completo = nombre_completo;
		this.tipo_documento = tipo_documento;
		this.numero_documento = numero_documento;
		this.fecha_nacimiento = fecha_nacimiento;
	}

	public RespuestaTo() {
		super();
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

	public Long getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(Long tipo_documento) {
		this.tipo_documento = tipo_documento;
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
