/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.java.service;

import java.util.List;

import javax.ejb.Local;

import co.com.model.Usuario;
import co.com.util.StoreException;

/**
 * <b> Permite declarar los metodos a implemntar en el servicio de usuario. </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,11/02/2021
 * @since JDK 1.8
 */
@Local
public interface UsuarioService {

	/**
	 * 
	 * <b> Permite guardar en la tabla usuario un registro. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 11/02/2021]
	 * </p>
	 *
	 * @param usuario
	 * @throws StoreException
	 */
	public void guardarUsuario(Usuario usuario) throws StoreException;

	/**
	 * 
	 * <b> Permite consultar los usuarios regsitrados en la tabla de usuario. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 12/02/2021]
	 * </p>
	 *
	 * @return
	 * @throws StoreException
	 */
	public List<Usuario> consultarUsuarios() throws StoreException;

	/**
	 * 
	 * <b> Permite buscar un usaurio ingresando su id. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 14/02/2021]
	 * </p>
	 *
	 * @param id
	 * @return
	 * @throws StoreException
	 */
	public Usuario buscarUsuario(Integer id) throws StoreException;

	/**
	 * 
	 * <b> Permite actualizar un usuario </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 14/02/2021]
	 * </p>
	 *
	 * @param usuario
	 * @throws StoreException
	 */
	public void actualizarUsuario(Usuario usuario) throws StoreException;

	/**
	 * 
	 * <b> Permite eliminar un registro de la tabla usuario. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 14/02/2021]
	 * </p>
	 *
	 * @param usuario
	 * @throws StoreException
	 */
	public void borrarUsuario(Usuario usuario) throws StoreException;

	/**
	 * 
	 * <b> Permite borrar un usuario por id. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 14/02/2021]
	 * </p>
	 *
	 * @param id
	 * @throws StoreException
	 */
	public void borrarUsuarioById(Integer id) throws StoreException;

}
