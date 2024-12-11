/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha  26 feb 2024 12:47:25
 * @company Ciclo superior de informatica
 */

abstract class Alumno{
    protected String nombre;
    protected double nota;
    public Alumno(String nombre, double nota){
        this.nombre=nombre;
        this.nota=nota;
    }
    abstract public double calcularNota();
}

class Alumno_Ordinario extends Alumno{
    private char curso;
    public Alumno_Ordinario(String nombre, double nota, char curso){
        super(nombre, nota);
        this.curso=curso;
    }
    public double calcularNota(){
        return nota;
    }
}


class Question7 {
    public static void main (String[]args){
        Alumno alumno1;
        alumno1=new Alumno_Ordinario("Felix", 5.0, '2');
        System.out.println(alumno1.calcularNota());
        alumno1=new Alumno_Ordinario("Lucia", 7.0, '1');
        System.out.println(alumno1.calcularNota());
    }
}

// No se puede instanciar objetos de clases abstractas
