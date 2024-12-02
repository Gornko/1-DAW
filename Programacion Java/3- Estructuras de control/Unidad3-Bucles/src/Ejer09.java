/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class Ejer09 {
    public static void main(String[]args){
        int num;
        int cont2=0;
        int cont3=0;
        int cont5=0;
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
        while(num%2==0){
            num=num/2;
            cont2++;
        }
        while(num%3==0){
            num=num/3;
            cont3++;
        }
        while(num%5==0){
            num=num/5;
            cont5++;
        if(!(cont2==0)){
            System.out.println("2 elevado a "+cont2);
        }
        if(!(cont3==0)){
            System.out.println("3 elevado a "+cont3);
        }
         if(!(cont5==0)){
            System.out.println("5 elevado a "+cont5);
         }
        }
    }
}
