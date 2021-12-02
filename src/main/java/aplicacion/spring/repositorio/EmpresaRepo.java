package aplicacion.spring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import aplicacion.spring.modelo.Empresa;

public interface EmpresaRepo extends JpaRepository<Empresa, Integer> {

}
