/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha 7 nov 2023 22:39:21
 * @company Ciclo superior de informatica
 */
public class Cotxe {

    private String modelo, color, matricula, tipo, seguro;
    private boolean pinturaMetalizada;
    private int year;

    public void setModel(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setTipo(String tipo) {
        switch (tipo) {
            case "MINI":
                this.tipo = "MINI";
                break;
            case "UTILITARI":
                this.tipo = "UTILITARI";
                break;
            case "FAMILIAR":
                this.tipo = "FAMILIAR";
                break;
            default:
                this.tipo = "ESPORTIU";
                break;
        }
    }

    public void setSeguro(String seguro) {
        this.seguro = seguro;
    }

    public void setPintMet(String resp) {
        switch (resp) {
            case "si","SI":
                this.pinturaMetalizada = true;
                break;
            case "no","NO":
                this.pinturaMetalizada = false;
                break;
        }
    }

    public void setYear(int year) {
        this.year = year;
    }
    public void mostraCotxe(){
        System.out.println(matricula);
        System.out.println(modelo);
        System.out.println(color);
    }
}
