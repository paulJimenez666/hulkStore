/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.java.beans;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

/**
 * <b> Incluir aqui la descripcion de la clase. </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,14/02/2021
 * @since JDK 1.8
 */
@Named("stockBean")
@RequestScoped
public class StockBean implements Serializable {

	private static final long serialVersionUID = 1L;
	private Integer idStock;
	private String descripcion;

	/**
	 * @return the idStock
	 */
	public Integer getIdStock() {
		return idStock;
	}

	/**
	 * @param idStock the idStock to set
	 */
	public void setIdStock(Integer idStock) {
		this.idStock = idStock;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

}
