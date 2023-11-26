package com.sena.carritocompra.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.carritocompra.Entity.Factura;
import com.sena.carritocompra.IRepository.IFacturaRepository;
import com.sena.carritocompra.IService.IFacturaService;

@Service
public class FacturaService implements IFacturaService{

	@Autowired
	private IFacturaRepository repository;
	
	@Override
	public List<Factura> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Factura> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Factura save(Factura factura) {
		return repository.save(factura);
	}

	@Override
	public void update(Factura factura, Long id) {
		//Consultar si existe el registro
				Optional<Factura> op = repository.findById(id);
				
				if(op.isEmpty()){
					System.out.print("Registro no existe.");
				}else {
					Factura updateFactura = op.get();					
					updateFactura.setCodigo(factura.getCodigo());
					updateFactura.setFecha(factura.getFecha());
					updateFactura.setValorTotal(factura.getValorTotal());
					updateFactura.setClienteId(factura.getClienteId());
					updateFactura.setEstado(factura.getEstado());
					updateFactura.setFechaModificacion(LocalDateTime.now());
					
					repository.save(updateFactura);
				}	
		
	}
	
	@Override
	public void deletedAt(Long id) {
		//Consultar si existe el registro
		Optional<Factura> op = repository.findById(id);
		
		if(op.isEmpty()){
			System.out.print("Registro no existe para eliminar.");
		}else {
			Factura updateFactura= op.get();					
			updateFactura.setFechaEliminacion(LocalDateTime.now());					
			repository.save(updateFactura);
		}	
		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);	
	}

}
