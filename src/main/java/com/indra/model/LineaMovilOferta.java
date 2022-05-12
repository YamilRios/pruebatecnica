package com.indra.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "LINEAS_MOVILES_OFERTAS")
public class LineaMovilOferta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long LINEAS_MOVILES_OFERTAS_PK;
	
	@ManyToOne
	@JoinColumn(name = "numero_telefono")
	private LineaMovil numero_telefono;
	
	@ManyToOne
	@JoinColumn(name = "codigo_oferta")
	private Oferta codigo_oferta;
}
