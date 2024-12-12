/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Pableras
 * @fecha 14 dic 2023 19:52:24
 * @company Ciclo superior de informatica
 */
public class Ejer03 {
    
    /*Algo falla, imprime primero un elemento, salta de linea, y luego imprime los demas
    correctamente en grupos de 4*/
    public static void imprimirDe4en4(int[] array){
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
            if(i<array.length&& i%4==0){
                System.out.println();
            }
        }
            
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vector = new int[20];
        for (int i = 0; i < vector.length; i++) {

            vector[i] = sc.nextInt();
        }
        imprimirDe4en4(vector);
    }
}
