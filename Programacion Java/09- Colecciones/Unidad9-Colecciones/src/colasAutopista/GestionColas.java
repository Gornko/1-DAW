/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package colasAutopista;
import java.util.*;
/**
 *
 * @author Pableras
 * @fecha  28 mar 2024 21:06:36
 * @company Ciclo superior de informatica
 */



public class GestionColas {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int opcion =3;
        String matricula, modelo, color;
        LinkedList<Coche> efectivo=new LinkedList<>();
        LinkedList<Coche> importeExacto= new LinkedList<>();
        LinkedList<Coche> targeta=new LinkedList<>();
        do{
            System.out.println("Escoger opcion:");
            System.out.println("1- Añadir coche, 2- Eliminar coche, 3- Salir");
            opcion=sc.nextInt();
            switch(opcion){
                case 1:
                    System.out.println("Escoge cola:");
                    System.out.println("1- Efectivo, 2- Importe Exacto, 3- Targeta");
                    opcion=sc.nextInt();
                    sc.nextLine();
                    switch(opcion){
                        case 1:
                            System.out.println("Matricula: ");
                            matricula=sc.nextLine();
                            System.out.println("Modelo: ");
                            modelo= sc.nextLine();
                            System.out.println("Color: ");
                            color=sc.nextLine();
                            Coche cocheEfect=new Coche(matricula, modelo, color);
                            efectivo.addLast(cocheEfect);
                            break;
                        case 2:
                            System.out.println("Matricula: ");
                            matricula=sc.nextLine();
                            System.out.println("Modelo: ");
                            modelo= sc.nextLine();
                            System.out.println("Color: ");
                            color=sc.nextLine();
                            Coche cocheImpEx=new Coche(matricula, modelo, color);
                            importeExacto.addLast(cocheImpEx);
                            break;
                        case 3:
                            System.out.println("Matricula: ");
                            matricula=sc.nextLine();
                            System.out.println("Modelo: ");
                            modelo= sc.nextLine();
                            System.out.println("Color: ");
                            color=sc.nextLine();
                            Coche cocheTar=new Coche(matricula, modelo, color);
                            targeta.addLast(cocheTar);
                            break;
                    }
                    break;
                case 2:
                    System.out.println("Escoge cola: ");
                    System.out.println("1- Efectivo, 2- Importe Exacto, 3- Targeta");
                    opcion=sc.nextInt();
                    sc.nextLine();
                    switch(opcion){
                        case 1:
                            efectivo.removeFirst();
                            break;
                        case 2:
                            importeExacto.removeFirst();
                            break;
                        case 3:
                            targeta.removeFirst();
                            break;
                    }
                    break;
                
            }
            
        }while(opcion!=3);
    }
}
