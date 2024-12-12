/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class Ejer7 {
    public static void main(String[]args){
        int cuota=500;
        int edad;
        String resp;
        boolean padresSocios=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca su edad");
        edad=sc.nextInt();
        sc.nextLine();
        if(edad<18){
            System.out.println("¿Tus padres son socios? Yes/No");
            resp=sc.nextLine();
            padresSocios=resp.equalsIgnoreCase("yes");
        }
        if(edad>=65){
            System.out.println("Tu cuota es "+ 500/2+ "€");
        }else if(edad<18&&padresSocios==true){
            System.out.println("Tu cuota es "+ (500-(500*35/100))+"€");
        }else if(edad<18&&padresSocios==false){
            System.out.println("Tu cuota es "+(500-(500*25/100))+"€");
        }else{
            System.out.println("Tu cuota es "+cuota+"€");
        }
    }
}
