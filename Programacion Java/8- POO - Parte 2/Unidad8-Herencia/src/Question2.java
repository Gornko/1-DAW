/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha 26 feb 2024 10:20:14
 * @company Ciclo superior de informatica
 */
abstract class Uno {
    protected int i = 2;
    abstract public void frase();
}

class Dos extends Uno {
    public void frase() {
        int i = 3;
        System.out.println("Objeto de clase Dos con i: " + i);
    }
}

class Tres extends Dos {

    public void frase() {
        System.out.println("Objeto de clase Tres con i: " + i);
    }
}

class Question2 {

    public static void main(String[] args) {
        Uno[] lista = new Uno[2];
        lista[0] = new Dos();
        lista[1] = new Tres();
        for (int i = 0; i < 2; i++) {
            lista[i].frase();
        }
    }
}
