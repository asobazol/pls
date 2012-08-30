package com.pls.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Set;

import javax.ejb.ObjectNotFoundException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.pls.domain.Identifiable;

public abstract class AbstractDaoImpl<Type extends Identifiable<IdType>, IdType> implements AbstractDao<Type, IdType> {

	@PersistenceContext
	protected EntityManager em;

	private final Class<Type> typeClass;

	private final String selectAllQuery;

	private final String selectAllByIdsQuery;

	@SuppressWarnings("unchecked")
	public AbstractDaoImpl() {
		ParameterizedType parameterizedType = (ParameterizedType) getClass().getGenericSuperclass();
		this.typeClass = (Class<Type>) parameterizedType.getActualTypeArguments()[0];

		this.selectAllQuery = "select t from " + typeClass.getSimpleName() + " t";
		this.selectAllByIdsQuery = "select t from " + typeClass.getSimpleName() + " t where id in :ids";
	}

	@Override
	public void persist(Type entity) {
		em.persist(entity);
	}

	@Override
	public void remove(Type entity) {
		em.remove(entity);
	}

	public Type find(IdType id) {
		return em.find(typeClass, id);
	}

	public Type get(IdType id) throws ObjectNotFoundException {
		Type result = em.find(typeClass, id);
		if (result == null) {
			throw new ObjectNotFoundException("Object not found, type=" + typeClass.toString() + ", id=" + id);
		} else {
			return result;
		}
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Type> getAll() {
		return em.createQuery(selectAllQuery).getResultList();
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Type> getAll(Set<IdType> ids, boolean ignoreMissing) throws ObjectNotFoundException {
		List<Type> result = em.createQuery(selectAllByIdsQuery)
				.setParameter("ids", ids)
				.getResultList();

		if (!ignoreMissing && result.size() != ids.size()) {
			throw new ObjectNotFoundException("Requested " + ids.size() + " " + typeClass + " objects, found " + result.size());
		}

		return result;

	}
}
