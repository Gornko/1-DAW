/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pableras
 */
public class Ej07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ingresoInicial=2000; //Variable con el saldo inicial
        double interesAnual= (ingresoInicial*2.75)/100; //Calculo del interes anual que paga el banco
        double interesMensual= interesAnual/12; //Calculo del interes mensual
        double retHacienda=interesMensual-((interesMensual*18)/100); //Calculo de lo que se lleva hacienda por mes
        System.out.println(ingresoInicial+interesMensual*6-retHacienda+"€"); //Interes que devuelve el banco tras 6 meses
        
    }
    
}
