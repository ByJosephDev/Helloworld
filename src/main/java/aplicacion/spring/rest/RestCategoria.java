package aplicacion.spring.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import aplicacion.spring.modelo.Categoria;
import aplicacion.spring.servicio.ICategoriaService;

@RestController
@RequestMapping(path = "/categorias")
public class RestCategoria {
	
	@Autowired
	private ICategoriaService categoriaservice;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@GetMapping(path = "/listar",produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<Categoria> getAllEmpresa() {
		
		return categoriaservice.getAll();
		
	}
	

}
