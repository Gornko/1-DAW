
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
    public static void capicua(int a, int b, int c, int d){
        if (a==d&&b==c){
            System.out.println("capicua");
        }else
            System.out.println("no capicua");
    }
    
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        d=sc.nextInt();
        capicua(a,b,c,d);
    }
}
