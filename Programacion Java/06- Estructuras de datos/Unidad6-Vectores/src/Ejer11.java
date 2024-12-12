/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Pableras
 * @fecha 15 dic 2023 11:02:37
 * @company Ciclo superior de informatica
 */
public class Ejer11 {
    
    
//ejercicio 11 resuelto de dos formas, comentadas, y el 12 tambien resuelto
    public static void main(String[] args) {
        int[] vectorP = new int[10];
        int[] vectorV = new int[10];
        for (int i = 0; i < vectorP.length; i++) {
            vectorP[i]=(int)(Math.random()*20+1);
        }
        for (int i = 0; i < vectorP.length; i++) {
            vectorV[vectorV.length-i-1]=vectorP[i];
        }
        /*int contador=0;
        for (int i = 0; i < vectorP.length; i++) {
            vectorP[i]=(int)(Math.random()*20+1);
            System.out.print(vectorP[i]+" ");
            if(vectorP[i]>10){
                
                vectorV[contador]=vectorP[i];
                contador++;
            }
        }*/
        /*for(int i=0; i<vectorP.length;i++){
            if(vectorP[i]>10){
                
                vectorV[contador]=vectorP[i];
                contador++;
            }
            
        }*/
        System.out.println("");
        System.out.println(Arrays.toString(vectorP));
        System.out.println(Arrays.toString(vectorV));
        
    }

}
