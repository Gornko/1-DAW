/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

public class Ejercicio1 {

    public static int cuentaOcurrencias(String nombre) {
        int cuenta=0;
        for(int i=0;i<nombre.length();i++){
            if(nombre.charAt(i)==nombre.charAt(nombre.length()-1)){
                cuenta++;
            }
        }
        return cuenta;
    }

    public static void main(String[] args) {
        String nom, apellido1, apellido2, nomComplet;
        int ocurrencias;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique su nombre");
        nom = sc.nextLine();
        System.out.println("Indique su primer apellido");
        apellido1 = sc.nextLine();
        System.out.println("Indique su segundo apellido");
        apellido2 = sc.nextLine();
        nomComplet = nom + " " + apellido1 + " " + apellido2;
        System.out.println("----------------------");

        System.out.println(nomComplet.toUpperCase());
        System.out.println(nomComplet.toLowerCase());
        System.out.println(nomComplet.length());
        System.out.println("----------------------");

        System.out.println(nomComplet.substring(0, 2));
        System.out.println(nomComplet.substring(nomComplet.length() - 2));
        System.out.println("----------------------");

        ocurrencias=Ejercicio1.cuentaOcurrencias(nomComplet);
        System.out.println(ocurrencias);
        System.out.println("----------------------");
        
        String nomCompletMayus= nomComplet.toUpperCase();
        char primerCaracterMayus= nomCompletMayus.charAt(0);
        System.out.println(nomComplet.replace(nomComplet.charAt(0),primerCaracterMayus ));
        System.out.println("----------------------");
        
        StringBuilder nomCompletBuilder= new StringBuilder(nomComplet);
        nomCompletBuilder.insert(0, "***");
        nomCompletBuilder.append("***");
        System.out.println(nomCompletBuilder);
        System.out.println("----------------------");
        
        nomCompletBuilder.delete(0, 3);
        nomCompletBuilder.delete(nomCompletBuilder.length()-3, nomCompletBuilder.length());
        System.out.println(nomCompletBuilder.reverse());
    }
}
