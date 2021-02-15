/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.java.backings;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.annotation.ManagedProperty;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;

import co.com.java.beans.ProductoBean;
import co.com.java.service.ProductoService;
import co.com.model.Producto;
import co.com.util.StoreException;

/**
 * <b> Permite manejar las accciones de la pagina de productos</b>
 * 
 * @author Paul Jimenez
 * @version 1.0,14/02/2021
 * @since JDK 1.8
 */
@Named("productoBacking")
@ViewScoped
public class ProductoBacking implements Serializable {

	private static final long serialVersionUID = 1L;

	Logger log = Logger.getLogger(ProductoBacking.class);

	@ManagedProperty(value = "#{productoBean}")
	private ProductoBean productoBean;

	@Inject
	private ProductoService productoService;

	private List<Producto> productos;

	@PostConstruct
	public void init() throws StoreException {
		consultarProductos();
	}

	/**
	 * 
	 * <b> Permite consultar los productos registrados en la tabla. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 14/02/2021]
	 * </p>
	 *
	 * @throws StoreException
	 */
	public void consultarProductos() throws StoreException {
		productos = productoService.consultarProductos();
	}

}
