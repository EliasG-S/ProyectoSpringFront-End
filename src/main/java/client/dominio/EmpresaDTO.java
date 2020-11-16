package client.dominio;

public class EmpresaDTO {

	
	private Long idEmpresa;
	private String nomEmpresa;
	private String area;
	private String cargo;
	private String ciudad;
	private String contacto;
	private String pais;
	private String tiempo;
	
	public EmpresaDTO(){
		
	}
	
	
	public EmpresaDTO(Long idEmpresa,String nomEmpresa, String area,String cargo, String ciudad, 
			String contacto,String pais, String tiempo) {
		
		this.idEmpresa= idEmpresa;
		this.nomEmpresa= nomEmpresa;
		this.area= area;
		this.cargo=cargo;
		this.ciudad=ciudad;
		this.contacto=contacto;
		this.pais=pais;
		this.tiempo=tiempo;
		
	}


	public Long getIdEmpresa() {
		return idEmpresa;
	}


	public void setIdEmpresa(Long idEmpresa) {
		this.idEmpresa = idEmpresa;
	}


	public String getNomEmpresa() {
		return nomEmpresa;
	}


	public void setNomEmpresa(String nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}


	public String getArea() {
		return area;
	}


	public void setArea(String area) {
		this.area = area;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getCiudad() {
		return ciudad;
	}


	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}


	public String getContacto() {
		return contacto;
	}


	public void setContacto(String contacto) {
		this.contacto = contacto;
	}


	public String getPais() {
		return pais;
	}


	public void setPais(String pais) {
		this.pais = pais;
	}


	public String getTiempo() {
		return tiempo;
	}


	public void setTiempo(String tiempo) {
		this.tiempo = tiempo;
	}
	
	
}
