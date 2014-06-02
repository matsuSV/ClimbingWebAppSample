package org.beginningee6.parsonal;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

@Stateless
public class ParsonEJB {

	@PersistenceContext(unitName = "chapter10PU")
	private EntityManager em;

	public List<Parson> findParsons() {
		TypedQuery<Parson> query = em.createNamedQuery("findAllParsons", Parson.class);
		return query.getResultList();
	}

	public Parson createParson(Parson parson) {
		em.persist(parson);
		return parson;
	}
}
