/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class Ejer07 {
    public static void imprime(char c, int a, int b){
        for(int i=0; i<b; i++){
            for(int j=0; j<a; j++){
                System.out.print(c);
            }
            System.out.println("");
                
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        char caracter= 'a';
        imprime(caracter,num1,num2);
    }
}
