/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author djcar
 */
public class Usuarios {

    private String nombre;
    private String apellido;
    private int numeroCuenta;
    private static int siguienteNumero = 1000;

    public Usuarios(String nombre, String apellido, int numeroCuenta) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroCuenta = numeroCuenta;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
   
    public static int generarNumeroCuenta() {
        return generarNumeroCuentaRecursivo();
    }

    private static int generarNumeroCuentaRecursivo() {
        
        if(siguienteNumero > 9999){ 
            siguienteNumero = 1000;
        }
        return siguienteNumero++;
    }
    
    @Override
    public String toString() {
        return "Usuarios: " + "\n---------------\nNombre: " + nombre + "\nApellido: " + apellido + "\nNumeroCuenta: " + numeroCuenta +"\n---------------";
    }
    public static ArrayList<Usuarios> u = new ArrayList();
    public static Metodos m = new Metodos();
    
    /*public static ArrayList<Usuarios> llenarLista(ArrayList<Usuarios> lista, String nombre, String apellido, int numeroDeCuenta) {
        int numero = m.generarNumeroCuenta();
        lista.add(new Usuarios(nombre, apellido, numero));
        return lista;
    }*/
    
    public ArrayList llenar(){
        int numero = m.generarNumeroCuenta();
        ArrayList<Usuarios> u = new ArrayList<Usuarios>(Arrays.asList(
            new Usuarios("Jose","Pineda", numero),
            new Usuarios("Carlos","Escoto", numero),
            new Usuarios("Juan","Bodoke", numero),
            new Usuarios("Sadith","Ramos", numero),
            new Usuarios("Luka","Cage", numero),
            new Usuarios("Cassie","Pineda", numero),
            new Usuarios("Ache","Harrison", numero),
            new Usuarios("Sak","Shinichi", numero),
            new Usuarios("Diego","Carias", numero),
            new Usuarios("Josue","Borden", numero),
            new Usuarios("David","Castro", numero)
        ));
        return u;
    } 
    
}


