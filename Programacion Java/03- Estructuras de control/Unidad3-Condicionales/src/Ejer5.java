/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class Ejer5 {
    public static void main(String[]args){
        int nota;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Que nota has sacado?");
        nota=sc.nextInt();
        switch(nota){
            case 0,1,2-> System.out.println("M.D.");
            case 3,4 -> System.out.println("INS.");
            case 5 -> System.out.println("SUF.");
            case 6 -> System.out.println("BE");
            case 7,8 -> System.out.println("NOT");
            case 9,10 -> System.out.println("SOB");
            default -> System.out.println("Nota incorrecta");
    }
    }
}
