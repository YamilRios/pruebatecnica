package com.indra.commons;

import com.indra.model.to.ClienteTo;
import com.indra.model.to.OfertaTo;

public class ResponseCanonical {
	private ClienteTo clienteTo;
	private OfertaTo odertaTo;
	private String mensaje;
	
	public ResponseCanonical(ClienteTo clienteTo, OfertaTo odertaTo, String mensaje) {
		super();
		this.clienteTo = clienteTo;
		this.odertaTo = odertaTo;
		this.mensaje = mensaje;
	}
	
	public ResponseCanonical() {
		super();
	}

	public ClienteTo getClienteTo() {
		return clienteTo;
	}
	public void setClienteTo(ClienteTo clienteTo) {
		this.clienteTo = clienteTo;
	}
	public OfertaTo getOdertaTo() {
		return odertaTo;
	}
	public void setOdertaTo(OfertaTo odertaTo) {
		this.odertaTo = odertaTo;
	}
	public String getMensaje() {
		return mensaje;
	}
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
}
