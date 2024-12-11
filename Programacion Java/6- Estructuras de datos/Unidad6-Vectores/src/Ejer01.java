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
public class Ejer01 {
    
    public static void imprimirArray(int[]array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
    }
    
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int[] vector= new int[10];
        for(int i=0;i<vector.length;i++){
            System.out.println("Introduce elemento del array");
            vector[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(vector));
    }
}

