/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class Ejer3 {
    public static void main(String[]args){
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Diga un número");
        num=sc.nextInt();
        if(num%2==0){
            System.out.println("Es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
