/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 */
public class Ejer03 {
    public static void main(String[]args){
        int cuentaImp=0;
        int cuentaPar=0;
        int cuentaMult5=0;
        for(int i=0; i<100; i++){
            if(i%2!=0){
                System.out.print(i+" ");
                cuentaImp++;
            }    
        }
        System.out.println("");
        System.out.println(cuentaImp);
        for(int i=0; i<100; i++){
            if(i%2==0){
                System.out.print(i+" ");
                cuentaPar++;
            }
        }
        System.out.println("");
        System.out.println(cuentaPar);
        for(int i=0; i<100; i++){
            if(i%5==0){
                System.out.print(i+" ");
                cuentaMult5++;
            }
    }   System.out.println("");
        System.out.println(cuentaMult5);
    
    
}
}
