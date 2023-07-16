/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Class.Potencia;
import Class.Suma;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class Operaciones {
    public static void main(String[] args) {
        Potencia potencia = new Potencia();              
        potencia.setNumero1(2.0);        
        potencia.setNumero2(4.0);
        JOptionPane.showMessageDialog(null, "La potencia es: " +potencia.GenerarResultado());
        
        Suma suma = new Suma();
        suma.setNumero1(2.0);        
        suma.setNumero2(4.0);
        JOptionPane.showMessageDialog(null, "La suma es: " +suma.GenerarResultado());
    }
}
