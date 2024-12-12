/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class Ejer04 {
    public static void main(String[]args){
        int numA;
        int numB;
        int cuentaPares=0;
        Scanner sc= new Scanner(System.in);
        numA=sc.nextInt();
        numB=sc.nextInt();
        for(int i=Math.min(numA,numB); i<Math.max(numA,numB); i++){
            System.out.print(i+" ");
            if(i%2==0){
                cuentaPares++;
            }
        }
        System.out.println("");
        System.out.println("Hay "+cuentaPares+" numeros pares");
    }
}
