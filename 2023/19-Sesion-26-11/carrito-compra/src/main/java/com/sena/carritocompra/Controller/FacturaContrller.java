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
import com.sena.carritocompra.IService.IFacturaService;

@CrossOrigin(originPatterns = "*")
@RestController
@RequestMapping("v1/api/factura")
public class FacturaContrller {
	@Autowired
	private IFacturaService service;
	
	@GetMapping
	public List<Factura> findAll() {
		return service.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Factura> findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public Factura save(@RequestBody Factura factura) {
		return service.save(factura);
	}
	
	@PutMapping("{id}")
	public void save(@RequestBody Factura factura, @PathVariable  Long id) {
		service.update(factura, id);
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
