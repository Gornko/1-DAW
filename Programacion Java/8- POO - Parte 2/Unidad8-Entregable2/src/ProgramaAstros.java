/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author Pableras
 * @fecha 4 mar 2024 0:45:12
 * @company Ciclo superior de informatica
 */

abstract class Astro {

    protected String nombre;
    protected double masa;
    protected double tempMedia;

    public Astro(String nombre, double masa, double tempMedia) {
        this.nombre = nombre;
        this.masa = masa;
        this.tempMedia = tempMedia;
    }

    public void muestra() {
        System.out.println(nombre);
        System.out.println(masa);
        System.out.println(tempMedia);
    }
}

class Planeta extends Astro {

    private double distSol;
    private double orbSol;
    private int numSat;

    public Planeta(String nombre, double masa, double tempMedia, double distSol, double orbSol, int numSat) {
        super(nombre, masa, tempMedia);
        this.distSol = distSol;
        this.orbSol = orbSol;
        this.numSat = numSat;
    }

    @Override
    public void muestra() {
        super.muestra();
        System.out.println(distSol);
        System.out.println(orbSol);
        System.out.println(numSat);
    }
}

class Satelite extends Astro {

    private double distPlaneta;
    private double orbPlaneta;
    private String nomPlaneta;

    public Satelite(String nombre, double masa, double tempMedia, double distPlaneta, double orbPlaneta, String nomPlaneta) {
        super(nombre, masa, tempMedia);
        this.distPlaneta = distPlaneta;
        this.orbPlaneta = orbPlaneta;
        this.nomPlaneta = nomPlaneta;
    }

    @Override
    public void muestra() {
        super.muestra();
        System.out.println(distPlaneta);
        System.out.println(orbPlaneta);
        System.out.println(nomPlaneta);
    }
}

public class ProgramaAstros {

    public static void main(String[] args) {
        ArrayList<Astro> astros = new ArrayList<Astro>();
        Planeta pla1 = new Planeta("Tierra", 2000000.0, 35.0, 4.0, 3.0, 1);
        Satelite sat1 = new Satelite("Luna", 50000.0, 39.0, 6.0, 7.0, "Tierra");
        astros.add(pla1);
        astros.add(sat1);

        Astro s = (Astro) astros.get(0);
        s.muestra();
        s = (Astro) astros.get(1);
        s.muestra();
        pla1.muestra();
        sat1.muestra();
    }
}
