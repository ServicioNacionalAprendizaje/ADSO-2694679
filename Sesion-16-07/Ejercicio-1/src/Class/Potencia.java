/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author ariel
 */
public class Potencia extends NumeroReal{

    @Override
    public Double GenerarResultado() {
        this.setResultado(Math.pow(super.getNumero1(), super.getNumero2()));
        return super.getResultado();
    }
    
}
