/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class Ej18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double lado;
        Scanner sc= new Scanner(System.in);
        System.out.println("Indica el lado del triangulo");
        lado= sc.nextInt();
        double perimetro= lado*3;
        double area=(Math.sqrt(3)/4)*Math.pow(lado, 2);
        System.out.println("perimetro: "+perimetro);
        System.out.println("area: "+area);
    }
    
}
