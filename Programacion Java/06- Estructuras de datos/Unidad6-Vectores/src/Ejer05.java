/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Pableras
 * @fecha  14 dic 2023 22:17:59
 * @company Ciclo superior de informatica
 */
public class Ejer05 {

    //En lugar de meter leer 50 numeros, he rellenado el array con numeros random del 1-10
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Random random=new Random();
        int[] vector=new int[10];
        for (int i = 0; i < vector.length; i++) {
            //vector[i]=random.nextInt(10);
            vector[i]=(int) (Math.random()*20+2);
            System.out.print(vector[i]+" ");
        }
        System.out.println("");
        int suma=0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]%2==0){
                suma+=vector[i];
            }
        }
        System.out.println(suma);
        
        
        
    }
}
