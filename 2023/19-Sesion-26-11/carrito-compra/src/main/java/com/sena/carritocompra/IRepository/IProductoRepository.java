package com.sena.carritocompra.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.carritocompra.Entity.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Long>{

}
