/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Entity.Figuras.Cuadrado;
import Utils.FunctionNumeric;
import Utils.FunctionString;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ariel
 */
public class MostrarFiguras {
    
    public static void main(String[] args) {
        FunctionNumeric fn = new FunctionNumeric();
        FunctionString fs = new FunctionString();
        
        //Objeto para recibir data 
        Map<String, Double> data = new HashMap<>();
        
        //Capurar infomraciòn de cuadrado
        Cuadrado c = new Cuadrado();
        c.setLado(fn.InputDoubleNumericPositiveScanner("Digite el tamaño de unos de los dados del cuadrado: "));        
        data = c.CalcularArea();
        data = c.CalcularVolumen();        
        
         // Recorrer y mostrar todos los pares clave-valor
        for (Map.Entry<String, Double> entry : data.entrySet()) {
            String nombre = entry.getKey();
            Double value = entry.getValue();
            fs.ShowScanner("Figura "+nombre+", area: "+value+"\n");
        }
    }
    
}
