
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Pableras
 */
public class Ejer11 {

    public static void main(String[] args) {

        int prueba, numrand, cuenta;
        Scanner sc = new Scanner(System.in);
        numrand = (int) (Math.random() * (100 - 1 + 1) + 1);
        /*La siguiente linea imprime el numero que 
        hay que adivinar. La puedes descomentar para que se vea al jugar.*/
        //System.out.println(numrand); 
        System.out.println("Intenta adivinar el numero del 1 al 100");
        prueba = sc.nextInt();
        while (prueba != numrand) {
            if (prueba < numrand) {
                System.out.println("El numero es mayor que " + prueba);
                prueba = sc.nextInt();
            } else {
                System.out.println("El numero es menor que " + prueba);
                prueba = sc.nextInt();
            }
        }
        System.out.println("Correcto!");
    }
}
