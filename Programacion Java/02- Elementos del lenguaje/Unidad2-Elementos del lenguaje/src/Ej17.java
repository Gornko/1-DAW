/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class Ej17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int segundos;
        Scanner sc = new Scanner(System.in);
        segundos=sc.nextInt();
        int segSobra= segundos%60;
        int min=(segundos/60)%60;
        int horas=((segundos/60)/60)%24;
        int dias= segundos/3600/24;
        System.out.println(segundos+" segundos son:");
        System.out.println(dias+" dias");
        System.out.println(horas+" horas");
        System.out.println(min+" minutos");
        System.out.println(segSobra+" segundos");
        
    }
    
}
