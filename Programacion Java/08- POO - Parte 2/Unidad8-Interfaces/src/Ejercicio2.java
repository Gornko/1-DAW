/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha 26 mar 2024 13:40:40
 * @company Ciclo superior de informatica
 */
interface I_instrumento {

    public void tocar();
}

abstract class Instrumento implements I_instrumento {

    @Override
    public void tocar() {
        afinar();
        hacerSonar();
    }

    protected abstract void afinar();

    protected abstract void hacerSonar();
}

class Guitarra extends Instrumento {

    @Override
    protected void afinar() {
        System.out.println("Afino las cuerdas de la guitarra");
    }

    @Override
    protected void hacerSonar() {
        System.out.println("Suenan las cuerdas");
    }
}

class Trompeta extends Instrumento {

    @Override
    protected void afinar() {
        System.out.println("Afino la trompeta y las teclas");
    }

    @Override
    protected void hacerSonar() {
        System.out.println("Soplo y suena la trompeta");
    }
}

public class Ejercicio2 {

    public static void main(String[] args) {
        Instrumento instrumento = new Guitarra();
        instrumento.tocar();
        instrumento = new Trompeta();
        instrumento.tocar();
    }

}
