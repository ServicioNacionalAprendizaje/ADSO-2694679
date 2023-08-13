/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity.Figuras;

import java.util.Map;

/**
 *
 * @author ariel
 */
public class Figura {
    
    private String nombre;
    
    private Double area;
    
    private Double volumen;
    
    private Double perimetro;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }  

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getVolumen() {
        return volumen;
    }

    public void setVolumen(Double volumen) {
        this.volumen = volumen;
    }

    public Double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Double perimetro) {
        this.perimetro = perimetro;
    }   
    
    public Map<String, Double> CalcularArea(){        
        return null;        
    }
    
    public Map<String, Double> CalcularVolumen(){        
        return null;        
    }
    
    public Map<String, Double> CalcularPerimetro(){        
        return null;        
    }
    
}
