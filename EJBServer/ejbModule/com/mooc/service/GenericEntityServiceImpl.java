package com.mooc.service;

import java.util.Collection;
import java.util.List;
import javax.persistence.EntityExistsException;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TransactionRequiredException;

public class GenericEntityServiceImpl<T> implements GenericEntityService<T>, GenericEntityServiceLocal<T> {

	@PersistenceContext(unitName="ejbProject")
	protected EntityManager entityManager;
	private final Class<T> clazz;

	protected GenericEntityServiceImpl(Class<T> clazz) {
		this.clazz = clazz;
	}

	public boolean create(T entity) {
		try {
			entityManager.persist(entity);
		} catch (EntityExistsException e) {
			System.out.println("CREATION ENTITY ERROR : "+e.getMessage());
			return false;
		}
		return true;
	}

	public List<T> findAll() {
		List<T> list = entityManager.createQuery("select e from " + clazz.getSimpleName()
		+ " e", clazz).getResultList();
		return list;
	}
	
	@SuppressWarnings("unchecked")
	public Collection<T> findAllC() {
	    Query query = entityManager.createQuery("select e from " + clazz.getSimpleName()+ " e");
	    return (Collection<T>) query.getResultList();
	}

	public T findById(int id) {
		return entityManager.find(clazz, id);
	}

	public boolean remove(T entity) {
		try {
			entityManager.remove(entityManager.merge(entity));
		} catch (IllegalArgumentException | TransactionRequiredException e) {
			System.out.println("REMOVE ENTITY ERROR : "+e.getMessage());
			return false;
		}
		return true;
	}

	public boolean update(T entity) {
		try {
			entityManager.merge(entity);
		} catch (IllegalArgumentException | TransactionRequiredException e) {
			System.out.println("UPDATE ENTITY ERROR : "+e.getMessage());
			return false;
		}
		return true;
	}
}