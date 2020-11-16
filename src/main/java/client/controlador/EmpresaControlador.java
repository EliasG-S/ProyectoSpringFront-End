package client.controlador;

import java.util.HashMap; 

import java.util.Map;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import client.dominio.EmpresaDTO;
import client.servicio.EmpresaServicio;
import client.util.ResponseDTO;


@Controller
@RequestMapping("/empresa")
public class EmpresaControlador {
	
	@Autowired
	
	EmpresaServicio servicioEm;
	
	@GetMapping
	public String list(Model vista) {
		Map<String, Object> modelo= new HashMap<>();
		modelo=(servicioEm.listar());
		vista.addAttribute("empresas", modelo.get("empresaList"));
		return "Empresa";
	}
	
	@GetMapping("/crear")
	public String redirectcrear(Model model) {
		model.addAttribute("creaEmpresa", new EmpresaDTO());
		return "crearEmpresa";
	}

	
	@PostMapping
	public String crear(@ModelAttribute("crearEmpresa")EmpresaDTO empresa) {
		servicioEm.crear(empresa);
		return "redirect:/empresa";
		}
	
	
	
		@GetMapping("/actualizar")
		public String redirectact(Model model) {
			model.addAttribute("actEmpresa", new EmpresaDTO());
			
			return  "ActEmpresa";
		
		}
		
		
		@PostMapping("/update")
		public String actualizar(@ModelAttribute("actEmpresa") EmpresaDTO empresa) {
			servicioEm.actualizar(empresa);
			return "redirect:/empresa";
		}
		
		
		
		
		@PostMapping("/delete/{id}")
		public String borrar(@PathVariable("id")Long id) {
			servicioEm.borrar(id);
			return "redirect:/empresa";
		}
		
		
		
		
		
}
