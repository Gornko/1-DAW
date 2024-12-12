/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha 28 feb 2024 17:33:56
 * @company Ciclo superior de informatica
 */
class Punt {

    private int x;
    private int y;

    public Punt(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

class Poligono {

    private Punt[] puntos;

    public Poligono(Punt[] puntos) {
        this.puntos = puntos;
    }
    public void trasladar(int x, int y){
        for (int i = 0; i < puntos.length; i++) {
            puntos[i].setX(puntos[i].getX()+x);
            puntos[i].setY(puntos[i].getY()+y);
        }
    }
    
    public String toString(){
        String cadenaPoligono="";
        for (int i = 0; i < puntos.length; i++) {
            cadenaPoligono+="("+puntos[i].getX()+","+puntos[i].getY()+")\n";
        }
        return cadenaPoligono;
    }
    public int numVertex(){
        return puntos.length;
    }
    

}

public class Exercicis2 {

    public static void main(String[] args) {
        Punt punt1=new Punt(0,0);
        Punt punt2=new Punt(2,0);
        Punt punt3=new Punt(2,2);
        Punt punt4=new Punt(0,2);
        Punt[] listaPuntos={punt1,punt2,punt3,punt4};
        Poligono poligono1=new Poligono(listaPuntos);
        System.out.println(poligono1.toString());
        poligono1.trasladar(4, -3);
        System.out.println("------------");
        System.out.println(poligono1.toString());
        System.out.println("------------");
        System.out.println(poligono1.numVertex());
    }
}
