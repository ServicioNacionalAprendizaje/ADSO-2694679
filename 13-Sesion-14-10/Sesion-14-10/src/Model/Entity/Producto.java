/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

import Conexion.Conexion;
import Model.Interfase.Accion;

/**
 *
 * @author ariel
 */
public class Producto implements Accion{

    private Long id;
    private String codigo;
    private String nombre;
    private Double precio;
    private Long cantidad;
    public Conexion conn; 

    public Producto() {
        this.conn = conn;
    }   
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public void Agregar() {
        String sentenciaSql = "";
        
        sentenciaSql = "INSERT INTO producto( " +
			" codigo,  " +
			" nombre, " +
			" precio, " +
			" cantidad, " +
			" created_at " +
			")VALUES( " +
			" '"+this.getCodigo()+"', " +
			" '"+this.getNombre()+"', " +
			" "+this.getPrecio()+", " +
			" "+this.getCantidad()+", " +
			" now() " +
			");"; 
    }

    @Override
    public void Modificar() {
    String sentenciaSql = "";
    
   sentenciaSql = "UPDATE producto " +
                    "SET " +
                    " codigo='"+this.getCodigo()+"', " +
                    " nombre='"+this.getNombre()+"', " +
                    " precio="+this.getPrecio()+", " +
                    " cantidad="+this.getCantidad()+", " +
                    " updated_at = now() " +
                    "WHERE " +
                    " id="+this.getId()+";"; 
    }

    @Override
    public void Eliminar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Object Consultar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String ConsultarWhereAnd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }   
}
