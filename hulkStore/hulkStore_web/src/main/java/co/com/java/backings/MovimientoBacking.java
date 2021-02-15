/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.java.backings;

import java.io.Serializable;

import javax.faces.annotation.ManagedProperty;
import javax.faces.view.ViewScoped;
import javax.inject.Named;

import co.com.java.beans.CarritoBean;
import co.com.model.Movimiento;
import co.com.model.Producto;

/**
 * <b>
 * Incluir aqui la descripcion de la clase.
 * </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,14/02/2021
 * @since JDK 1.8
*/
@Named("movimientoBacking")
@ViewScoped
public class MovimientoBacking implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{carritoBean}")
	private CarritoBean carritoBean;
	
	
		
	public void registrarVenda() {
		for (Producto producto : carritoBean.getProductos()) {
			Movimiento movimiento = new Movimiento();
			movimiento.setDescripcion("VENTA");
			movimiento.setProducto(producto.getIdProducto());
		}
		
	}

}
