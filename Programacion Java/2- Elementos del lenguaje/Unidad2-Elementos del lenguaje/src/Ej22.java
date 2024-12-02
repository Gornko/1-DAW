/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class Ej22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int inversion;
        double interes;
        int termino;
        double interesFinal;
        double pagoBanco;
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique la inversion");
        inversion=sc.nextInt();
        System.out.println("Indique tipo de interes");
        interes=sc.nextDouble();
        System.out.println("Indique término");
        termino=sc.nextInt();
        
        interesFinal=((inversion*interes)/12)*termino;
        pagoBanco= interesFinal-((interesFinal*18)/100);
        
        System.out.println("Al finalizar el término de la inversion recibirá:");
        System.out.println(pagoBanco+"€");
        
    }
    
}
