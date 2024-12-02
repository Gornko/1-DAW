/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class Ejer6 {
    public static void main(String[]args){
        double dinero;
        int mon2Euro=0;
        int mon1Euro=0;
        int mon50Cent=0;
        int mon20Cent=0;
        int mon10Cent=0;
        int mon5Cent=0;
        int mon2Cent=0;
        int mon1Cent=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Indroduzca cantidad de dinero");
        dinero= sc.nextDouble();
        if(dinero>2){
            mon2Euro=(int) (dinero/2);
            dinero=dinero%2;
        } else if(dinero>=1){
            mon1Euro=1;
            dinero=dinero-1;
        } else if(dinero>=0.5){
            mon50Cent=1;
            dinero=dinero-0.5;
        } else if(dinero>=0.20){
            
        }
        System.out.println("Tienes:");
        System.out.println(mon2Euro+" monedas de 2 euro");
        System.out.println(mon1Euro+" monedas de 1 euro");
        System.out.println(mon50Cent+" monedas de 50 cent");
        System.out.println(mon20Cent+" monedas de 20 cent");
        System.out.println(mon10Cent+" monedas de 10 cent ");
        System.out.println(mon5Cent+" monedas de 5 cent");
        System.out.println(mon2Cent+" monedas de 2 cent");
        System.out.println(mon1Cent+" monedas de 1 cent");
    }
}
