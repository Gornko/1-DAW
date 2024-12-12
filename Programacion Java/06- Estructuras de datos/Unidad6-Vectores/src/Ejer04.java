/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Pableras
 * @fecha 19 dic 2023 20:12:36
 * @company Ciclo superior de informatica
 */
public class Ejer04 {

    public static void main(String[] args) {

        int[][] matriz = new int[5][7];

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 9 + 1);
                System.out.print(matriz[i][j] + " ");
            }
        }

        System.out.println("");
        System.out.println(Arrays.toString(matriz[4]));
        System.out.println("");

        int elemento1 = matriz[3][2];
        int elemento2 = matriz[4][2];
        System.out.println("El contenido de la 4 fila, 3 columna es: " + elemento1);
        System.out.println("El contenido de la 5 fila, 3 columna es: " + elemento2);
        matriz[4][2] = elemento1;
        matriz[3][2] = elemento2;

        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
        }
        System.out.println("");
        System.out.println("Ahora estan cambiados");
        System.out.println("");

        System.out.println("Las columnas 1 y 4 son:");
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            System.out.print(matriz[i][0] + " ");
            System.out.print(matriz[i][3] + " ");
        }
        System.out.println("");
        System.out.println("La matriz con las columnas 1 y 4 intercambiadas:");
        for (int i = 0; i < matriz.length; i++) {
            int temp = matriz[i][0];
            matriz[i][0] = matriz[i][3];
            matriz[i][3] = temp;

        }
        for (int i = 0; i < matriz.length; i++) {
            System.out.println("");
            for (int j = 0; j < matriz[i].length; j++) {

                System.out.print(matriz[i][j] + " ");
            }
        }

    }

}
