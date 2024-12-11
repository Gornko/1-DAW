/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class Ejer08 {
    public static void triangulo(char a, int b){
        int letras=1;
        int espacios=b-1;
        for (int i=0; i<b; i++){
            for (int j=0; j<espacios; j++){
                System.out.print(" ");
            }
            for (int h=0; h<letras;h++){
                System.out.print(a);
            }
            espacios--;
            letras+=2;
            System.out.println("");
        }
    }
    
    public static void main(String[]args) throws IOException{
        
        char a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Diga un numero");
        b=sc.nextInt();
        System.out.println("Indique una letra");
        a=(char)System.in.read();
        triangulo(a,b);
    }
}
