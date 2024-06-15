/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author djcar
 */
class Usuarios {

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
    
    
}


