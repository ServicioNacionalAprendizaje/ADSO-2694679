/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstract;

import Interface.Accion;

/**
 *
 * @author ariel
 */
public abstract class AccionAbstract implements Accion{

    //Define el cómo, vacío de los métodos 
    
    @Override
    public void Caminar() {}

    @Override
    public void Correr(){}

    @Override
    public void Jugar(){}

    @Override
    public void Cantar(){}
        
    @Override
    public void Volar(){}    
}
