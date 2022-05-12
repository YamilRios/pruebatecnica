package com.indra.dao;

import java.util.List;

import com.indra.model.to.LineaMovilTo;

public interface LineaMovilDao {
	public List<LineaMovilTo> lineasMovilesPorCliente(Long codigoCliente) throws Exception;
}
