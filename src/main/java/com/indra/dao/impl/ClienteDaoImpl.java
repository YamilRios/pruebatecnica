package com.indra.dao.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.indra.dao.ClienteDao;
import com.indra.model.Cliente;
import com.indra.model.LineaMovil;
import com.indra.model.Oferta;
import com.indra.model.to.ClienteTo;
import com.indra.model.to.LineaMovilTo;
import com.indra.model.to.OfertaTo;

@Repository
public class ClienteDaoImpl implements ClienteDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	@Transactional
	public ClienteTo consultarCliente(ClienteTo clienteTo) throws Exception{
			try {
				StringBuilder stringBuilderSql = new StringBuilder();
				stringBuilderSql.append(" SELECT E FROM Cliente E");
				stringBuilderSql.append(" WHERE E.numero_documento = :numeroDocumento ");
				stringBuilderSql.append(" AND E.tipo_documento = :tipoDocumentoDescripcion");
				
				Query query = em.createQuery(stringBuilderSql.toString());
				query.setParameter("numeroDocumento", clienteTo.getNumero_documento());
				query.setParameter("tipoDocumentoDescripcion", clienteTo.getTipo_documento());
				
				Cliente e = (Cliente) query.getSingleResult();
				ClienteTo result = new ClienteTo();
				System.out.println(e.toString());
				result.setNumero_documento(e.getNumero_documento());
				result.setTipo_documento(e.gettipo_documento());
				result.setCodigo_cliente(e.getCodigo_cliente());
				
				StringBuilder stringBuilderSql2 = new StringBuilder();
				stringBuilderSql2.append(" SELECT NEW com.indra.model.to.LineaMovilTo(A.numero_telefono, A.estado_linea, A.nombre_plan, A.tipo_linea, A.codigo_cliente_fk.codigo_cliente) FROM LineaMovil A");
				stringBuilderSql2.append(" WHERE A.codigo_cliente_fk.codigo_cliente = :codCliente ");
				
				Query query2 = em.createQuery(stringBuilderSql2.toString());
				query2.setParameter("codCliente", result.getCodigo_cliente());
				
				List<LineaMovilTo> lisTo = query2.getResultList();
				
				lisTo.stream().forEach(new Consumer<LineaMovilTo>() {
					@Override
					public void accept(LineaMovilTo lineaMovil) {
						StringBuilder stringBuilderSql3 = new StringBuilder();
						stringBuilderSql3.append(" SELECT NEW com.indra.model.to.OfertaTo(A.codigo_oferta, A.descripcion_oferta, A.fecha_inicio, A.fecha_fin, A.fecha_oferta) FROM Oferta A INNER JOIN LineaMovilOferta B"
								+ " ON A.codigo_oferta = B.codigo_oferta.codigo_oferta");
						stringBuilderSql3.append(" WHERE B.numero_telefono.numero_telefono = :numeroTelefono ");
						Query query3 = em.createQuery(stringBuilderSql3.toString());
						query3.setParameter("numeroTelefono", lineaMovil.getNumero_telefono());
						
						List<OfertaTo> lstOfertaTo  =  query3.getResultList();
						lineaMovil.setofertas(lstOfertaTo);
					}
				});
				result.setLineasMoviles(lisTo);
				return result;
			}  catch (NoResultException ex) {
				System.out.print(ex);
				return null;
			} catch (NonUniqueResultException ex) {
				return null;
			}	
		}
}
