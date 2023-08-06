/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author ariel
 */
public class FunctionString {

    private String data;

    private String getData() {
        return data;
    }

    private void setData(String data) {
        this.data = data;
    }

    public void ShowScanner(String mensaje) {
        System.out.print(mensaje);
    }

    public String InputScanner(String mensaje) {
        Scanner scanner = new Scanner(System.in);

        ShowScanner(mensaje);
        this.setData(scanner.next());
        return this.getData();
    }

    public void ShowJOptionPane(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public String InputJOptionPane(String mensaje) {
        this.setData(JOptionPane.showInputDialog(null, mensaje));
        return this.getData();
    }
}
