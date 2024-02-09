package com.sena.carritocompra.IService;

import java.util.List;
import java.util.Optional;

import com.sena.carritocompra.Entity.Factura;

public interface IFacturaService {	
	
	/**
	 * Método para consultar todo
	 * **/
	public List<Factura> findAll();
	
	/**
	 * Método para consultar por id
	 * **/
	public Optional<Factura> findById(Long id);
	
	
	/**
	 * Método para guardar
	 * **/
	public Factura save(Factura factura);
	
	/**
	 * Método para modificar
	 * **/
	public void update(Factura factura, Long id);
	
	/**
	 * Método para eliminar
	 * **/
	public void delete(Long id);
	
	/**
	 * Método para eliminar lógico
	 * **/
	public void deletedAt(Long id);
	
	
	
	
}
