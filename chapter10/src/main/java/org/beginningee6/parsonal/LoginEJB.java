package org.beginningee6.parsonal;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class LoginEJB {

	@PersistenceContext(unitName = "chapter10PU")
	private EntityManager em;

	public List<Parson> findLoginParson(Long id, String name) {
		TypedQuery<Parson> query = em.createNamedQuery("findAllParsons", Parson.class);
		return query.getResultList();
	}
	
	public Parson findLoginParson(Long id) {
		Parson parson = em.find(Parson.class, id);
		return parson;
	}


}
