package com.indra.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indra.dao.OfertaDao;
import com.indra.model.to.ClienteTo;
import com.indra.model.to.LineaMovilTo;
import com.indra.model.to.OfertaTo;
import com.indra.service.OfertaService;

@Service
public class OfertaServiceImpl implements OfertaService {
	
	@Autowired
	OfertaDao ofertaDao;

	@Override
	public ClienteTo ofertaProxima(OfertaTo ofertaTo) {
		ClienteTo clienteToResult = null;
		List<LineaMovilTo> lstLineaMovilTo = null;
		try {
			clienteToResult = ofertaDao.ofertaProxima(ofertaTo);
			//lstLineaMovilTo = lineaMovilDao.lineasMovilesPorCliente(clienteToResult.getCodigo_cliente());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return clienteToResult;
	}

}
