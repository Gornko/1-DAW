/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package gestionPacientes;
import java.util.*;
/**
 *
 * @author Pableras
 * @fecha  28 mar 2024 0:44:53
 * @company Ciclo superior de informatica
 */
public class Archivador {
    
   ArrayList<Ficha> listadoPacientes;

    public Archivador() {
        listadoPacientes = new ArrayList<>();
    }
    

    public int buscaPorApellido(String cognom) {
        Ficha tmp = new Ficha(cognom, "res", 100);
        return listadoPacientes.indexOf(tmp);
    }

    public void archivarFicha(Ficha paciente) {
        listadoPacientes.add(paciente);
    }

    public void eliminarFicha(Ficha paciente) {
        listadoPacientes.remove(paciente);
    }

    @Override
    public String toString() {
        String aux = "\n";
        for (Ficha listadoPaciente : listadoPacientes) {
            aux += listadoPaciente.toString() + "\n";
        }
        aux += "Numero de pacientes: " + listadoPacientes.size() + "\n\n";
        return aux;
    }

    public void ordenarNom() {
        Collections.sort(listadoPacientes);
    }

    public void ordenarEdad() {
        Collections.sort(listadoPacientes, new CompararEdad());
    }

    public void ordenarApellido() {
        Collections.sort(listadoPacientes, new CompararApellido());
    }
}

class CompararEdad implements Comparator<Ficha> {

    @Override
    public int compare(Ficha lista, Ficha lista2) {
        return lista.getEdad() - lista2.getEdad();
    }
}

class CompararApellido implements Comparator<Ficha> {

    @Override
    public int compare(Ficha lista1, Ficha lista2) {
        return lista1.getApellidos().compareTo(lista2.getApellidos());
    }
}
    

