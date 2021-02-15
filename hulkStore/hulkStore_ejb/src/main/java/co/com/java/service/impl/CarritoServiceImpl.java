/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.java.service.impl;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import co.com.dao.CarritoDAO;
import co.com.dao.ProductoDAO;
import co.com.java.service.CarritoService;

/**
 * <b> Permite implementar los metodos para la tabla de carrito de compras. </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,14/02/2021
 * @since JDK 1.8
 */
@Named
@ApplicationScoped
public class CarritoServiceImpl implements CarritoService {
	@EJB
	private CarritoDAO carritoDao;
	
	
}
