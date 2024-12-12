/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
import java.io.*;

/**
 *
 * @author Pableras
 * @fecha 25 abr 2024 13:58:03
 * @company Ciclo superior de informatica
 */
public class Ejer2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fichero1, fichero2, fichero3, separacion;
        FileReader fr1, fr2;
        BufferedReader bfr1, bfr2;

        File fich1 = new File("fich1.txt");
        File fich2 = new File("fich2.txt");
        FileWriter fw1 = null, fw2 = null;
        try {
            fw1 = new FileWriter(fich1);
            fw2 = new FileWriter(fich2);
            fich1.createNewFile();
            fich2.createNewFile();
            fw1.write("Pau");
            fw2.write("Laia");
         
        } catch (IOException e) {

        } finally {
            try {
                if (fw1 != null) {
                    fw1.close();
                }
                if (fw2 != null) {
                    fw2.close();
                }
            } catch (Exception e) {
                System.out.println("Error al cerrar el fichero");
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Vamos a unir los ficheros");
        System.out.println("Indica nombre del primer fichero");
        fichero1 = sc.nextLine();
        System.out.println("Indica el nombre del segundo fichero");
        fichero2 = sc.nextLine();
        System.out.println("Indica la separacion, en espacios o tabulaciones");
        separacion = sc.nextLine();

        try {
            fr1 = new FileReader(fichero1);
            bfr1 = new BufferedReader(fr1);
            fr2 = new FileReader(fichero2);
            bfr2 = new BufferedReader(fr2);

            // Leer las líneas de ambos ficheros
            String linea1 = bfr1.readLine();
            String linea2 = bfr2.readLine();
            
            // Combinamos las líneas de ambos ficheros
            while (linea1 != null || linea2 != null) {
                if (linea1 != null) {
                    System.out.print(linea1); // Imprime la primera línea
                    if (linea2 != null) {
                        System.out.print(separacion); // Imprime la separación
                    }
                }
                if (linea2 != null) {
                    System.out.print(linea2); // Imprime la segunda línea
                }
                
                // Lee las siguientes líneas
                linea1 = bfr1.readLine();
                linea2 = bfr2.readLine();
                
                // Imprime salto de línea
                if (linea1 != null || linea2 != null) {
                    System.out.println();
                }
            }
        } catch (IOException e) {
            System.out.println("Error al leer los ficheros");
            e.printStackTrace();
        }
    }
}

