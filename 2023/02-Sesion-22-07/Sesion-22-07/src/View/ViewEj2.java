
package View;

import Class.ClassEj2;


public class ViewEj2 {
    public static void main(String[] args) {
        Double respuesta = 0.0;
        String respuesta2 = "";
        
        ClassEj2 obj = new ClassEj2();
        obj.setLunes(98);
        obj.setMiercoles(76);
        obj.setViernes(65);
        respuesta = obj.Mostrar();        
        System.out.println(respuesta);
        respuesta2 = obj.DiaMayor();
        System.out.println(respuesta2);
        
        obj.DiaMenor();
    }
}
