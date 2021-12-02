package aplicacion.spring.servicio;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import aplicacion.spring.modelo.Empresa;
import aplicacion.spring.repositorio.EmpresaRepo;

@Service
public class EmpresaService implements IEmpresaService{
	
	@Autowired
	private EmpresaRepo empresarepo;
	
	@Override
	public List<Empresa> getAll() {
		
		return empresarepo.findAll();
				
	}

}
