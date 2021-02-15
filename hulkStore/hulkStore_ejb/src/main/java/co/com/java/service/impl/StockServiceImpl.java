/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.java.service.impl;

import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

import co.com.dao.StockDAO;
import co.com.java.service.StockService;
import co.com.model.Stock;
import co.com.util.StoreException;

/**
 * <b> Permite implementar los metodos de la tabla Stock . </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,14/02/2021
 * @since JDK 1.8
 */
@Named
@ApplicationScoped
public class StockServiceImpl implements StockService {

	private StockDAO stockDao;

	@Override
	public void actualizarStock(Stock stock) throws StoreException {
		stockDao.update(stock);
	}

	@Override
	public void guardarStock(Stock stock) throws StoreException {
		stockDao.persist(stock);
	}

	@Override
	public Stock buscarStockById(Integer idStock) throws StoreException {
		return stockDao.findById(idStock);
	}

	@Override
	public List<Stock> consultarStock() throws StoreException {
		return stockDao.findAll();
	}

}
