package com.sena.carritocompra.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sena.carritocompra.Entity.Factura;
import com.sena.carritocompra.Entity.Producto;
import com.sena.carritocompra.IService.IProductoService;
@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("v1/api/producto")
public class ProductoController {
	@Autowired
	private IProductoService service;
	
	@PostMapping
	public Producto save(@RequestBody Producto producto) {
		return service.save(producto);
	}
	
	@GetMapping("{id}")
	public Optional<Producto> findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@GetMapping
	public List<Producto> findAll() {
		return service.findAll();
	}
	@PutMapping("{id}")
	public void save(@RequestBody Producto Producto, @PathVariable  Long id) {
		service.update(Producto, id);
	}
	@PutMapping("deleted-at/{id}")
	public void deletedAt(@PathVariable  Long id) {
		service.deletedAt(id);
	}
	
	@DeleteMapping("{id}")
	public void delete(@PathVariable  Long id) {
		service.delete(id);
	} 
}
