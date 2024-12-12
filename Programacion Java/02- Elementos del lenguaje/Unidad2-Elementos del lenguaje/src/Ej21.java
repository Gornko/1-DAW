/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pableras
 */
public class Ej21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a=5;
        int b=3;
        System.out.println(!(a>b&&2*a<=b));
        System.out.println(b++>3||a+b<=8&&!(a>b));
        System.out.println(a++<6&&(b+=2)<a);
        System.out.println(a++/2<b&&(a++/2>b||(a*2<b*4)));
    }
    
}
