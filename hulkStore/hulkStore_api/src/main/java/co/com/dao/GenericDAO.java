/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.dao;

import java.io.Serializable;
import java.util.List;

import co.com.util.StoreException;

/**
 * <b> Permite utilizar un solo DAO para la capa de datos en la aplicación contiene metodos CRUD genericos. </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,11/02/2021
 * @since JDK 1.8
 */
public interface GenericDAO<T, ID extends Serializable> {

	public T findById(ID id);
	
	public List<T> findAll();
	
	public T update(T entity) throws StoreException;

	public void delete(T entity) throws StoreException;

	public void delete(ID id) throws StoreException;

	public void persist(T entity) throws StoreException;

}
