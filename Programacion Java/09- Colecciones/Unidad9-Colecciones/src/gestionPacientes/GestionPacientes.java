/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionPacientes;

import java.util.*;

/**
 *
 * @author Pableras
 * @fecha 27 mar 2024 23:04:42
 * @company Ciclo superior de informatica
 */
public class GestionPacientes {

    public static void main(String[] args) {
        Archivador a1 = new Archivador();

        Ficha paciente1 = new Ficha("Jordi", "Garcia Sapiña", 21);
        Ficha paciente4 = new Ficha("Antonio", "Garcia Zapiña", 22);
        Ficha paciente2 = new Ficha("Jorge", "Moreno Sanchez", 17);
        Ficha paciente3 = new Ficha("Gorca", "Orkoetxea", 32);

        a1.archivarFicha(paciente1);
        a1.archivarFicha(paciente2);
        a1.archivarFicha(paciente3);
        a1.archivarFicha(paciente4);
        //   a1.eliminarFicha(paciente3);

        System.out.println("**********Pacientes Sin Ordenar...");
        System.out.print(a1);
        Ficha paciente33 = new Ficha("Otro", "Orkoetxea", 32);
        System.out.println(paciente33.equals(paciente3));
        System.out.println(a1.buscaPorApellido("Orkoetxea"));
        //
        a1.ordenarNom();
        System.out.println("**********Ordenados por nombre -compareTo-");
        System.out.print(a1);

        System.out.println("**********Ordenados por Edad...");
        a1.ordenarEdad();
        System.out.print(a1);

        System.out.println("**********Ordenados por Apellido...");
        a1.ordenarApellido();
        System.out.print(a1);

    }
}
