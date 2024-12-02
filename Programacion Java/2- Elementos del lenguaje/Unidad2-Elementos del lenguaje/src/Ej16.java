/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pableras
 */
public class Ej16 {
    public enum diasSemana{
        LUNES,MARTES,MIERCOLES,JUEVES,VIERNES,SABADO,DOMINGO
    };
    
    public enum notasAlumnos{
        SOBRESALIENTE,NOTABLE,BIEN,SUFICIENTE,INSUFICIENTE
    };
    
    public enum colores{
        ROJO,VERDE,AZUL,AMARILLO
    };
    
    public enum notasMusica{
        DO,RE,MI,FA,SOL,LA,SI
    };
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        colores azul=colores.VERDE;
        System.out.println(colores.VERDE);
        System.out.println(azul);
        
    }
    
}
