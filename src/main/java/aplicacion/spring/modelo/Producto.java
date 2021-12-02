package aplicacion.spring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private int id;
	
	@Column(name = "nombre")
	private String nombre;
		
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "paginacompra")
	private String paginacompra;
	
	@Column(name = "paginaweb")
	private String paginaweb;
	
	@Column(name = "imagen")
	private String imagen;
	
	@Column(name = "id_categoria")
	private int id_categoria;

	@Column(name = "id_empresa")
	private int id_empresa;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getPaginacompra() {
		return paginacompra;
	}

	public void setPaginacompra(String paginacompra) {
		this.paginacompra = paginacompra;
	}

	public String getPaginaweb() {
		return paginaweb;
	}

	public void setPaginaweb(String paginaweb) {
		this.paginaweb = paginaweb;
	}

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public int getId_categoria() {
		return id_categoria;
	}

	public void setId_categoria(int id_categoria) {
		this.id_categoria = id_categoria;
	}

	public int getId_empresa() {
		return id_empresa;
	}

	public void setId_empresa(int id_empresa) {
		this.id_empresa = id_empresa;
	}
	
}
