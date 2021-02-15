/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.java.service;

import java.util.List;

import javax.ejb.Local;

import co.com.model.Stock;
import co.com.util.StoreException;

/**
 * <b> Permite definir los metodos para el servicio de Stock. </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,14/02/2021
 * @since JDK 1.8
 */
@Local
public interface StockService {

	/**
	 * 
	 * <b> Registra un stock solo si el producto es nuevo </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 14/02/2021]
	 * </p>
	 *
	 * @param stock
	 * @throws StoreException
	 */
	public void guardarStock(Stock stock) throws StoreException;

	/**
	 * 
	 * <b> Actualizar un regsitro en la tabla Stock. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 14/02/2021]
	 * </p>
	 *
	 * @param stock
	 * @throws StoreException
	 */
	public void actualizarStock(Stock stock) throws StoreException;

	/**
	 * 
	 * <b> Permite buscar un registro en la tabla por medio del codigo. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 14/02/2021]
	 * </p>
	 *
	 * @param idStock
	 * @return
	 * @throws StoreException
	 */
	public Stock buscarStockById(Integer idStock) throws StoreException;

	/**
	 * 
	 * <b> Permite obtener una lista del stock existente. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 14/02/2021]
	 * </p>
	 *
	 * @return
	 * @throws StoreException
	 */
	public List<Stock> consultarStock() throws StoreException;

}
