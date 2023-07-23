/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import Abstract.AccionAbstract;

/**
 *
 * @author ariel
 */
public class Pajaro extends AccionAbstract{

    @Override
    public void Volar() {
        System.out.println("El pájaro esta volando.");
    }

    @Override
    public void Cantar() {
        System.out.println("El pájaro esta cantnado.");
    }

    @Override
    public void Caminar() {
        System.out.println("El pájaro esta caminado.");
    }
    
}
