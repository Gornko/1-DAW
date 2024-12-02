/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.util.Scanner;

/**
 *
 * @author Pableras
 */
public class Ejer09B {

    public static void main(String[] args) {
        int num;
        //int cont;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print(num + " = ");
        for (int i = 2; i < num; i++) {
            // cont = 0;
            while (num % i == 0) {
                num = num / i;
                //cont++;
                System.out.print(i + " * ");
            }

        }
    }
}
