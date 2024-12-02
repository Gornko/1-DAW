/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Pableras
 */
public class Ejer4 {

    public static void main(String[] args) {
        int num1;
        int num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Diga un numero");
        num1=sc.nextInt();
        System.out.println("Diga otro numero");
        num2=sc.nextInt();
        if(num1<num2){
            System.out.println(num1+","+num2);
        }else{
            System.out.println(num2+","+num1);
        }
    }
}
