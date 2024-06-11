/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectop1_diegocarias;

import java.util.Random;

/**
 *
 * @author djcar
 */
class Stocks {
    
    private String nombreJuego;
    private String estado;
    private String usario;
    private int numeroCuenta;

    public Stocks(String nombreJuego, String usario) {
        this.nombreJuego = nombreJuego;
        this.estado = "disponible";
        this.usario = usario;
        this.numeroCuenta = generarIdAleatorio();
    }

    public String getNombreJuego() {
        return nombreJuego;
    }

    public String getEstado() {
        return estado;
    }

    public String getUsario() {
        return usario;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNombreJuego(String nombreJuego) {
        this.nombreJuego = nombreJuego;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setUsario(String usario) {
        this.usario = usario;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    @Override
    public String toString() {
        return "--------------------\nNombreJuego: " + nombreJuego + "\nEstado: " + estado + "\nUsario: " + usario + "\nNumeroCuenta: " + numeroCuenta + "\n--------------------";
    }
    
    public int generarIdAleatorio() {
        Random rand = new Random();
        return rand.nextInt(1000);
    }
        
        
}
