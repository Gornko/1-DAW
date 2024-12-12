/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 * @fecha  31 ene 2024 10:18:03
 * @company Ciclo superior de informatica
 */
public class Ejercicio7 {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String llegitDeTeclat=sc.nextLine();
        System.out.println("Indica la posicion de la frase que quieres imprimir: ");
        int posicion=sc.nextInt();
        try{
            System.out.println(Pruebas.caracterEn(llegitDeTeclat,posicion));
        }catch(MisErrores e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
