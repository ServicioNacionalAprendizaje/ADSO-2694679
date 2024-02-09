/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Producto;

/**
 *
 * @author ariel
 */
public class ProductoC {
    public void GuardarRegistro(String codigo, String nombre, Double precio, Long cantidad){
        Producto producto = new Producto();
        producto.setCodigo(codigo);
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setCantidad(cantidad);
        producto.Agregar();
    }
    
    public void ModificarRegistro(Long  id, String codigo, String nombre, Double precio, Long cantidad){
        Producto producto = new Producto();
        producto.setId(id);
        producto.setCodigo(codigo);
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setCantidad(cantidad);
        producto.Modificar();
    }
    
     public void EliminarRegistro(Long  id){
        Producto producto = new Producto();
        producto.setId(id);
        producto.EliminarFisico();
    }
}
