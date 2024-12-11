package ejer5reloj;

import java.util.Scanner;

class reloj {

    private int hora, minutos, segundos;
    private String prueba="Holi";

    public reloj() {

    }

    public reloj(int hora, int minutos, int segundos) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public String prueba(){
        return prueba;
    }

    public void getHora() {
        System.out.println(hora + ":" + minutos + ":" + segundos);
    }

    public void getHora12o24() {
        String resp;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Formato 12h o 24h?");
        resp = sc.nextLine();
        if (resp.equals("12h")) {
            if (hora < 12) {
                System.out.println(hora + ":" + minutos + ":" + segundos + "AM");
            } else if (hora < 24) {
                System.out.println(hora-12 + ":" + minutos + ":" + segundos + "PM");
            }

        } else if (resp.equals("24h")) {
            System.out.println(hora + ":" + minutos + ":" + segundos);
        }
    }

    public void puestaEnHora(int horas, int minutos) {
        this.hora = horas;
        this.minutos = minutos;
        this.segundos = 0;
    }

    public void puestaEnHora(int horas, int minutos, int segundos) {
        this.hora = horas;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public void fijarHora(int horas, int minutos, int segundos){
        Scanner sc=new Scanner(System.in);
        String resp;
        System.out.println("La hora es formato AM o PM?");
        resp=sc.nextLine();
        if (resp.equals("PM")){
            if (horas>12){
                this.hora=horas-12;
            }else 
                this.hora=horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }else if(resp.equals("AM")){
            this.hora=horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }
    }

}

public class RelojApp {

    public static void main(String[] args) {
        reloj relojPrueba = new reloj();
        relojPrueba.getHora12o24();
        relojPrueba.fijarHora(15, 35, 22);
        relojPrueba.getHora();
        System.out.println(relojPrueba.prueba());
    }

}
