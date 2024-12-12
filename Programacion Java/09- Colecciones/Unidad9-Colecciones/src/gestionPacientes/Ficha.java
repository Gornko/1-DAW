/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionPacientes;
import java.util.*;

/**
 *
 * @author Pableras
 * @fecha 27 mar 2024 23:05:05
 * @company Ciclo superior de informatica
 */
public class Ficha implements Comparable<Ficha>{
    
     private String nombre;
    private String apellidos;
    private int edad;

    public Ficha(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    @Override
    public boolean equals(Object otra) {
        return (this.apellidos).equals(((Ficha) otra).apellidos);
    }

    @Override
    public String toString() {
        String aux = "\tNombre: " + nombre + "\tApellidos: " + apellidos
                + "\tEdad: " + edad;
        return aux;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

     @Override
    public int compareTo(Ficha o) {
        return nombre.compareTo(o.nombre);
    }
    /* 
    @Override
    public int compareTo(Ficha o) {
        return this.edad - o.edad;
    }
    /*es equivalent a
    public int compareTo(Ficha o) {
        if (this.edad < o.edad) {
            return -1; //o qualsevol número negatiu
        } else if (this.edad > o.edad) {
            return +1; //o qualsevol número positiu
        } else {
            return 0;
        }
    }*/
}
