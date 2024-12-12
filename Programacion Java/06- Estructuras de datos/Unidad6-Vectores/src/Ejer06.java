/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha 20 dic 2023 9:51:16
 * @company Ciclo superior de informatica
 */
public class Ejer06 {

    public static void main(String[] args) {
        int[][] matriz7x5 = new int[7][5];
        System.out.println("Matriz de 7x5:");

        //Generamos la matriz de 7x5 y la imprimo
        for (int i = 0; i < matriz7x5.length; i++) {
            for (int j = 0; j < matriz7x5[i].length; j++) {
                matriz7x5[i][j] = (int) (Math.random() * 99 + 1);
                System.out.print(matriz7x5[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        //Creo una nueva matriz de 7x7 donde las cinco primeras columnas son iguales que las de la matriz 7x5
        int[][] matriz7x7 = new int[7][7];
        for (int i = 0; i < matriz7x7.length; i++) {
            for (int j = 0; j < matriz7x7.length - 2; j++) {
                matriz7x7[i][j] = matriz7x5[i][j];
            }
        }
        
        System.out.println("");
        System.out.println("La suma de las 5 primeras columnas es:");

        //Guardo en la sexta columna la suma de las 5 primeras columnas y la imprimo
        for (int i = 0; i < matriz7x7.length; i++) {
            for (int j = 0; j < matriz7x7.length - 2; j++) {
                matriz7x7[i][5] += matriz7x7[i][j];
            }
            System.out.println(matriz7x7[i][5]);
        }
        
        System.out.println("");
        System.out.println("La media de las 5 primeras columnas es:");

        //Calculo la media de las 5 primeras columnas, la asigno a la septima columna y la imprimo.
        for (int i = 0; i < matriz7x7.length; i++) {
            for (int j = 0; j < matriz7x7.length - 2; j++) {
                matriz7x7[i][6] = matriz7x7[i][5] / 5;
            }
            System.out.println(matriz7x7[i][6]);
        }
        
        System.out.println("");
        System.out.println("La matriz de 7x7:");

        //Imprimo la matriz de 7x7 entera
        for (int i = 0; i < matriz7x7.length; i++) {
            for (int j = 0; j < matriz7x7[i].length; j++) {
                System.out.print(matriz7x7[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
