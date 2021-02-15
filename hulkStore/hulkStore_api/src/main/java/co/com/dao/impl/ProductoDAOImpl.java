/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.dao.impl;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import co.com.dao.ProductoDAO;
import co.com.model.Producto;

/**
 * <b> Implementación de metodos para el CRUD de la tabla Producto. </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,14/02/2021
 * @since JDK 1.8
 */
@Stateless
@LocalBean
public class ProductoDAOImpl extends GenericDAOImpl<Producto, Integer> implements ProductoDAO {

}
