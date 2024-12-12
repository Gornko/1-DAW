/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Pableras
 * @fecha  14 dic 2023 22:48:18
 * @company Ciclo superior de informatica
 */
public class Ejer10 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] vector=new int[20];
        for (int i = 0; i < vector.length; i++) {
            vector[i]=(int) (Math.random()*10+1);
            System.out.print(vector[i]+" ");
        }
        
    }
}
