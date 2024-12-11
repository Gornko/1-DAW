/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Pableras
 * @fecha 6 nov 2023 13:42:40
 * @company Ciclo superior de informatica
 */
public class EsPrimo {

    public static boolean esPrimo(int numero) {
        if (numero <= 1 || numero > 1000) {
            return false;
        }

        if (numero <= 3) {
            return true;
        }

        if (numero % 2 == 0 || numero % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= numero; i += 6) {
            if (numero % i == 0 || numero % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int numero;
        boolean resp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Indique el numero ");
        numero=sc.nextInt();
        resp=esPrimo(numero);
        if (resp) {
            System.out.println("Es primo");
        } else 
            System.out.println("No es primo");
        
    }

}
