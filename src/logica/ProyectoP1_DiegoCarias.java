/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package logica;

import igu.Pantalla;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author djcar
 */
public class ProyectoP1_DiegoCarias {

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        Usuarios u  = new Usuarios("","",0);
        Metodos m = new Metodos();
        Juegos j = new Juegos("",true);
        Pantalla p = new Pantalla();
        p.setVisible(true);
        p.setLocationRelativeTo(null);
        
        
        ArrayList<Juegos> juegos = j.llenar();
        ArrayList<Usuarios> usuarios = u.llenar();
        
        
        System.out.println(usuarios);
    }
}
    
    
    

