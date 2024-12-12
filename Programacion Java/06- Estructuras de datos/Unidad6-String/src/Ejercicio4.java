/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 * @fecha 11 dic 2023 15:09:26
 * @company Ciclo superior de informatica
 */
public class Ejercicio4 {

    public static void esPorNoEs(String frase) {
        String fraseMod=frase.replaceAll("es", "no es");
        System.out.println(fraseMod);
    }
    
    public static void digitPorAsterisc(String frase){
        String fraseMod= frase.replaceAll("\\d+", "*");
        System.out.println(fraseMod);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique un frase que contenga \"es\"");
        String frase=sc.nextLine();
        esPorNoEs(frase);
        System.out.println("Indique una frase que contenga digitos");
        frase=sc.nextLine();
        digitPorAsterisc(frase);
    }

}
