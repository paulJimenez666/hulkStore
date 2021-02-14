/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.dao.impl;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import co.com.dao.GenericDAO;
import co.com.util.StoreException;

/**
 * <b> Permite realizar la implementación de los metodos de la interface </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,11/02/2021
 * @since JDK 1.8
 */
public class GenericDAOImpl<T, ID extends Serializable> implements GenericDAO<T, ID> {

	private final Class<T> persistentClass;
	@PersistenceContext(unitName = "hulkStore_api")
	protected EntityManager em;

	@SuppressWarnings("unchecked")
	public GenericDAOImpl() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
	}

	@Override
	public T findById(ID id) {
		return getEntityManager().find(persistentClass, id);
	}

	public EntityManager getEntityManager() {
		return this.em;
	}

	@Override
	public T update(T entity) throws StoreException {
		try {
			return getEntityManager().merge(entity);
		} catch (Throwable ex) {
			throw new StoreException(ex);
		}
	}

	@Override
	public void delete(T entity) throws StoreException {
		try {
			getEntityManager().remove(entity);
		} catch (Throwable ex) {
			throw new StoreException(ex);
		}

	}

	@Override
	public void delete(ID id) throws StoreException {
		T obj = findById(id);
		delete(obj);
	}

	@Override
	public void persist(T entity) throws StoreException {
		try {
			getEntityManager().persist(entity);
		} catch (Throwable ex) {
			throw new StoreException(ex);
		}

	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> findAll() {
		return getEntityManager().createQuery("select o from " + persistentClass.getCanonicalName() + " o").getResultList();
	}
}
