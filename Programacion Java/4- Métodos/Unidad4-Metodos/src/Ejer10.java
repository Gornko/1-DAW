
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 */
public class Ejer10 {
    public static int factorial(int a){
        int num=1;
        int cuenta=1;
        for(int i=0;i<a;i++){
            num=num*cuenta;
            cuenta++;
        }
        return num;
    }
    
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(factorial(num));
    }
}
