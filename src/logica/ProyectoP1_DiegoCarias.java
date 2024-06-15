/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica;

import igu.Pantalla;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author djcar
 */
public class ProyectoP1_DiegoCarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        ArrayList<Juegos> j = new ArrayList();
        Usuarios u = new  Usuarios("", "", 0);
        Metodos m = new Metodos();
        
        Pantalla p = new Pantalla();
        p.setVisible(true);
        p.setLocationRelativeTo(null);

        int numeroCuenta = u.generarNumeroCuenta();
        u.setNumeroCuenta(numeroCuenta);
    }
    
}
