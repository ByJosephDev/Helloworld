package aplicacion.spring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import aplicacion.spring.modelo.Producto;

public interface ProductoRepo extends JpaRepository<Producto, Integer> {

}
