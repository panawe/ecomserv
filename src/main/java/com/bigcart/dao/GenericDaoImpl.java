package com.bigcart.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unchecked")
@Repository
public class GenericDaoImpl<E, K> implements GenericDao<E, K> {
	@Autowired
	private EntityManager entityManager;

	public void save(E entity) {
		entityManager.persist(entity);
	}

	public void delete(E entity) {
		entityManager.remove(entity);
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
