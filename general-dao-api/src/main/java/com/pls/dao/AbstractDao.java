package com.pls.dao;

import com.pls.domain.Identifiable;

public interface AbstractDao<Type extends Identifiable<IdType>, IdType> {

	public void persist(Type entity);
	
}
