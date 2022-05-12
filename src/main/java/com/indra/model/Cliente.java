package com.indra.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "CLIENTES")
public class Cliente {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "CODIGO_CLIENTE")
	private Long codigo_cliente;
	
	@Column(name = "NOMBRE_COMPLETO")
	private String nombre_completo;
	
	// TIPO_DOCUMENTO
	private Long tipo_documento;
	
	@Column(name = "NUMERO_DOCUMENTO")
	private String numero_documento;
	
	@Column(name = "FECHA_NACIMIENTO")
	private Date fecha_nacimiento;
	
	// bi-direccional
	@OneToMany(mappedBy = "codigo_cliente_fk")
	private List<LineaMovil> lineasMoviles = new ArrayList<LineaMovil>(); 
	
	
	public Cliente() {
		super();
	}
	
	public Cliente(Long codigo_cliente, String nombre_completo, Long tipo_documento, String numero_documento,
			Date fecha_nacimiento, List<LineaMovil> lineasMoviles) {
		super();
		this.codigo_cliente = codigo_cliente;
		this.nombre_completo = nombre_completo;
		this.tipo_documento = tipo_documento;
		this.numero_documento = numero_documento;
		this.fecha_nacimiento = fecha_nacimiento;
		this.lineasMoviles = lineasMoviles;
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
	public Long gettipo_documento() {
		return tipo_documento;
	}
	public void settipo_documento(Long tipo_documento) {
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

	public List<LineaMovil> getLineasMoviles() {
		return lineasMoviles;
	}

	public void setLineasMoviles(List<LineaMovil> lineasMoviles) {
		this.lineasMoviles = lineasMoviles;
	}
	
	
}
