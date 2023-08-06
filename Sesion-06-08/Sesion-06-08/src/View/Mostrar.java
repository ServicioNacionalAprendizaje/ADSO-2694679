/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Utils.FunctionNumeric;
import Utils.FunctionString;

/**
 *
 * @author ariel
 */
public class Mostrar {
    public static void main(String[] args) {
        FunctionString fs = new FunctionString();
        FunctionNumeric fn = new FunctionNumeric();
        
        fn.InputNumericRangeScanner("Digite la nota: ",90.0,100.0);
    }
}
