/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

/**
 *
 * @author ariel
 */
public class FunctionNumeric {

    private Double numero;

    private Double getNumero() {
        return numero;
    }

    private void setNumero(Double numero) {
        this.numero = numero;
    }
    
    //Validar la captura de cualquier nuemro real
    private void InputNumeric(String mensaje, int tipo) {
        Boolean validar = false;
        FunctionString fs = new FunctionString();

        //Validar que se ingrese el dato correcto
        while (validar == false) {
            try {
                if(tipo==1){
                    this.setNumero(Double.parseDouble(fs.InputScanner(mensaje)));
                }else{
                    this.setNumero(Double.parseDouble(fs.InputJOptionPane(mensaje)));
                }
                validar = true;
            } catch (Exception e) {
                if (tipo==1) {
                    fs.ShowScanner("Ha ingresado un dato no válido. ");
                }else{
                    fs.ShowJOptionPane("Ha ingresado un dato no válido. ");
                }
            }
        }        
    }    
    
    //Capturar cualquier real por Scanner
    public Double InputDoubleNumericScanner(String mensaje) {
        InputNumeric(mensaje, 1);
        return this.getNumero();
    }
    
    //Capturar cualquier real por JOptionPane
    public Double InputDoubleNumericJOptionPane(String mensaje) {
        InputNumeric(mensaje, 2);
        return this.getNumero();
    }
    
    //Capturar cualquier número double por rango con scanner
    public Double InputDoubleNumericRangeScanner(String mensaje, Double min, Double max) {
        do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero() < min || this.getNumero() > max);
        
        return this.getNumero();
    }
    
    //Capturar cualquier número double por rango con JOptionPane
    public Double InputDoubleNumericRangeJOptionPane(String mensaje, Double min, Double max) {
        do {            
            InputNumeric(mensaje,2);
        } while (this.getNumero() < min || this.getNumero() > max);
        
        return this.getNumero();
    }
    
    //Capturar número positivo con scanner
    public Double InputDoubleNumericPositiveScanner(String mensaje) {
        do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero() <= 0);
        
        return this.getNumero();
    }
    
    //Capturar número positivo con JOptionPane
    public Double InputDoubleNumericPositiveJOptionPane(String mensaje) {
        do {            
            InputNumeric(mensaje,2);
        } while (this.getNumero() <= 0);
        
        return this.getNumero();
    }
    
    //Capturar número negative con scanner
    public Double InputDoubleNumericNegativeScanner(String mensaje) {
        do {            
            InputNumeric(mensaje,1);
        } while (this.getNumero() >= 0);
        
        return this.getNumero();
    }
    
    //Capturar número negative con scanner
    public Double InputDoubleNumericNegativeJOptionPane(String mensaje) {
        do {            
            InputNumeric(mensaje,2);
        } while (this.getNumero() >= 0);
        
        return this.getNumero();
    }
    
    /************************
     * 
     * @param Capturar solo enteros
     * @return Integer
     */
    
    //Capturar cualquier entero por Scanner
    public Integer InputIntegerNumericScanner(String mensaje) {
        InputDoubleNumericScanner(mensaje);
        return this.getNumero().intValue();
    }
    
    //Capturar cualquier entero por JOptionPane
    public Integer InputIntegerNumericJOptionPane(String mensaje) {
        InputDoubleNumericJOptionPane(mensaje);
        return this.getNumero().intValue();
    }
    
    //Capturar cualquier número entero por rango con scanner
    public Integer InputIntegerNumericRangeScanner(String mensaje, Double min, Double max) {
        InputDoubleNumericRangeScanner(mensaje,min,max);
        return this.getNumero().intValue();
    }
    
    //Capturar cualquier número entero por rango con JOptionPane
    public Integer InputIntegerNumericRangeJOptionPane(String mensaje, Double min, Double max) {
        InputDoubleNumericRangeJOptionPane(mensaje,min,max);
        return this.getNumero().intValue();
    }
    
    //Capturar número positivo con scanner
    public Integer InputIntegerNumericPositiveScanner(String mensaje) {
        InputDoubleNumericPositiveScanner(mensaje);
        return this.getNumero().intValue();
    }
    
    //Capturar número positive con JOptionPane
    public Integer InputIntegerNumericPositiveJOptionPane(String mensaje) {
        InputDoubleNumericPositiveScanner(mensaje);
        return this.getNumero().intValue();
    }
    
    //Capturar número negative con scanner
    public Integer InputIntegerNumericNegativeScanner(String mensaje) {
        InputDoubleNumericNegativeScanner(mensaje);
        return this.getNumero().intValue();
    }
    
    //Capturar número negative con JOptionPane
    public Integer InputIntegerNumericNegativeJOptionPane(String mensaje) {
        InputDoubleNumericNegativeScanner(mensaje);
        return this.getNumero().intValue();
    }

}
