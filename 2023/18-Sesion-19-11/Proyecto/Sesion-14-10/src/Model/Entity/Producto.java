/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model.Entity;

import Conexion.Conexion;
import Model.Interfase.Accion;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author ariel
 */
public class Producto implements Accion {

    private Long id;
    private String codigo;
    private String nombre;
    private Double precio;
    private Long cantidad;
    private Boolean state;
    
    public Conexion conn = new Conexion();

    public Producto() {
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

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    
    @Override
    public void Agregar() {
        String sql;

        sql = "INSERT INTO producto ("
                + "codigo, "
                + "nombre, "
                + "precio, "
                + "cantidad, "
                + "created_at"
                + ") VALUES ("
                + "' " + this.getCodigo() + "', "
                + "' " + this.getNombre() + "', "
                + this.getPrecio() + ", "
                + this.getCantidad() + ", "
                + " NOW()"
                + ");";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();

    }

    @Override
    public void Modificar() {
        String sql;

        sql = "UPDATE producto SET "
                + "codigo = '" + this.getCodigo() + "', "
                + "nombre = '" + this.getNombre() + "', "
                + "precio = " + this.getPrecio() + ", "
                + "cantidad = " + this.getCantidad() + ", "
                + "updated_at = NOW() "
                + "WHERE id = '" + this.getId() + "';";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public void EliminarFisico() {
        String sql;

        sql = " DELETE FROM producto WHERE id = " + this.getId() + ";";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public void EliminarLogico() {
        String sql;

        sql = " UPDATE producto SET deleted_at = NOW() WHERE id = " + this.getId() + ";";
        conn.ejecutarSQL(sql);
        conn.cerrarConexion();
    }

    @Override
    public Object Consultar() {
        ResultSet resultSet = null;
        String sql;

        sql = " SELECT  "
                + " id, "
                + " codigo, "
                + " nombre, "
                + " precio, "
                + " cantidad, "
                + " state "
                + " FROM   "
                + " producto "
                + " WHERE deleted_at is null; ";

        resultSet = conn.consultarSQL(sql);
        return resultSet;
    }

    @Override
    public String ConsultarWhereAnd() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
