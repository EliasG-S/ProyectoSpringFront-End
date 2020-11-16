package client.servicio;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpStatusCodeException;

import client.cliente.ClienteEmpresa;
import client.dominio.EmpresaDTO;
import client.util.ResponseDTO;

@Service
public class EmpresaServicio {
	
	@Autowired
	
	ClienteEmpresa clibd;
	
	public Map<String, Object>listar(){
		
		Map<String, Object>model = new HashMap<>(); 
		
		
		
		try {
			ResponseDTO empresaList=clibd.listar();
			model.put("empresaList", empresaList.getRespuesta());
			
		} catch (Exception e) {
			model.put("err", "Error");
			model.put("msg", "sos pasmado");
			e.printStackTrace();
		}
		return model;
	}
	
	
	public Map<String, Object>crear(EmpresaDTO empresa){
		
		Map<String, Object>model = new HashMap<>();
		
		try {
			
			ResponseDTO res=clibd.crear(empresa);
			
		} catch (HttpStatusCodeException e) {
			model.put("msg",ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
			
			
			
		}
		return model;
	}
	
	public Map<String, Object>actualizar(EmpresaDTO empresa){
		
		Map<String, Object>model = new HashMap<>();
		try {
			
			ResponseDTO res = clibd.actualizar(empresa);
		} catch (HttpStatusCodeException e) {
			model.put("msg",ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		return model;
	}
	
	public Map<String, Object>borrar(Long id){
		Map<String, Object>model = new HashMap<>();
		try {
			clibd.borrar(id);
		} catch (Exception e) {
			model.put("msg",ResponseDTO.MSG_FATAL_ERROR);
			e.printStackTrace();
		}
		return model;
	}
	
	
	
	

}
