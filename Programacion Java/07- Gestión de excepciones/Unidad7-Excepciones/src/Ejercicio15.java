/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha 31 ene 2024 12:23:37
 * @company Ciclo superior de informatica
 */
public class Ejercicio15 {

    //Ejercicios 15, 16 y 17
    private static int metodo() {
        int valor = 0;
        try {
            valor = valor + 1;
            valor = valor + Integer.parseInt("42");
            valor = valor + 1;
            System.out.println("Valor al final del try : " + valor);
        } catch (NumberFormatException e) {
            valor = valor + Integer.parseInt("42");
            System.out.println("Valor al final del catch :" + valor);
            
        } finally {
            valor = valor + 1;
            System.out.println("Valor al final de finally :" + valor);
        }
        valor = valor + 1;
        System.out.println("Valor antes del return : " + valor);
        return valor;
    }

    public static void main(String[] args) {
        try {
            System.out.println(metodo());
        } catch (Exception e) {
            System.out.println("Excepcion en metodo ( ) ");
            e.printStackTrace();
        }
    }
}


