package com.mooc.service;

import java.util.Collection;
import java.util.List;
import javax.ejb.Remote;

@Remote
public interface GenericEntityService<T> {

	public boolean create(T entity);
	public boolean remove(T entity);
	public boolean update(T entity);
	
	public List<T> findAll();
	public T findById(int id);
	public Collection<T> findAllC();
}
