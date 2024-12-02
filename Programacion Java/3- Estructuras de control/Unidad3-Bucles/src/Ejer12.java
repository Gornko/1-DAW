/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Pableras
 */
public class Ejer12 {
    public static void main(String[] args) {
        int cuenta1=0,cuenta2=0,cuenta3=0,cuenta4=0,cuenta5=0,cuenta6=0;
        
        for(int i=0; i<1000000; i++){
            
            /*Por cada iteración del bucle,guardamos en una variable un numero 
            * random que nos da el metodo Math.random. Este metodo devuelve un 
            * double, asi que le hacemos casting poniendo (int) delante.*/
            
            int numrand=(int)(Math.random()*(6-1+1)+1); 
            
            /*Cada iteración del bucle corresponde a un case, que ira sumando 
            * en la cuenta correspodiente a cada lado del dado.*/
            
            switch(numrand){
                case 1->cuenta1++;
                case 2->cuenta2++;
                case 3->cuenta3++;
                case 4->cuenta4++;
                case 5->cuenta5++;
                case 6->cuenta6++;
            }
        }
        /*Imrimimos todo, y aplicamos formula para indicar el porcentaje sobre
        * el total.*/
        
        System.out.println("El 1 ha aparecido "+cuenta1+" veces, un "+(cuenta1*100/1000000)+"%");
        System.out.println("El 2 ha aparecido "+cuenta2+" veces, un "+(cuenta2*100/1000000)+"%");
        System.out.println("El 3 ha aparecido "+cuenta3+" veces, un "+(cuenta3*100/1000000)+"%");
        System.out.println("El 4 ha aparecido "+cuenta4+" veces, un "+(cuenta4*100/1000000)+"%");
        System.out.println("El 5 ha aparecido "+cuenta5+" veces, un "+(cuenta5*100/1000000)+"%");
        System.out.println("El 6 ha aparecido "+cuenta6+" veces, un "+(cuenta6*100/1000000)+"%");
    }
}
