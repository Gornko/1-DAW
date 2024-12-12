/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Pableras
 * @fecha 29 mar 2024 0:45:07
 * @company Ciclo superior de informatica
 */
class Alumno implements Comparable<Alumno> {

    private String nombre;
    private int numero;
    private double nota;

    public Alumno(String nombre, int numero, double nota) {
        this.nombre = nombre;
        this.numero = numero;
        this.nota = nota;
    }
    @Override
    public int compareTo(Alumno alumno) {
        // Por defecto, se compara por número
        return compareToNumero(alumno);
    }
    public int compareToNumero(Alumno alumno) {
        return this.numero - alumno.numero;
    }

    public int compareToNombre(Alumno alumno) {
        return this.nombre.compareTo(alumno.nombre);
    }
    public int compareToNota(Alumno alumno) {
        return Double.compare(this.nota, alumno.nota);
    }

    @Override

    public String toString() {
        return "Nombre: " + nombre + "\n" + "Numero: " + numero + "\n" + "Nota: " + nota + "\n";
    }
}

class ListaAlumnos {

    private Alumno[] listaAlumnos;

    public ListaAlumnos(int cantidad) {
        listaAlumnos = new Alumno[cantidad];
    }
    
    
}

public class EjerOrdenColecArray {

    public static void main(String[] args) {
        Alumno[] listaAlumnos0 = new Alumno[5];
        Alumno alumno1 = new Alumno("Pablo", 5, 8.9);
        Alumno alumno2 = new Alumno("Jaime", 4, 5.5);
        Alumno alumno3 = new Alumno("Juan", 2, 7.2);
        Alumno alumno4 = new Alumno("Laia", 9, 6.5);
        Alumno alumno5 = new Alumno("Nacho", 10, 9.0);
        Alumno[] listaAlumnos1 = {alumno1, alumno2, alumno3, alumno4, alumno5};
        Arrays.sort(listaAlumnos1, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return a1.compareToNombre(a2);
            }
        });
        System.out.println("Ordenados por nombre:");
        for (Alumno alumno : listaAlumnos1) {
            System.out.println(alumno.toString());
        }

        // Ordenar por número
        Arrays.sort(listaAlumnos1, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return a1.compareToNumero(a2);
            }
        });
        System.out.println("\nOrdenados por número:");
        for (Alumno alumno : listaAlumnos1) {
            System.out.println(alumno.toString());
        }

        // Ordenar por nota
        Arrays.sort(listaAlumnos1, new Comparator<Alumno>() {
            @Override
            public int compare(Alumno a1, Alumno a2) {
                return a1.compareToNota(a2);
            }
        });
        System.out.println("\nOrdenados por nota:");
        for (Alumno alumno : listaAlumnos1) {
            System.out.println(alumno.toString());
        }

    }
}
