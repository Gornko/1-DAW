/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Pableras
 * @fecha 30 ene 2024 18:19:21
 * @company Ciclo superior de informatica
 *
 */


public class Pruebas {

    public static char caracterEn(String cadena, int posicion) throws MisErrores {

        if (posicion >= 0 && posicion <= cadena.length()) {
            return cadena.charAt(posicion);
        } else {
            throw new MisErrores("Posicion invalida");
        }

    }

    public static void main(String[] args) {

        String cadena = "Hola, mundo!";
        int posicion =20;
        try {
            char resultado = caracterEn(cadena, posicion);
            System.out.println("El carácter en la posición " + posicion + " es: " + resultado);
        } catch (MisErrores e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
