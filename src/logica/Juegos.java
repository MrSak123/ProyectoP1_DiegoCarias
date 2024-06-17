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
public class Juegos {
    String nombre;
    boolean disponible;

    public Juegos(String nombre, boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public ArrayList llenar(){
        ArrayList<Juegos> j = new ArrayList<Juegos>(Arrays.asList(
            new Juegos("The Legend of Zelda: Breath of the Wild", true),
            new Juegos("Super Mario Odyssey", true),
            new Juegos("Minecraft", true),
            new Juegos("Fortnite", true),
            new Juegos("Among Us", true),
            new Juegos("Call of Duty", true),
            new Juegos("Animal Crossing: New Horizons", true),
            new Juegos("Halo Infinite", true),
            new Juegos("EA FC 24", true)
        ));
        return j;
    }       

    @Override
    public String toString() {
        return "\n---------------\nJuegos:" + "\nTitulo: " + nombre +"\nEstado: "+disponible+"\n---------------";
    }
   
     
    }

