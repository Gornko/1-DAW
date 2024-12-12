/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha  31 ene 2024 10:09:07
 * @company Ciclo superior de informatica
 */
public class Prueba2 {
    public static void main(String[] args) {
        int num1=5;
        int resultado;
        try{
            resultado=num1/2;
            System.out.println(resultado);
        }catch(ArithmeticException a){
            System.out.println("Division por cero");
        }finally{
            System.out.println("Prueba otra vez");
        }
    }
}
