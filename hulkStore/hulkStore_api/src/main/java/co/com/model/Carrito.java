package co.com.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the carrito database table.
 * 
 */
@Entity
@NamedQuery(name="Carrito.findAll", query="SELECT c FROM Carrito c")
public class Carrito implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_carrito")
	private Integer idCarrito;

	private String descripcion;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="id_carrito")
	private Producto producto1;

	//bi-directional many-to-one association to Producto
	@ManyToOne
	@JoinColumn(name="id_producto")
	private Producto producto2;

	public Carrito() {
	}

	public Integer getIdCarrito() {
		return this.idCarrito;
	}

	public void setIdCarrito(Integer idCarrito) {
		this.idCarrito = idCarrito;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Producto getProducto1() {
		return this.producto1;
	}

	public void setProducto1(Producto producto1) {
		this.producto1 = producto1;
	}

	public Producto getProducto2() {
		return this.producto2;
	}

	public void setProducto2(Producto producto2) {
		this.producto2 = producto2;
	}

}