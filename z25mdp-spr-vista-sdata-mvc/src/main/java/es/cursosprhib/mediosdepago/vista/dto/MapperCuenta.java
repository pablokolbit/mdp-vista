package es.cursosprhib.mediosdepago.vista.dto;

import java.util.Collection;
import java.util.List;

import es.cursosprhib.mediosdepago.modelo.Cuenta;

public class MapperCuenta {

	public static CuentaDTO toDTO(Cuenta cuenta) {
		return new CuentaDTO(cuenta.getIdCuenta(), cuenta.getNroCuenta());
	}
	
	public static List<CuentaDTO> toDTO(Collection<Cuenta> cuentas){
		return cuentas.stream().map(c -> toDTO(c)).toList();
	}
}
