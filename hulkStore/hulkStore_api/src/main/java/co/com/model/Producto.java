package co.com.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the producto database table.
 * 
 */
@Entity
@NamedQuery(name="Producto.findAll", query="SELECT p FROM Producto p")
public class Producto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_producto")
	private Integer idProducto;

	private String descripcion;

	private double valor;

	//bi-directional many-to-one association to Carrito
	@OneToMany(mappedBy="producto1", fetch=FetchType.EAGER)
	private List<Carrito> carritos1;

	//bi-directional many-to-one association to Carrito
	@OneToMany(mappedBy="producto2", fetch=FetchType.EAGER)
	private List<Carrito> carritos2;

	public Producto() {
	}

	public Integer getIdProducto() {
		return this.idProducto;
	}

	public void setIdProducto(Integer idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public List<Carrito> getCarritos1() {
		return this.carritos1;
	}

	public void setCarritos1(List<Carrito> carritos1) {
		this.carritos1 = carritos1;
	}

	public Carrito addCarritos1(Carrito carritos1) {
		getCarritos1().add(carritos1);
		carritos1.setProducto1(this);

		return carritos1;
	}

	public Carrito removeCarritos1(Carrito carritos1) {
		getCarritos1().remove(carritos1);
		carritos1.setProducto1(null);

		return carritos1;
	}

	public List<Carrito> getCarritos2() {
		return this.carritos2;
	}

	public void setCarritos2(List<Carrito> carritos2) {
		this.carritos2 = carritos2;
	}

	public Carrito addCarritos2(Carrito carritos2) {
		getCarritos2().add(carritos2);
		carritos2.setProducto2(this);

		return carritos2;
	}

	public Carrito removeCarritos2(Carrito carritos2) {
		getCarritos2().remove(carritos2);
		carritos2.setProducto2(null);

		return carritos2;
	}

}