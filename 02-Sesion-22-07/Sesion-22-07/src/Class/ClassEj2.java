package Class;

import javax.swing.JOptionPane;

public class ClassEj2 {

    private double lunes;
    private double miercoles;
    private double viernes;
    private double promedio;

    public ClassEj2() {

    }

    public double getLunes() {
        return lunes;
    }

    public void setLunes(double lunes) {
        this.lunes = lunes;
    }

    public double getMiercoles() {
        return miercoles;
    }

    public void setMiercoles(double miercoles) {
        this.miercoles = miercoles;
    }

    public double getViernes() {
        return viernes;
    }

    public void setViernes(double viernes) {
        this.viernes = viernes;
    }

    public double getPromedio() {
        return promedio;
    }

    private void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public Double Mostrar() {
        this.setPromedio((this.getLunes() + this.getMiercoles() + this.getViernes()) / 3);
        return this.getPromedio();
    }

    //Método que retorna el día que más tardo
    public String DiaMayor() {
        String mensaje="";
        Double diaMayor=0.0;
        
        if(this.getLunes()>diaMayor){
            diaMayor=this.getLunes();
        }
        
        if(this.getMiercoles()>diaMayor){
            diaMayor=this.getMiercoles();
        }
        
        if(this.getViernes()>diaMayor){
            diaMayor=this.getViernes();
        }
        
        mensaje = "El día que más se tardo fue: "+diaMayor;
        
        return mensaje;
    }
    
    //Método que muestra cúal fue el día que menos tardp.
    public void DiaMenor(){
        Double diaMenor=9999999.0;
        String mensaje;
        
        if(this.getLunes()<diaMenor){
            diaMenor=getLunes();
        }
        
        if(this.getMiercoles()<diaMenor){
            diaMenor=getMiercoles();
        }
        
        if(this.getViernes()<diaMenor){
            diaMenor=getViernes();
        }
        
        mensaje = "El día más rapido fue: "+diaMenor;
        
        System.out.println(mensaje);
    }
}
