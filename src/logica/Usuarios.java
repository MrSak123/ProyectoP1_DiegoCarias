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
    
   
    
    
    
    @Override
    public String toString() {
        return "\nUsuario: " + "\n---------------\nNombre: " + nombre + "\nApellido: " + apellido + "\nNumeroCuenta: " + numeroCuenta +"\n---------------";
    }
    public static ArrayList<Usuarios> u = new ArrayList();
    public static Metodos m = new Metodos();
    
   
    
    public ArrayList<Usuarios> llenar(){
    ArrayList<Usuarios> u = new ArrayList<Usuarios>(Arrays.asList(
        new Usuarios("Jose","Pineda", m.generarNumeroCuentaRecursivo(1000)),
        new Usuarios("Carlos","Escoto", m.generarNumeroCuentaRecursivo(1001)),
        new Usuarios("Juan","Bodoke", m.generarNumeroCuentaRecursivo(1002)),
        new Usuarios("Sadith","Ramos", m.generarNumeroCuentaRecursivo(1003)),
        new Usuarios("Luka","Cage", m.generarNumeroCuentaRecursivo(1004)),
        new Usuarios("Cassie","Pineda", m.generarNumeroCuentaRecursivo(1005)),
        new Usuarios("Ache","Harrison", m.generarNumeroCuentaRecursivo(1006)),
        new Usuarios("Sak","Shinichi", m.generarNumeroCuentaRecursivo(1007)),
        new Usuarios("Diego","Carias", m.generarNumeroCuentaRecursivo(1008)),
        new Usuarios("Josue","Borden", m.generarNumeroCuentaRecursivo(1009)),
        new Usuarios("David","Castro", m.generarNumeroCuentaRecursivo(1010))
    ));
    return u;
}
}
    
    

