package com.sena.carritocompra.IService;

import java.util.List;
import java.util.Optional;

import com.sena.carritocompra.Entity.Cliente;

public interface IClienteService {	
	
	/**
	 * Método para consultar todo
	 * **/
	public List<Cliente> findAll();
	
	/**
	 * Método para consultar por id
	 * **/
	public Optional<Cliente> findById(Long id);
	
	
	/**
	 * Método para guardar
	 * **/
	public Cliente save(Cliente cliente);
	
	/**
	 * Método para modificar
	 * **/
	public void update(Cliente cliente, Long id);
	
	/**
	 * Método para eliminar
	 * **/
	public void delete(Long id);
	
	/**
	 * Método para eliminar lógico
	 * **/
	public void deletedAt(Long id);
	
}
