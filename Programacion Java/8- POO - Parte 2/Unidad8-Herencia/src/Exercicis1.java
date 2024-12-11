/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha  28 feb 2024 10:43:56
 * @company Ciclo superior de informatica
 */


/**
 *Documentacion clase Fecha
 * 
 */
class Fecha{
    private int dia;
    private int mes;
    private int año;
    
    public Fecha(int dia, int mes, int año){
        this.dia=dia;
        this.mes=mes;
        this.año=año;
    }
    
    public int getDia(){
        return dia;
    }
    
    public int getMes(){
        return mes;
    }
    public int getAño(){
        return año;
    }
    @Override
    public String toString(){
        return dia+"/"+mes+"/"+año;
    }
}

/**
 * Documentacion clase Hora
 * 
 */
class Hora{
    private int hora;
    private int minuto;
    
    
    public Hora(int hora, int minuto){
        this.hora=hora;
        this.minuto=minuto;
        
    }
    
    public int getHora(){
        return hora;
    }
    
    public int getMinuto(){
        return minuto;
    }
    
    @Override
    public String toString(){
        return hora+":"+minuto;
    }
}

/**
 * Documentacion clase Examen
 * @author Pableras
 */

class Examen{
    private String nombre_asignatura;
    private int aula;
    private Fecha fecha;
    private Hora hora;
    
    public Examen(String nombre,int aula, Fecha fecha, Hora hora){
        this.nombre_asignatura=nombre;
        this.aula=aula;
        this.fecha=fecha;
        this.hora=hora;
    }
    
    
    public void mostrarInfo(){
        System.out.println("Asignatura: "+nombre_asignatura);
        System.out.println("Aula: "+aula);
        System.out.println("Fecha: "+fecha);
        System.out.println("Hora: "+hora);
    }
    
}

//Programa de pruebas
public class Exercicis1 {
    public static void main(String[] args) {
        
        Fecha fecha1=new Fecha(3,8,1989);
        Hora hora1=new Hora(18,39);
        Examen examen1=new Examen("Mates",102,fecha1,hora1);
        examen1.mostrarInfo();
        
    }
  
            
}
