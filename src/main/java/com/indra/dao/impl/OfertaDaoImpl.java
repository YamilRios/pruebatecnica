package com.indra.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.indra.dao.OfertaDao;
import com.indra.model.LineaMovil;
import com.indra.model.to.ClienteTo;
import com.indra.model.to.LineaMovilTo;
import com.indra.model.to.OfertaTo;
import com.indra.model.to.RespuestaTo;



@Repository
public class OfertaDaoImpl implements OfertaDao {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	@Transactional
	public ClienteTo ofertaProxima(OfertaTo ofertaTo) {
		
		StringBuilder stringBuilderSql = new StringBuilder();
		stringBuilderSql.append(
				" SELECT O.codigo_oferta as codigo_oferta, O.descripcion_oferta as descripcion_oferta, O.fecha_inicio as fecha_inicio"
				+ ", O.fecha_fin as fecha_fin, O.fecha_oferta as fecha_oferta, "
				+ "LM.numero_telefono as numero_telefono, LM.estado_linea as estado_linea, LM.nombre_plan as nombre_plan, "
				+ "LM.tipo_linea as tipo_linea, LM.codigo_cliente_fk.codigo_cliente as codigo_cliente_fk, "
				+ "C.codigo_cliente as codigo_cliente, C.nombre_completo as nombre_completo, C.tipo_documento as tipo_documento, "
				+ "C.numero_documento as numero_documento, C.fecha_nacimiento as fecha_nacimiento "
				+ "FROM Oferta O INNER JOIN LineaMovilOferta L ON O.codigo_oferta  = L.codigo_oferta "
				+ "INNER JOIN LineaMovil LM ON L.numero_telefono = LM.numero_telefono "
				+ "INNER JOIN Cliente C ON LM.codigo_cliente_fk = C.codigo_cliente "
				+ "WHERE O.fecha_fin BETWEEN '1996-06-14' AND '1996-06-17'");
	    
		
		ClienteTo result = new ClienteTo();
		
		Query query = em.createQuery(stringBuilderSql.toString());
		//List<RespuestaTo> respuestaTo =  (List<RespuestaTo>) query.getResultList();
		List<Object[]> rows = query.getResultList();
		List<RespuestaTo> respuestaTo = new ArrayList<>(rows.size());
		for (Object[] row : rows) {
			respuestaTo.add(new RespuestaTo(
					(Long)row[0], 
					(Long) row[1],
					(Date) row[2], 
					(Date) row[3], 
					(Date) row[4], 
					(String) row[5], 
					(Long) row[6], 
					(Long) row[7], 
					(Long) row[8], 
					(Long) row[9], 
					(Long) row[10], 
					(String) row[11], 
					(Long) row[12], 
					(String) row[13], 
					(Date) row[14] ));
			
		}
		
		List<LineaMovil> listaE = new ArrayList<LineaMovil>();
		for(RespuestaTo ro: respuestaTo) {
			result.setCodigo_cliente(ro.getCodigo_cliente());
			result.setNombre_completo(ro.getNombre_completo());
			result.setTipo_documento(ro.getTipo_documento());
			result.setNumero_documento(ro.getNumero_documento());
			result.setFecha_nacimiento(ro.getFecha_nacimiento());
			LineaMovil e = new LineaMovil();
			e.setEstado_linea(ro.getEstado_linea());
			e.setNombre_plan(ro.getNombre_plan());
			e.setNumero_telefono(ro.getNumero_telefono());
			
			listaE.add(e);
		}
		
		result.setLineasMoviles(listaE);
		//result.setOfertas(lstLmoTo);
		query.setHint("eclipselink.result-type", "Map");
		query.setHint("eclipselink.cursor.scrollable", true);

		
		
		return result;
	}
	
}
