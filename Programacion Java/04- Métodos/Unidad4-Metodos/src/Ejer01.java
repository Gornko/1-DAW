/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class Ejer01 {
    public static int suma(int a, int b){
        
        return a+b;
    }
    
    public static void main(String[]args){
        int num1,num2;
        Scanner sc=new Scanner(System.in);
        num1= sc.nextInt();
        num2= sc.nextInt();
        System.out.println(suma(num1,num2));
        
        
    }
}
