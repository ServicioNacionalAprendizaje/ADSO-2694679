package com.sena.carritocompra.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.carritocompra.Entity.Cliente;

public interface IClienteRepository extends JpaRepository<Cliente, Long> {

}
