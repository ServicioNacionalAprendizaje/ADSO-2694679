/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Class.Pajaro;
import Class.Persona;

/**
 *
 * @author ariel
 */
public class Ejecutar {
    public static void main(String[] args) {
        Pajaro pajaro = new Pajaro();
        pajaro.Caminar();
        pajaro.Cantar();
        pajaro.Volar();
        pajaro.Jugar();
        
        Persona persona = new Persona();
        persona.Jugar();
    }
}
