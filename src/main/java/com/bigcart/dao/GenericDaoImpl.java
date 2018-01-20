package com.bigcart.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaDelete;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unchecked")
@Repository
public class GenericDaoImpl<E, K> implements GenericDao<E, K> {
	private static Logger logger = Logger.getLogger(GenericDaoImpl.class) ;
	
	@Autowired
	private EntityManager entityManager;

	public void save(E entity) {
		entityManager.merge(entity);
	}

	public void delete(E entity) {
		entityManager.remove(entity);
	}

	public void delete(Class cl, List<Long> ids) {
		/*CriteriaDelete criteria = entityManager.getCriteriaBuilder().createCriteriaDelete(cl);
		Root root = criteria.from(cl);
		criteria.where(root.get("id").in(ids));

		int result = entityManager.createQuery(criteria).executeUpdate();
		logger.info("delete @" + result);*/
		
		for (Long id : ids) {
			this.delete(this.find(cl, id));
		}
	}
	
	public E find(Class cl, Long key) {
		return (E) entityManager.find(cl, key);
	}

	public List<E> getAll(Class cl) {
		CriteriaQuery<E> criteria = entityManager.getCriteriaBuilder().createQuery(cl);
	    criteria.select(criteria.from(cl));
	    List<E> ListOfEmailDomains = entityManager.createQuery(criteria).getResultList();
	    return ListOfEmailDomains;
	}

}
