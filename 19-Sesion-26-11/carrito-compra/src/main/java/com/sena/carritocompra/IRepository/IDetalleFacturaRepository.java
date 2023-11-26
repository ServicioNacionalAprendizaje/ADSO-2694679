package com.sena.carritocompra.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sena.carritocompra.Entity.DetalleFactura;

public interface IDetalleFacturaRepository extends JpaRepository<DetalleFactura, Long>{

}
