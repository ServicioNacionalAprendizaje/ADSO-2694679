package com.sena.carritocompra.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.carritocompra.Entity.Factura;

public interface IFacturaRepository extends JpaRepository<Factura, Long>{

}
