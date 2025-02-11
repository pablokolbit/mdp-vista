package es.cursosprhib.mediosdepago.vista.dto;

public class CuentaDTO {
	private Integer idCuenta;
	private String nroCuenta;
	
	public CuentaDTO(Integer idCuenta, String nroCuenta) {
		super();
		this.idCuenta = idCuenta;
		this.nroCuenta = nroCuenta;
	}
	public Integer getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(Integer idCuenta) {
		this.idCuenta = idCuenta;
	}
	public String getNroCuenta() {
		return nroCuenta;
	}
	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	
}
