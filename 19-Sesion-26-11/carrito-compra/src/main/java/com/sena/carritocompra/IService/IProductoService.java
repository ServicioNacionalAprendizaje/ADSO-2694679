package com.sena.carritocompra.IService;

import java.util.List;
import java.util.Optional;

import com.sena.carritocompra.Entity.Producto;

public interface IProductoService {	
	
	/**
	 * Método para consultar todo
	 * **/
	public List<Producto> findAll();
	
	/**
	 * Método para consultar por id
	 * **/
	public Optional<Producto> findById(Long id);
	
	
	/**
	 * Método para guardar
	 * **/
	public Producto save(Producto producto);
	
	/**
	 * Método para modificar
	 * **/
	public void update(Producto producto, Long id);
	
	/**
	 * Método para eliminar
	 * **/
	public void delete(Long id);
	
	
	
	
}
