/*
 * Copyright 2021 Paul Jimenez
 * Todos los derechos reservados (+57)3117976833
 */
package co.com.java.backings;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.faces.annotation.ManagedProperty;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import org.apache.log4j.Logger;

import co.com.java.beans.UsuarioBean;
import co.com.java.service.UsuarioService;
import co.com.model.Usuario;
import co.com.util.StoreException;

/**
 * <b> Permite manejar las operaciones derivadas de la pagina web en la aplicacion. </b>
 * 
 * @author Paul Jimenez
 * @version 1.0,12/02/2021
 * @since JDK 1.8
 */
@Named("usuarioBacking")
@ViewScoped
public class UsuarioBacking implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	Logger log = Logger.getLogger(UsuarioBacking.class);

	@ManagedProperty(value = "#{usuarioBean}")
	private UsuarioBean usuarioBean;

	@Inject
	private UsuarioService usuarioService;

	private List<Usuario> usuarios;
	private Usuario usuarioNew;

	@PostConstruct
	public void init() throws StoreException {
		consultarUsuarios();
	}

	/**
	 * 
	 * <b> Permite consultar todos los usuarios registrados en la base de datos. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 12/02/2021]
	 * </p>
	 * 
	 * @throws StoreException
	 *
	 */
	public void consultarUsuarios() throws StoreException {
		usuarios = usuarioService.consultarUsuarios();
	}

	/**
	 * 
	 * <b> permite crear un nuevo usuario. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 13/02/2021]
	 * </p>
	 *
	 * @return
	 */
	public String nuevo() {

		Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		sessionMap.put("usuario", usuarioNew);
		return "/faces/Usuario.xhtml";
	}

	/**
	 * 
	 * <b> permite guardar un registro en la tabla usuario. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 13/02/2021]
	 * </p>
	 *
	 * @param usuario
	 * @return
	 */
	public String guardar(Usuario usuario) {
		// guarda la fecha de registro
		usuario.setFecharegistro(new Date());

		try {
			usuarioService.guardarUsuario(usuario);
		} catch (StoreException e) {
			e.printStackTrace();
		}
		return "/faces/index.xhtml";
	}

	/**
	 * 
	 * <b> Permite editar un usuario. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 14/02/2021]
	 * </p>
	 *
	 * @param id
	 * @return
	 */
	public String editar(Integer id) {
		Usuario usuarioEdit = new Usuario();
		try {
			usuarioEdit = usuarioService.buscarUsuario(id);

			Map<String, Object> sessionMap = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
			sessionMap.put("usuario", usuarioEdit);
		} catch (StoreException e) {
			e.printStackTrace();
		}
		return "/faces/EditarUsuario.xhtml";
	}

	/**
	 * 
	 * <b> Permite actualizar un usuario y agregar la fecha de registro. </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 14/02/2021]
	 * </p>
	 *
	 * @param usuario
	 * @return
	 */
	public String actualizar(Usuario usuario) {
		// guarda la fecha de actualizacion
		Date fechaActual = new Date();
		usuario.setFecharegistro(fechaActual);

		try {
			usuarioService.actualizarUsuario(usuario);
		} catch (StoreException e) {
			e.printStackTrace();
		}
		return "/faces/index.xhtml";
	}

	/**
	 * 
	 * <b> Permite eliminar un usuario de la tabla </b>
	 * <p>
	 * [Author: Paul Jimenez, Date: 14/02/2021]
	 * </p>
	 *
	 * @param id
	 * @return
	 */
	public String eliminar(Integer id) {
		try {
			usuarioService.borrarUsuarioById(id);
		} catch (StoreException e) {
			e.printStackTrace();
		}
		return "/faces/index.xhtml";
	}

	/**
	 * @return the usuarioBean
	 */
	public UsuarioBean getUsuarioBean() {
		return usuarioBean;
	}

	/**
	 * @param usuarioBean the usuarioBean to set
	 */
	public void setUsuarioBean(UsuarioBean usuarioBean) {
		this.usuarioBean = usuarioBean;
	}

	/**
	 * @return the usuarios
	 */
	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	/**
	 * @param usuarios the usuarios to set
	 */
	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	/**
	 * 
	 */
	public UsuarioBacking() {
		// TODO Auto-generated constructor stub
	}

}
