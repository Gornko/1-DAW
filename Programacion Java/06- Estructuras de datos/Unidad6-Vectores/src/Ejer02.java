
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha  14 dic 2023 19:45:06
 * @company Ciclo superior de informatica
 */
public class Ejer02 {
    public static void imprimirPosPar(int[] array){
        for(int i=0; i<array.length;i+=2){
            System.out.print(array[i]+" ");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] vector=new int[10];
        for (int i=0; i<vector.length;i++){
            System.out.println("Introduce elemento del array");
            vector[i]=sc.nextInt();
        }
        imprimirPosPar(vector);
    }
}
