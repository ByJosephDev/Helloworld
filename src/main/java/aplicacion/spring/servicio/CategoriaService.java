package aplicacion.spring.servicio;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplicacion.spring.modelo.Categoria;
import aplicacion.spring.repositorio.CategoriaRepo;

@Service
public class CategoriaService implements ICategoriaService{

	@Autowired
	private CategoriaRepo categoriarepo;
	
	@Override
	public List<Categoria> getAll() {
		
		return categoriarepo.findAll();
		
	}

}
