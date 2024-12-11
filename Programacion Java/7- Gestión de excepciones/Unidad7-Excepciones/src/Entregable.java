/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Pableras
 * @fecha 31 ene 2024 12:44:27
 * @company Ciclo superior de informatica
 */
public class Entregable {

    public static int metodo(String a, String b) throws RuntimeException {

        try {
            int num1 = Integer.parseInt(a);
            int num2 = Integer.parseInt(b);
            return num1 / num2;
        } catch (RuntimeException e) {
            throw e;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadA, cadB;
        cadA = sc.nextLine();
        cadB = sc.nextLine();
        try {
            System.out.println(Entregable.metodo(cadA, cadB));
        }catch(NumberFormatException a){
            System.out.println("ERRORFORMAT");
        }catch(ArithmeticException b){
            System.out.println("ERRORDIV");
        }
    }

}
