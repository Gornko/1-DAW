/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class Ejer02 {
    public static double area(double a){
        return (Math.PI)*a*a;
    }
    public static double longitud(double b){
        return (Math.PI)*2*b;
    }
    
    public static void main(String[]args){
        double radio;
        Scanner sc=new Scanner(System.in);
        radio=sc.nextDouble();
        System.out.println("El area de la circunferencia es "+ area(radio));
        System.out.println("La longitud de la circun es "+ longitud(radio));
    }
}
