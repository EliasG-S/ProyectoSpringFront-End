package client.cliente;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import client.dominio.EmpresaDTO;
import client.util.ResponseDTO;

@FeignClient(url="http://192.168.0.13:8090", name="empresa")

public interface ClienteEmpresa {

	@GetMapping(path = "/empresa", produces="application/json")
	ResponseDTO listar();
			
	@PostMapping(path = "/empresa", produces="application/json")
	ResponseDTO crear(@RequestBody EmpresaDTO empresa);
	
	@PutMapping(path = "/empresa", produces="application/json")
	ResponseDTO actualizar(@RequestBody EmpresaDTO empresa);
	
	@DeleteMapping(path = "/empresa/{id}", produces="application/json")
	ResponseDTO borrar(@RequestParam Long id);
	
}
