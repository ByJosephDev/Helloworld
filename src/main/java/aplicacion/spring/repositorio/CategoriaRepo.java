package aplicacion.spring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import aplicacion.spring.modelo.Categoria;

public interface CategoriaRepo extends JpaRepository<Categoria, Integer> {
	
	

}
