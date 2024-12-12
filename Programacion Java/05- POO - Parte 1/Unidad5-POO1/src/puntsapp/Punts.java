/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package puntsapp;

/**
 *
 * @author Pableras
 * @fecha 7 nov 2023 23:55:25
 * @company Ciclo superior de informatica
 */
class punt {

    private double coordx, coordy;

    public punt(double x, double y) {
        this.coordx = x;
        this.coordy = y;
    }

    public punt() {

    }

    public double getX() {
        return coordx;
    }

    public double getY() {
        return coordy;
    }

    public void getPrintX() {
        System.out.println("x: " + coordx);
    }

    public void getPrintY() {
        System.out.println("y: " + coordy);
    }

    public void getPrintCoord() {
        System.out.println("x: " + coordx);
        System.out.println("y: " + coordy);
    }

    public static double distancia(punt punto1, punt punto2) {
        double x1, y1, x2, y2;
        x1 = punto1.getX();
        y1 = punto1.getY();
        x2 = punto2.getX();
        y2 = punto2.getY();
        double diferenciaX = x2 - x1;
        double diferenciaY = y2 - y1;
        double distancia = Math.sqrt(diferenciaX * diferenciaX + diferenciaY * diferenciaY);
        return distancia;

    }

    public static double distOrigen(punt punto) {
        double diferenciaX = punto.getX();
        double diferenciaY = punto.getY();
        double distancia = Math.sqrt(diferenciaX * diferenciaX + diferenciaY * diferenciaY);
        return distancia;
    }

}

public class Punts {

    public static void main(String[] args) {

        punt punt1 = new punt();
        punt punt2 = new punt(5, 3);
        punt punt3 = new punt(2, -1);
        punt punt4 = new punt((5 + 2) / 2, (3 - 1) / 2);
        punt punt5 = new punt(4, 3);

        System.out.println("El punto 5 se encuentra a una distancia de " + punt.distOrigen(punt5) + " del origen");
        System.out.println("La distancia entre el punto 1 y el 2 es de "+punt.distancia(punt2, punt3));
    }
}
