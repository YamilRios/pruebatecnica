package com.indra.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.dao.ClienteDao;
import com.indra.dao.LineaMovilDao;
import com.indra.model.to.ClienteTo;
import com.indra.model.to.LineaMovilTo;
import com.indra.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService, LineaMovilDao{

	@Autowired
	ClienteDao clienteDao;
	
	
	
	@Override
	public ClienteTo consultarCliente(ClienteTo clienteTo) {
		ClienteTo clienteToResult = null;
		List<LineaMovilTo> lstLineaMovilTo = null;
		try {
			clienteToResult = clienteDao.consultarCliente(clienteTo);
			//lstLineaMovilTo = lineaMovilDao.lineasMovilesPorCliente(clienteToResult.getCodigo_cliente());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clienteToResult;
	}

	@Override
	public List<LineaMovilTo> lineasMovilesPorCliente(Long codigoCliente) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
}
