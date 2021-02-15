/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.java.service.impl;

import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import co.com.dao.MovimientoDAO;
import co.com.java.service.MovimientoService;
import co.com.model.Movimiento;
import co.com.util.StoreException;

/**
 * <b> Permite implementar los metodos para manejar el CRUD de movimiento . </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,14/02/2021
 * @since JDK 1.8
 */
@Named
@ApplicationScoped
public class MovimientoServiceImpl implements MovimientoService {

	@EJB
	private MovimientoDAO movimientoDao;

	@Override
	public void guardarMovimiento(Movimiento movimiento) throws StoreException {
		
		movimientoDao.persist(movimiento);
	}

}
