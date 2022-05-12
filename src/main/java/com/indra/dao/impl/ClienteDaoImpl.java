package com.indra.dao.impl;

import java.util.Date;
import java.util.List;

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
import com.indra.model.to.ClienteTo;
import com.indra.model.to.LineaMovilOfertaTo;

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
				stringBuilderSql2.append(" SELECT A.numero_telefono, A.estado_linea, A.nombre_plan, A.tipo_linea, A.codigo_cliente_fk.codigo_cliente FROM LineaMovil A");
				stringBuilderSql2.append(" WHERE A.codigo_cliente_fk.codigo_cliente = 4 ");
				
				Query query2 = em.createQuery(stringBuilderSql2.toString());
				//query2.setParameter("codCliente", result.getCodigo_cliente());
				
				List<LineaMovil> lis =  query2.getResultList();
				result.setLineasMoviles(lis);
				
				StringBuilder stringBuilderSql3 = new StringBuilder();
				stringBuilderSql3.append(" SELECT A.codigo_oferta, A.descripcion_oferta, A.fecha_inicio, A.fecha_fin, A.fecha_oferta FROM Oferta A INNER JOIN LineaMovilOferta B"
						+ " ON A.codigo_oferta = B.codigo_oferta.codigo_oferta");
				stringBuilderSql3.append(" WHERE B.numero_telefono.numero_telefono = '999999983' ");
			    
				
				Query query3 = em.createQuery(stringBuilderSql3.toString());
				List<LineaMovilOfertaTo> lstLmoTo =  query3.getResultList();
				result.setOfertas(lstLmoTo);
				//e.getLineasMoviles().forEach(x -> result.getLineasMoviles().add(x));
				
				
				/*
				StringBuilder stringBuilderSql2 = new StringBuilder();
				stringBuilderSql2.append(" SELECT E FROM Cliente E");
				stringBuilderSql2.append(" WHERE E.numero_documento = :numeroDocumento ");
				stringBuilderSql2.append(" AND E.tipo_documento.description = :tipoDocumentoDescripcion");
				TypedQuery<Cliente> query2 = em.createQuery(stringBuilderSql2.toString(), Cliente.class);
				query2.setParameter("numeroDocumento", clienteTo.getNumero_documento());
				query2.setParameter("tipoDocumentoDescripcion", clienteTo.getTipo_documento());
				
				Cliente e = (Cliente) query.getSingleResult();
				ClienteTo result = new ClienteTo();
				System.out.println(e.toString());
				result.setNumero_documento(e.getNumero_documento());
				result.setTipo_documento(e.gettipo_documento().getDescription());
				//result.setOfertas(e.getLineasMoviles().g);
				/*
				result.setIdEmployeePk(e.getIdEmployeePk());
				result.setBirthDate(e.getBirthDate());
				result.setCellphoneNumber(e.getCellphoneNumber());
				result.setCivilStatus(e.getCivilStatus());
				result.setDocumentNumber(e.getDocumentNumber());
				result.setDocumentType(e.getDocumentType());
				result.setEmail(e.getEmail());
				result.setEmployeePhoto(e.getEmployeePhoto());
				result.setFirstLastName(e.getFirstLastName());
				result.setName(e.getName());
				result.setProfession(e.getProfession());
				result.setSecondLastName(e.getSecondLastName());
				result.setSex(e.getSex());
				result.setState(e.getState());
				result.setUserName(e.getUserName());
				result.setPassword(e.getPassword());
				result.setIndManager(e.getIndManager());
				result.setIndCustomer(e.getIndCustomer());
				
				if(e.getOrganizations()!=null){
					
					result.setOrganizationTo(e.getOrganizations());
				}
					
				
				List<Address> baseEntityList = getListAddress(result.getOrganizationTo().getIdOrganizationPk());
				List<AddressTo> entityToList = new ArrayList<>();
				if(baseEntityList!=null){
					for(Address whd : baseEntityList){
						entityToList.add(new AddressTo().copyEntity(whd));
					}
					result.setAddresses(entityToList);
				}
				*/
				
				return result;
			}  catch (NoResultException ex) {
				System.out.print(ex);
				return null;
			} catch (NonUniqueResultException ex) {
				return null;
			}	
		}

	/*
		@Override
		public List<Address> getListAddress(Long idOrganizationPk) throws Exception {
			try{					
				StringBuilder stringBuilderSql = new StringBuilder();
				stringBuilderSql.append(" SELECT E FROM Address E");
				stringBuilderSql.append(" WHERE E.organization.idOrganizationPk =:idOrganizationPk ");
				stringBuilderSql.append(" AND E.indActive =:indActive ");
				stringBuilderSql.append(" ORDER BY E.idAddressPk ASC ");
				
				TypedQuery<Address> query = em.createQuery(stringBuilderSql.toString(),Address.class);
							
				if(Validations.validateIsNotNullAndNotEmpty(idOrganizationPk)){
					query.setParameter("idOrganizationPk", idOrganizationPk);	
				}
				query.setParameter("indActive", 1);	
					
				
				List<Address> listResponse = query.getResultList();
				return listResponse;
			
			} catch (NoResultException ex) {
				return null;
			} catch (NonUniqueResultException ex) {
				return null;
			}
		}

		return null;
	}
*/
}
