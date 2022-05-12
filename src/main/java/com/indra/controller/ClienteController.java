package com.indra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.indra.commons.Constants;
import com.indra.model.to.ClienteTo;
import com.indra.service.ClienteService;

@RestController
public class ClienteController {
	
	@Autowired
	ClienteService clienteBusiness;
	
	@RequestMapping(value = "/consultarCliente", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ClienteTo consultarCliente(@RequestBody ClienteTo clienteTo) {
		/*ClienteTo clienteTo = new ClienteTo();
		clienteTo.setTipo_documento(tipo_documento);
		clienteTo.setNumero_documento(numero_documento);*/
		if(clienteTo.getTipo_documento_descripcion().equalsIgnoreCase("DNI")) {
			clienteTo.setTipo_documento(Constants.DNI);
		}
		if(clienteTo.getTipo_documento_descripcion().equalsIgnoreCase("Carne de extranjería")) {
			clienteTo.setTipo_documento(Constants.CARNE_DE_EXTRANJERIA);
		}
		return clienteBusiness.consultarCliente(clienteTo);
	}
}
