/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.dao;

import javax.ejb.Local;

import co.com.model.Carrito;

/**
 * <b>
 * Permite definir los metodos para el CRUD de la tabla.
 * </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,14/02/2021
 * @since JDK 1.8
*/
@Local
public interface CarritoDAO extends GenericDAO<Carrito, Integer> {

}
