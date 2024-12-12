
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 */
public class Ejer1 {
    public static void main(String[]args){
        int edad;
        Scanner sc= new Scanner(System.in);
        System.out.println("Diga su edad");
        edad=sc.nextInt();
            if(edad>=18){
            System.out.println("Eres mayor de edad");
            }else{
                System.out.println("No eres mayor de edad");
            }
    }
}
