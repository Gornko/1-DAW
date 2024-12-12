/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 * @fecha  11 dic 2023 13:15:13
 * @company Ciclo superior de informatica
 */
public class Ejercicio2 {
    
    public static String cambiaVocalesMinus(String frase){
        String frase1=frase.replace('e', 'a');
        String frase2=frase1.replace('i', 'a');
        String frase3=frase2.replace('o', 'a');
        String fraseFinal=frase3.replace('u', 'a');
        
        return fraseFinal;
    }
    
    public static void mitadFrase(String frase){
        String mediaFrase= frase.substring(0, frase.length()/2);
        System.out.println(mediaFrase);
    }

    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca una frase con o sin mayusculas");
        String frase=sc.nextLine();
        System.out.println(Ejercicio2.cambiaVocalesMinus(frase));
        mitadFrase(frase);
        
        
    }
    
}
