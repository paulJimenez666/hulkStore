/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.dao.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.com.dao.CarritoDAO;
import co.com.model.Carrito;

/**
 * <b> Permite realizar la implementacion de los metodos </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,14/02/2021
 * @since JDK 1.8
 */
@Stateless
@LocalBean
public class CarritoDAOImpl extends GenericDAOImpl<Carrito, Integer> implements CarritoDAO {

}
