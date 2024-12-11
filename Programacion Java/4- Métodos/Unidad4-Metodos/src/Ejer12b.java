
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pablo
 */
public class Ejer12b {

    public static void saludo(String nombre, String eleccion) {
        if ("a".equals(eleccion)) {
            System.out.println("Bon dia, " + nombre);
        }
        if ("b".equals(eleccion)) {
            System.out.println("Buenos dias, " + nombre);
        }
        if ("c".equals(eleccion)) {
            System.out.println("Good morning, " + nombre);
        }

    }
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Como te llamas?");
        String nombre=sc.nextLine();
        System.out.println("Elige un idioma:");
        System.out.println("(a) Valenciano");
        System.out.println("(b) Castellano");
        System.out.println("(c) Ingles");
        String eleccion= sc.nextLine();
        saludo(nombre,eleccion);
    }
}
