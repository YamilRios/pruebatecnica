package com.indra.dao;

import com.indra.model.to.ClienteTo;

public interface ClienteDao {
	public ClienteTo consultarCliente(ClienteTo clienteTo) throws Exception;
}
