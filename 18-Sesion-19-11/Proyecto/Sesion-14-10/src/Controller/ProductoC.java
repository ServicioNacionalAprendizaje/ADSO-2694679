/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Entity.Producto;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author ariel
 */
public class ProductoC {

    public void GuardarRegistro(String codigo, String nombre, Double precio, Long cantidad) {

        try {
            Producto producto = new Producto();
            producto.setCodigo(codigo);
            producto.setNombre(nombre);
            producto.setPrecio(precio);
            producto.setCantidad(cantidad);
            producto.Agregar();
            JOptionPane.showMessageDialog(null, "Registro almacendo con éxito.");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No fue posible guardar el registro, consulte con el administrador.");
        }
    }

    public void ModificarRegistro(Long id, String codigo, String nombre, Double precio, Long cantidad) {
        Producto producto = new Producto();
        producto.setId(id);
        producto.setCodigo(codigo);
        producto.setNombre(nombre);
        producto.setPrecio(precio);
        producto.setCantidad(cantidad);
        producto.Modificar();
    }

    public void EliminarRegistro(Long id) {
        Producto producto = new Producto();
        producto.setId(id);
        producto.EliminarFisico();
    }

    public List<Producto> ConsultarRegistro() {
        List<Producto> productos = new ArrayList<>();
        Producto producto = new Producto();
        ResultSet resultSet = (ResultSet) producto.Consultar();

        try {
            while (resultSet.next()) {
                Producto p = new Producto();
                p.setId(resultSet.getLong("id"));
                p.setCodigo(resultSet.getString("codigo"));
                p.setNombre(resultSet.getString("nombre"));
                p.setPrecio(resultSet.getDouble("precio"));
                p.setCantidad(resultSet.getLong("cantidad"));
                p.setState(resultSet.getBoolean("state"));
                // También puedes establecer otros campos si es necesario
                productos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de excepciones según tu lógica
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Manejo de excepciones según tu lógica
            }
        }

        return productos;
    }

    public List<Producto> ListarProducto() {
        List<Producto> productos = new ArrayList<>();
        Producto producto = new Producto();
        ResultSet resultSet = (ResultSet) producto.Consultar();

        try {
            while (resultSet.next()) {
                Producto p = new Producto();
                p.setId(resultSet.getLong("id"));
                p.setNombre(resultSet.getString("nombre"));
                productos.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Manejo de excepciones según tu lógica
        } finally {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Manejo de excepciones según tu lógica
            }
        }

        return productos;
    }

}
