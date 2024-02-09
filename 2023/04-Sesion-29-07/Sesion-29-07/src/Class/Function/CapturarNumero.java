/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class.Function;

import Class.Abstract.BaseClass;
import java.util.Scanner;

/**
 *
 * @author ariel
 */
public class CapturarNumero extends BaseClass{
    
    private Double numero;

    private Double getNumero() {
        return numero;
    }

    private void setNumero(Double numero) {
        this.numero = numero;
    }

    @Override
    public Double Calcular() {
        int opcion = 0;
        Imprimir("Digite 1/Notas");
        
        opcion = 1;
        switch (opcion) {
            case 1:             
                this.setNumero(CapturarRango(0.0,5.0));
                break;
            default:
                Imprimir("El sofware solo tiene una opcion.");
        }
        return this.getNumero();
    }
    
    @Override
    public void Imprimir(String data) {
        System.out.println(data);
    }
    
    @Override
    public String Capturar() {
        Scanner scanner = new Scanner(System.in);
         return scanner.next();
    }
    
    private Double CapturarRango(Double Inicial, double  Fin){
        Double numeroRango=0.0;
        do{            
            try {
                Imprimir("Digitar nota de 0.0-5.0");
                this.setNumero(Double.valueOf(Capturar()));
            } catch (Exception e) {
                Imprimir("Error, dato no válido");
            }
            
        }while(this.getNumero()<Inicial && this.getNumero()>Fin);
        
        return numeroRango;
    }
}
