package es.cursosprhib.mediosdepago.vista;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.cursosprhib.mediosdepago.modelo.Cliente;
import es.cursosprhib.mediosdepago.servicio.GeneraExtracto;
import es.cursosprhib.mediosdepago.vista.dto.ClienteDTO;
import es.cursosprhib.mediosdepago.vista.dto.MapperCliente;

@RestController
@RequestMapping("/api/clientes")
public class ClienteRestController {

	@Autowired
	private GeneraExtracto scio;
	
	@GetMapping
	public List<ClienteDTO> getClientes(){
		return MapperCliente.toDTO(scio.getClientes(""));
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ClienteDTO> getClienteId(@PathVariable Integer id){
		Optional<Cliente> cliente = scio.getClientePorId(id);
		return cliente.isPresent() ? ResponseEntity.ok(MapperCliente.toDTO(cliente.get())) : ResponseEntity.notFound().build();
	}
	
	@GetMapping("/buscar/{nombre}")
	public List<ClienteDTO> getClientesNombre(@PathVariable String nombre){
		return MapperCliente.toDTO(scio.getClientes(nombre));
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<ClienteDTO> updateCliente(@PathVariable Integer id, @RequestBody ClienteDTO cliDTO){
		Cliente actualizado = scio.grabaCliente(MapperCliente.toCliente(cliDTO));
		return ResponseEntity.ok(MapperCliente.toDTO(actualizado));
	}
	
	@PostMapping
	public ResponseEntity<ClienteDTO> addCliente(@RequestBody ClienteDTO cliDTO){
		Cliente actualizado = scio.grabaCliente(MapperCliente.toCliente(cliDTO));
		return ResponseEntity.ok(MapperCliente.toDTO(actualizado));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Void> deleteCliente(@PathVariable Integer id){
		scio.eliminaCliente(id);
		return ResponseEntity.noContent().build();
	}
}
