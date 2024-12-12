/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Pableras
 * @fecha  6 nov 2023 11:48:51
 * @company Ciclo superior de informatica
 */


public class Ejer07DAW {
    
    public static void imprimeCaracter(char a, int x, int y){
        for( int i=1; i<=y; i++){
            for(int b=1; b<=x; b++){
                System.out.print(a);
            }
            System.out.println("");
        }
    }
    
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        String caracterString;
        char caracterChar;
        int columnas, filas;
        System.out.println("¿Que caracter se imprimira?");
        caracterString=sc.nextLine();
        caracterChar=caracterString.charAt(0);
        System.out.println("¿Cuantas veces por fila?");
        columnas=sc.nextInt();
        System.out.println("¿cuantas filas?");
        filas=sc.nextInt();
        Ejer07DAW.imprimeCaracter(caracterChar, columnas, filas);
    }

}
