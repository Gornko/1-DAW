/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 */
public class Ejersuma {
    public static int suma(int a, int b){
        
        return a+b;
    }
    public static void main(String[] args) {
        int facturas=3000;
        int ventas=5000;
        int soluc=suma(facturas,ventas);
        System.out.println(soluc);
        soluc=suma(5,3);
        System.out.println(soluc);
        suma(facturas,ventas);
    }
}
