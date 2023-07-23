/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View.Areas;

import Class.Areas.Triangulo;
import Class.CapturaNumero;

/**
 *
 * @author ariel
 */
public class Areas {
    public static void main(String[] args) {
        //Objeto para capturar datos
        CapturaNumero x = new CapturaNumero();
        
        //Hallar área del triángulo
        Triangulo triangulo = new Triangulo();
        x.setMensaje("Digite la base del triángulo:");
        triangulo.setBase(x.Capturar());
        x.setMensaje("Digite la altura del triángulo:");
        triangulo.setAltura(x.Capturar());
        System.out.println("El área del triángulo es: "+triangulo.Area());
        
    }
}
