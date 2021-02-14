/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.java.service.impl;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import co.com.dao.UsuarioDAO;
import co.com.java.service.UsuarioService;
import co.com.model.Usuario;
import co.com.util.StoreException;

/**
 * <b> Implemenetacion de metodos. </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,11/02/2021
 * @since JDK 1.8
 */

@Stateless
@LocalBean
public class UsuarioServiceImpl implements UsuarioService {

	@Inject
	UsuarioDAO usuarioDao;

	@Override
	public void guardarUsuario(Usuario usuario) throws StoreException {
		usuarioDao.persist(usuario);
	}

	@Override
	public List<Usuario> consultarUsuario() throws StoreException {
		return usuarioDao.findAll();
	}

}
