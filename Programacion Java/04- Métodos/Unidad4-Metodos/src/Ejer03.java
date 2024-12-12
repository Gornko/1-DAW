/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 * Ejercicio parecido al 3 y al 4
 */
public class Ejer03 {
    public static int mayor(int a, int b, int c, int d){
        int may1=Math.max(a, b);
        int may2=Math.max(may1,c);
        return Math.max(may2, d) ;
    }
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt();
        int num4= sc.nextInt();
       int mayor=mayor(num1,num2,num3,num4);
        System.out.println(mayor);
    }
}
