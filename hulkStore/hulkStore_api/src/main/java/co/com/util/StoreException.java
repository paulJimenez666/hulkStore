/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.util;

/**
 * <b> Excepcion personalizada para el proyecto. </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,11/02/2021
 * @since JDK 1.8
 */
public class StoreException extends Exception {

	private static final long serialVersionUID = 1L;

	public StoreException() {
		super();
	}

	public StoreException(String message) {
		super(message);
	}

	public StoreException(String message, Throwable cause) {
		super(message, cause);
	}

	public StoreException(Throwable cause) {
		super(cause);
	}
}
