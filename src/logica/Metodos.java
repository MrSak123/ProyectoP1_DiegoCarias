/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author djcar
 */
public class Metodos {
    
    
    //Metodo Para Mostrar Los juegos
    public String mostrarJuegos(){
        String matrizJuegos [][] = {
            {"1. The Legend of Zelda: Breath of the Wild","2. Super Mario Odyssey","3. Minecraft"},
            {"4. Fortnite","5. Among Us","6. Call of Duty"},
            {"7. Animal Crossing: New Horizons","8. Halo Infinite", "9. EA FC 24"}
        };
        String juegos = "";
        for (int i = 0; i < matrizJuegos.length; i++) {
            for (int j = 0; j < matrizJuegos[i].length; j++) {
                juegos += "[" + matrizJuegos[i][j] + "] ";
            }
            juegos += "\n";
        }
        return juegos;
    }
    
    //Metodo Para devolver el juego deseado
    public String elegirJuego(int posicion){
        String juegos [][] = {
            {"1. The Legend of Zelda: Breath of the Wild","2. Super Mario Odyssey","3. Minecraft"},
            {"4. Fortnite","5. Among Us","6. Call of Duty"},
            {"7. Animal Crossing: New Horizons","8. Halo Infinite", "8. Halo Infinite"}
        };
        String juego = "";
         switch (posicion) {
            case 1:
                juego = juegos[0][0];
                break;
            case 2:
                juego = juegos[0][1];
                break;
            case 3:
                juego = juegos[0][2];
                break;
            case 4:
                juego = juegos[1][0];
                break;
            case 5:
                juego = juegos[1][1];
                break;
            case 6:
                juego = juegos[1][2];
                break;
            case 7:
                juego = juegos[2][0];
                break;
            case 8:
                juego = juegos[2][1];
                break;
            case 9:
                juego = juegos[2][2];
                break;
        }
         return juego;
    }
    
    public static int siguienteNumero = 1000;

public static int generarNumeroCuenta() {
    return generarNumeroCuentaRecursivo(siguienteNumero);
}

public static int generarNumeroCuentaRecursivo(int numero) {
    if (numero > 9999) {
        return 1000;
    } else {
        siguienteNumero = numero;
        return numero;
    }
}

public static int obtenerSiguienteNumeroCuenta() {
    return generarNumeroCuentaRecursivo(siguienteNumero++);
}
}

