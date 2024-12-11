/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Pableras
 * @fecha 11 dic 2023 15:36:00
 * @company Ciclo superior de informatica
 */
public class Ejercicio5 {

    public static int numeroOcurrencias(String texto, String busqueda) {
        int posicion = 0;
        int contador = 0;
        for (int i = 0; i < texto.length(); ) {
            if (posicion != -1) {
            contador++;
            i = posicion + busqueda.length();
        } else {
            break;  // Salir del bucle si no se encuentra más la subcadena
        }
        }
        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el texto a analizar");
        String texto = sc.nextLine();
        System.out.println("Introduzca los caracteres que quiere buscar en el texto");
        String busqueda=sc.nextLine();
        int ocurrencias=Ejercicio5.numeroOcurrencias(texto,busqueda);
        System.out.println("Los caracteres \""+busqueda+"\""+" Se encuentran "+ocurrencias+" veces");
    }

}
