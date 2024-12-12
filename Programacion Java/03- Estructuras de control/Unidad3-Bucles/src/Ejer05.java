/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 */
public class Ejer05 {

    public static void main(String[] args) {
        int cuentaPares = 0;
        int sumaPares = 0;
        int cuentaImp = 0;
        int sumaImp = 0;
        int cuentaMult4 = 0;
        int sumaMult4 = 0;
        int cuentaMult7 = 0;
        int sumaMult7 = 0;
        for (int i = 1; i < 101; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) {
                cuentaPares++;
                sumaPares = sumaPares + i;
            } else {
                cuentaImp++;
                sumaImp = sumaImp + i;
            }
            if (i % 4 == 0) {
                cuentaMult4++;
                sumaMult4 += i;
            }
            if (i % 7 == 0) {
                cuentaMult7++;
                sumaMult7 += i;
            }
        }
        System.out.println("");
        System.out.println("Hay " + cuentaPares + " numeros pares, y suman " + sumaPares);
        System.out.println("Hay " + cuentaImp + " numeros impares, y suman " + sumaImp);
        System.out.println("Hay " + cuentaMult4 + " multiplos de 4, y suman " + sumaMult4);
        System.out.println("Hay " + cuentaMult7 + " multiplos de 7, y suman " + sumaMult7);

    }
}
