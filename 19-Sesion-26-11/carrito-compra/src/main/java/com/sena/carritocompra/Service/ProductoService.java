package com.sena.carritocompra.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sena.carritocompra.Entity.Cliente;
import com.sena.carritocompra.Entity.Producto;
import com.sena.carritocompra.IRepository.IProductoRepository;
import com.sena.carritocompra.IService.IProductoService;

@Service
public class ProductoService implements IProductoService{

	@Autowired
	private IProductoRepository repository;
	
	@Override
	public List<Producto> findAll() {
		return repository.findAll();
	}

	@Override
	public Optional<Producto> findById(Long id) {
		return repository.findById(id);
	}

	@Override
	public Producto save(Producto producto) {
		producto.setFechaCreacion(LocalDateTime.now());
		return repository.save(producto);
	}

	@Override
	public void update(Producto producto, Long id) {
		//Consultar si existe el registro
		Optional<Producto> op = repository.findById(id);
		
		if(op.isEmpty()){
			System.out.print("Registro no existe.");
		}else {
			Producto updateProducto = op.get();
			updateProducto.setCodigo(producto.getCodigo());
			updateProducto.setNombre(producto.getNombre());
			updateProducto.setPrecio(producto.getPrecio());
			updateProducto.setCantidad(producto.getCantidad());
			updateProducto.setEstado(producto.getEstado());
			updateProducto.setFechaModificacion(LocalDateTime.now());
			
			repository.save(updateProducto);
		}		
	}

	@Override
	public void delete(Long id) {
		repository.deleteById(id);		
	}
	@Override
	public void deletedAt(Long id) {
		//Consultar si existe el registro
		Optional<Producto> op = repository.findById(id);
		
		if(op.isEmpty()){
			System.out.print("Registro no existe para eliminar.");
		}else {
			Producto updateProducto = op.get();					
			updateProducto.setFechaEliminacion(LocalDateTime.now());					
			repository.save(updateProducto);
		}	
		
	}

}
