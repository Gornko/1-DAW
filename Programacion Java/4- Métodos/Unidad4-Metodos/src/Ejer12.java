
import java.io.IOException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 */
public class Ejer12 {
    public static void saludo(String nombre, char eleccion){
        if(eleccion=='a'){
            System.out.println("Bon dia, "+nombre);
        }
        if(eleccion=='b'){
            System.out.println("Buenos dias, "+nombre);
        }
        if(eleccion=='c'){
            System.out.println("Good morning, "+nombre);
        }
            
    }
    
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
        System.out.println("Como te llamas?");
        String nombre=sc.nextLine();
        System.out.println("Elige un idioma:");
        System.out.println("(a) Valenciano");
        System.out.println("(b) Castellano");
        System.out.println("(c) Ingles");
        char eleccion= (char)System.in.read();
        saludo(nombre,eleccion);
    }
}
