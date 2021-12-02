package aplicacion.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import aplicacion.spring.modelo.Producto;
import aplicacion.spring.servicio.IProductoService;

@RestController
@RequestMapping(path = "/productos")
@CrossOrigin(origins = "*")
public class RestProducto {
	
	@Autowired
	private IProductoService productoservice;
	
	@GetMapping(path = "/listar",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Producto> getAllProductos() {
		
		return productoservice.getAll();
		
	}
		
	@GetMapping(path = "/categorias",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Producto> getAllCategorias(@RequestParam(defaultValue = "1" ) int id){
		
		return productoservice.findbyCategoria(id);
		
	}

}
