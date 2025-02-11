package es.cursosprhib.mediosdepago.vista.dto;

import java.util.List;

public class ClienteDTO {
	private Integer idPersona;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String nif;
	private String genero;
	private String municipio;
	private String provincia;	private Integer nroCliente;
	private List<CuentaDTO> cuentas;
	
	public ClienteDTO() {}
	
	public ClienteDTO(Integer idPersona, String nombre, String apellido1, String apellido2, String nif, String genero,
			String municipio, String provincia, Integer nroCliente, List<CuentaDTO> cuentas) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.nif = nif;
		this.genero = genero;
		this.municipio = municipio;
		this.provincia = provincia;
		this.nroCliente = nroCliente;
		this.cuentas = cuentas;
	}

	public Integer getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(Integer idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Integer getNroCliente() {
		return nroCliente;
	}

	public void setNroCliente(Integer nroCliente) {
		this.nroCliente = nroCliente;
	}

	public List<CuentaDTO> getCuentas() {
		return cuentas;
	}

	public void setCuentas(List<CuentaDTO> cuentas) {
		this.cuentas = cuentas;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	@Override
	public String toString() {
		return "ClienteDTO [" + idPersona + ", " + nombre + ", " + apellido1 + ", " + apellido2 + ", " + nif + ", "
				+ genero + ", " + municipio + ", " + provincia + ", " + nroCliente + "]";
	}
}
