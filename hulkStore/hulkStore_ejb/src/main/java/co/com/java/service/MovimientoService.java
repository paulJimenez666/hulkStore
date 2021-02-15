/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.java.service;

import javax.ejb.Local;

import co.com.model.Movimiento;
import co.com.model.TipoMovimiento;
import co.com.util.StoreException;

/**
 * <b> Permite declarar los metodos a utilizar en la logica de movimiento de servicios. </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,14/02/2021
 * @since JDK 1.8
 */
@Local
public interface MovimientoService {

	/**
	 * 
	 * <b> Permite guardar un registro de movimiento en la tabla </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 14/02/2021]
	 * </p>
	 *
	 * @param movimiento
	 * @throws StoreException
	 */
	public void guardarMovimiento(Movimiento movimiento) throws StoreException;
}
