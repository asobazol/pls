package com.pls.dao;

import java.util.List;
import java.util.Set;

import javax.ejb.ObjectNotFoundException;

import com.pls.domain.Identifiable;

public interface AbstractDao<Type extends Identifiable<IdType>, IdType> {
	public void persist(Type entity);
	public void remove(Type entity);
	public Type find(IdType id);
	public Type get(IdType id) throws ObjectNotFoundException;
	public List<Type> getAll();
	public List<Type> getAll(Set<IdType> ids, boolean ignoreMissing) throws ObjectNotFoundException;
}
