package com.sena.corritobackend.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "factura_detalle")
public class FacturaDetalle {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="cantidad", nullable = false)
	private Integer cantidad;

	@Column(name="valor_pagar", nullable = false)
	private Double valorPagar;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "producto_id", nullable = false)
	private Producto productoId;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "factura_id", nullable = false)
	private Factura facturaId;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Double getValorPagar() {
		return valorPagar;
	}

	public void setValorPagar(Double valorPagar) {
		this.valorPagar = valorPagar;
	}

	public Producto getProductoId() {
		return productoId;
	}

	public void setProductoId(Producto productoId) {
		this.productoId = productoId;
	}

	public Factura getFacturaId() {
		return facturaId;
	}

	public void setFacturaId(Factura facturaId) {
		this.facturaId = facturaId;
	}
}
