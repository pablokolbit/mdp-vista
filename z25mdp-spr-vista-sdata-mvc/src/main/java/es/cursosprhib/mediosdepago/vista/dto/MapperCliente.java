package es.cursosprhib.mediosdepago.vista.dto;

import java.util.Collection;
import java.util.List;

import es.cursosprhib.mediosdepago.modelo.Cliente;
import es.cursosprhib.mediosdepago.modelo.Genero;

public class MapperCliente {

	public static ClienteDTO toDTO(Cliente c) {
		return new ClienteDTO(
			c.getIdPersona(), c.getNombre(), c.getApellido1(), c.getApellido2(), c.getNif(), c.getSexo().toString(), c.getMunicipio(), 
			c.getProvincia(), c.getNroCliente(), c.getCuentas()!=null ?	MapperCuenta.toDTO(c.getCuentas()) : null);
	}
	
	public static List<ClienteDTO> toDTO(Collection<Cliente> clientes){
		return clientes.stream().map(c -> toDTO(c)).toList();
	}

	public static Cliente toCliente(ClienteDTO cliDTO) {
		return new Cliente(cliDTO.getIdPersona(), cliDTO.getNombre(), cliDTO.getApellido1(), cliDTO.getApellido2(), cliDTO.getNif(), 
			 Genero.valueOf(cliDTO.getGenero()), cliDTO.getMunicipio(), cliDTO.getProvincia(), cliDTO.getNroCliente());
	}
}
