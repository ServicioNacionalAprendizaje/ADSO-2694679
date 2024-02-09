/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity.Figuras;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ariel
 */
public class Cuadrado extends Figura{
    
    private Double lado;

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }  

    @Override
    public Map<String, Double> CalcularArea() {
        super.setNombre("Cuadrado");
        super.setArea(this.lado*this.lado);
         
        Map<String, Double> data = new HashMap<>();
        data.put(super.getNombre(),super.getArea());
        return data;
    }
    
    @Override
    public Map<String, Double> CalcularVolumen() {
        super.setNombre("Cubo");
        super.setVolumen(Math.pow(this.lado,3));
         
        Map<String, Double> data = new HashMap<>();
        data.put(super.getNombre(),super.getVolumen());
        return data;
    }
    
    
    
}
