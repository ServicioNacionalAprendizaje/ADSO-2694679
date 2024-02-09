package com.sena.carritocompra.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.carritocompra.Entity.Cliente;
import com.sena.carritocompra.IRepository.IClienteRepository;
import com.sena.carritocompra.IService.IClienteService;

@Service
public class ClienteService implements IClienteService{

	@Autowired
	private IClienteRepository repository;
	
	@Override
	public List<Cliente> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Cliente> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Cliente save(Cliente cliente) {
		cliente.setFechaCreacion(LocalDateTime.now());
		return repository.save(cliente);
	}

	@Override
	public void update(Cliente cliente, Long id) {
		//Consultar si existe el registro
				Optional<Cliente> op = repository.findById(id);
				
				if(op.isEmpty()){
					System.out.print("Registro no existe.");
				}else {
					Cliente updateCliente = op.get();					
					updateCliente.setNombre(cliente.getNombre());
					updateCliente.setCorreo(cliente.getCorreo());
					updateCliente.setTelefono(cliente.getTelefono());
					updateCliente.setDireccion(cliente.getDireccion());
					updateCliente.setEstado(cliente.getEstado());
					updateCliente.setFechaModificacion(LocalDateTime.now());
					
					repository.save(updateCliente);
				}	
		
	}
	
	@Override
	public void deletedAt(Long id) {
		//Consultar si existe el registro
		Optional<Cliente> op = repository.findById(id);
		
		if(op.isEmpty()){
			System.out.print("Registro no existe para eliminar.");
		}else {
			Cliente updateCliente = op.get();					
			updateCliente.setFechaEliminacion(LocalDateTime.now());					
			repository.save(updateCliente);
		}	
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);	
	}

}
