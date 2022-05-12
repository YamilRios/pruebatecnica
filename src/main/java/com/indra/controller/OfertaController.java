package com.indra.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.indra.model.to.ClienteTo;
import com.indra.model.to.OfertaTo;
import com.indra.service.OfertaService;

@RestController
public class OfertaController {
	
	@Autowired
	OfertaService ofertaService;
	
	@RequestMapping(value = "/ofertaProxima", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ClienteTo ofertaProxima(@RequestBody OfertaTo ofertaTo) {
		
		return ofertaService.ofertaProxima(ofertaTo);
	}
}
