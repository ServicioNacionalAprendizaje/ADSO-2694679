/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity.ConversionGrados;

import Entity.Abstract.SuperEntity;
import Utils.FunctionNumeric;
import Utils.FunctionString;

/**
 *
 * @author ariel
 */
public class ConversionGrados extends SuperEntity {

    private Double gradoLocal;

    private Double gradoDestino;

    //Objeto de la clase FunctionNumeric
    FunctionNumeric fn = new FunctionNumeric();
    
    //Objeto de la clase FunctionString
    FunctionString fs = new FunctionString();
    
    public Double getGradoLocal() {
        return gradoLocal;
    }

    public void setGradoLocal(Double gradoLocal) {
        this.gradoLocal = gradoLocal;
    }

    public Double getGradoDestino() {
        return gradoDestino;
    }

    public void setGradoDestino(Double gradoDestino) {
        this.gradoDestino = gradoDestino;
    }

    public void CelsiusFahrenheit() {        
        this.setGradoLocal(fn.InputDoubleNumericScanner("Digite los grados Celsius: "));
        this.setGradoDestino((this.getGradoLocal()* 9/5) + 32);
        fs.ShowScanner("La conversión de "+this.getGradoLocal()+" celsuis  a fahrenheit es "+this.getGradoDestino()+"\n");
    }
    
    public void FahrenheitCelsius() {        
        this.setGradoLocal(fn.InputDoubleNumericScanner("Digite los grados Fahrenheit: "));
        this.setGradoDestino((this.getGradoLocal()-32)*5/9);
        fs.ShowScanner("La conversión de "+this.getGradoLocal()+" fahrenheit a celsuis  es "+this.getGradoDestino()+"\n");
    }
}
