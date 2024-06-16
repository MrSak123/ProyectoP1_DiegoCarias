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
            {"1. Call of Duty","2. BloodBorne","3. Demon Souls"},
            {"4. Elden Ring","5. Dark Souls III","6. Rise of the Ronin"},
            {"7. Fallout 4","8. Sekiro", "9. EA FC 24"}
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
            {"1. Call of Duty","2. BloodBorne","3. Demon Souls"},
            {"4. Elden Ring","5. Dark Souls III","6. Rise of the Ronin"},
            {"7. Fallout 4","8. Sekiro", "9. EA FC 24"}
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
}
