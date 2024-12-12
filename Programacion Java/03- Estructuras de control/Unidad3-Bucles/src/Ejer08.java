/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Pableras
 */
public class Ejer08 {

    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        numero = sc.nextInt();
        boolean primo = false;

        int contador = 0;
        for (int i = numero; i > 0; i--) {
            if (numero % i == 0) {
                contador++;
            }
        }
        if (contador == 2) {
            primo = true;
        }
        System.out.println(primo);
    }
}
