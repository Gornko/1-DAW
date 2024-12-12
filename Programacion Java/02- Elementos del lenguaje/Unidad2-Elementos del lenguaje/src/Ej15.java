/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pableras
 */
public class Ej15 {
    public enum diasSemana{
        LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO
    };

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        diasSemana hoy= diasSemana.MARTES;
        diasSemana domingo=diasSemana.DOMINGO;
        System.out.println(hoy);
        System.out.println((domingo.ordinal()+1));
    }
    
}
