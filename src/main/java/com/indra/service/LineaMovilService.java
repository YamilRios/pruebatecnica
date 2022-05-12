package com.indra.service;

import java.util.List;

import com.indra.model.to.LineaMovilTo;

public interface LineaMovilService {
	public List<LineaMovilTo> lineasMovilesPorCliente(Long codigoCliente);
}
