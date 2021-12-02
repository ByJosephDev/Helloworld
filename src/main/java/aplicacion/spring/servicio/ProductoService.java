package aplicacion.spring.servicio;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import aplicacion.spring.libreria.Libreria;
import aplicacion.spring.modelo.Producto;

@SuppressWarnings({ "rawtypes", "unchecked" })
@Service
public class ProductoService implements IProductoService {

	//@Autowired
	//private ProductoRepo productorepo;
	
	
	@Override
	public List<Producto> getAll() {
		
		Libreria lib=new Libreria();
		JdbcTemplate td=lib.obtener_conexion();
		String codigo="select p.id_producto,p.nombre,p.precio,p.paginacompra,p.paginaweb,p.imagen,c.nombre "
				+ "as categoria,e.nombre as empresa from Producto p inner join Categoria c "
				+ "on(c.id_categoria=p.id_categoria) inner join Empresa e on(e.id_empresa=p.id_empresa);";
		List lista= td.queryForList(codigo);
		return lista;
	
	}

	@Override
	public List<Producto> findbyCategoria(int id) {
		
		Libreria lib=new Libreria();
		JdbcTemplate td=lib.obtener_conexion();
		String codigo="select p.id_producto,p.nombre,p.precio,p.paginacompra,p.paginaweb,p.imagen,c.nombre "
				+ "as categoria,e.nombre as empresa from Producto p inner join Categoria c "
				+ "on(c.id_categoria=p.id_categoria) inner join Empresa e on(e.id_empresa=p.id_empresa) where p.id_categoria="+id+";";
		List lista= td.queryForList(codigo);
		return lista;
		
	}

}
