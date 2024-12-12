/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha 26 feb 2024 10:04:48
 * @company Ciclo superior de informatica
 */
class Clase1 {

    protected int prop1 = 10, prop2 = 4;

    public void imprimir(int i) {
        prop1 = prop1 + i;
        prop2 = prop2 + i;
        System.out.println(prop1 + " " + prop2);
    }
}

class Clase2 extends Clase1 {

    public void imprimir(int i) {
        prop1 = prop1 - i;
        prop2 = prop2 - i;
        System.out.println(prop1 + " " + prop2);
    }
}

class Question1 {

    public static void main(String[] args) {
        Clase1 obj1 = new Clase1();
        obj1.imprimir(4);
        Clase2 obj2 = new Clase2();
        obj2.imprimir(3);
    }
}
