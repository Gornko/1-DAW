
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 */
public class Ejer2 {
    public static void main(String[] args) {
        int edad;
        Scanner sc=new Scanner(System.in);
        System.out.println("Diga su edad");
        edad=sc.nextInt();
        if(edad<25){
            System.out.println("Tienes menos de 25 años");
        }else if(edad==25){
            System.out.println("Tienes 25 años");
        }else{
            System.out.println("Tienes mas de 25 años");
        }
        }
    
}
