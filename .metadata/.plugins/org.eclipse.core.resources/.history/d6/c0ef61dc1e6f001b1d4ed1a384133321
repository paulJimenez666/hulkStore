package co.com.model;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * 
 * <b> Clase que incluye el llamado a la persistencia de tal manera que podamos instanciar a este archivo y podamos tener contacto con la base de
 * datos. </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,11/02/2021
 * @since JDK 1.8
 */
public class JPAUtil {
	// Declaramos una variable con el nombre de la unidad de persistencia
	private static final String PERSISTENCE_UNIT_NAME = "hulkStore_api";

	// Creamos una variable de tipo EntityManagerFactory
	private static EntityManagerFactory factory;

	public static EntityManagerFactory getEntityManagerFactory() {
		if (factory == null) {
			// Referenciamos a nuestra unidad de persistencia para gestionar nuestras entidades
			factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		return factory;
	}

	/**
	 * 
	 * <b> Definimos un método close para liberar el objeto Entity Manager </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 11/02/2021]
	 * </p>
	 *
	 */
	public static void shutdown() {
		if (factory != null) {
			factory.close();
		}
	}
}
