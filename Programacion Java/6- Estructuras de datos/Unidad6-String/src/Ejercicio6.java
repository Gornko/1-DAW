
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha  14 dic 2023 19:31:30
 * @company Ciclo superior de informatica
 */
public class Ejercicio6 {
    
    public static void imprimirArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        StringBuilder sb;
        sb = new StringBuilder("Holi");
        sb.append("holi"+3);
        String cadena=sb.toString();
        System.out.println(cadena);
    }
}
