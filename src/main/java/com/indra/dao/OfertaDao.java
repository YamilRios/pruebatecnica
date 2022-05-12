package com.indra.dao;

import com.indra.model.to.ClienteTo;
import com.indra.model.to.OfertaTo;

public interface OfertaDao {
	public ClienteTo ofertaProxima(OfertaTo ofertaTo) throws Exception;
}
