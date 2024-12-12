/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.io.*;
import java.util.Scanner;
/**
 *
 * @author Pableras
 * @fecha  25 abr 2024 11:02:30
 * @company Ciclo superior de informatica
 */
public class Ejer1 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        String cadena1, cadena2, cadena3, ruta;
        String fichero1, fichero2, fichero3, separador;
        FileReader fr1, fr2;
        FileWriter fw;
        BufferedWriter bw = null;
        BufferedReader br1 = null, br2 = null;
System.out.println(" El directorio actual es. " + System.getProperty("user.dir"));
        System.out.println("Vamos a unir los datos del fichero1 y fichero2 en el fichero3");
        /* System.out.println("Nombre del fichero1 : ");
         fichero1 = lector.nextLine();
         System.out.println("Nombre del fichero2 : ");
         fichero2 = lector.nextLine();
         System.out.println("Nombre del fichero3 : ");
         fichero3 = lector.nextLine();
         System.out.println("caracteres de separación : ")
         separador = lector.nextLine();*/
        fichero1 = "lista1.txt";
        fichero2 = "lista2.txt";
        fichero3 = "listaejer1.txt";
        separador = " * ";
	ruta="C:\\Users\\Pableras\\DAW\\Programacion Java\\";

        
            try {
            fr1 = new FileReader(ruta+fichero1);
            br1 = new BufferedReader(fr1);
            fr2 = new FileReader(ruta+fichero2);
            br2 = new BufferedReader(fr2);
            fw = new FileWriter(ruta+fichero3);
            bw = new BufferedWriter(fw);
           cadena1 = br1.readLine();
            cadena2 = br2.readLine();
            while (cadena1 != null || cadena2 != null) {
                if (cadena1 == null) {
                    cadena1 = "";
                }
                if (cadena2 == null) {
                    cadena2 = "";
                }
                cadena3 = cadena1 + separador + cadena2 + "\n";
                bw.write(cadena3);

                cadena1 = br1.readLine();
                cadena2 = br2.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Fichero no encontrado");
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println("Error de lectura de fichero");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Error general de fichero");
            System.out.println(e.getMessage());
        } finally {
            try {
                if (br1 != null) {
                    br1.close();
                }
                if (br2 != null) {
                    br2.close();
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }
    }
}