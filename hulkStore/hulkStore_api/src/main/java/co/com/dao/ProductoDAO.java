/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.dao;

import javax.ejb.Local;

import co.com.model.Producto;

/**
 * <b>
 * Permite definir los metodos a implementar.
 * </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,14/02/2021
 * @since JDK 1.8
*/
@Local
public interface ProductoDAO extends GenericDAO<Producto, Integer>{

}
