package aplicacion.spring.servicio;

import java.util.List;

import aplicacion.spring.modelo.Producto;

public interface IProductoService {

	public List<Producto> getAll();
	
	public List<Producto> findbyCategoria(int id);
	
}
