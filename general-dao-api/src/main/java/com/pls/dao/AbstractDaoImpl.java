package com.pls.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pls.domain.Identifiable;

public abstract class AbstractDaoImpl<Type extends Identifiable<IdType>, IdType> implements AbstractDao<Type, IdType> {

	@PersistenceContext
	private EntityManager em;
	
	public void persist(Type entity) {
		em.persist(entity);
	};
	
}
