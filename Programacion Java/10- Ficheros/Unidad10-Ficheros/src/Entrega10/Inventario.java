/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Entrega10;

import java.io.*;
import java.util.*;


abstract class Mascotas implements Serializable {

    protected String nombreI;
    protected int edad;
    protected String estado;
    protected String fechaNacimiento;

    public Mascotas(String nombreI, int edad, String estado, String fechaNacimiento) {
        this.nombreI = nombreI;
        this.edad = edad;
        this.estado = estado;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombreI() {
        return nombreI;
    }

    public int getEdad() {
        return edad;
    }

    public String getEstado() {
        return estado;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

}

class Perro extends Mascotas {

    public Perro(String nombreI, int edad, String estado, String fechaNacimiento) {
        super(nombreI, edad, estado, fechaNacimiento);
    }
}

class Gato extends Mascotas {

    public Gato(String nombreI, int edad, String estado, String fechaNacimiento) {
        super(nombreI, edad, estado, fechaNacimiento);
    }
}

abstract class Aves extends Mascotas {

    public Aves(String nombreI, int edad, String estado, String fechaNacimiento) {
        super(nombreI, edad, estado, fechaNacimiento);
    }
}

class Loro extends Aves {

    public Loro(String nombreI, int edad, String estado, String fechaNacimiento) {
        super(nombreI, edad, estado, fechaNacimiento);
    }
}

class Canario extends Aves {

    public Canario(String nombreI, int edad, String estado, String fechaNacimiento) {
        super(nombreI, edad, estado, fechaNacimiento);
    }
}

public class Inventario implements Serializable {

    private ArrayList<Mascotas> lista;

    public Inventario() {
        lista=new ArrayList<Mascotas>();
    }

    public void vaciar() {
        lista.clear();
    }

    public void anyadirMascota(Mascotas a) {
        lista.add(a);
    }

    public void eliminaMascota(String nombreI) {
        for (int i = 0; i < lista.size(); i++) {
            Mascotas mascota = lista.get(i);
            if (mascota.getNombreI().equals(nombreI)) {
                lista.remove(i);
            }
        }
    }

    public void imprimirTodos() {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombreI());
        }
    }

    public void imprimirPerros() {

        Iterator<Mascotas> iterator = lista.iterator();
        while (iterator.hasNext()) {
            Mascotas mascota = iterator.next();
            if (mascota instanceof Perro) {
                System.out.println(mascota.getNombreI());;
            }
        }
    
    }

    public static void main(String[] args) {

        //1.- obrir el fitxer inventari.dat,carregar les dades guardades i tancar el fitxer
        //quan no existisca el fitxer (la 1era execució) es dispararà una excepció, gestionar-la
        Inventario i = new Inventario();  //intàncie un objecte nou per a la primera execució

        try {
            FileInputStream fichero = new FileInputStream("inventario.dat");
            ObjectInputStream oip = new ObjectInputStream(fichero);

            i = (Inventario) oip.readObject();

            oip.close();

        } catch (IOException e) {
            System.out.println("No s ha llegit de fitxer. Començem un nou inventari");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        //mostrar totes les dades per pantalla
        System.out.println("***Llistat inventari:");
        i.imprimirTodos();

        //2.- sol·licitar les dades d'un gos, un gat, un canari i un Lloro i afegir-los a inventari
        //mostrar totes les dades per pantalla
        Scanner lector = new Scanner(System.in);
        Mascotas animalet;
        String nom, estat, dataNaixement;
        int edat;
        System.out.println("\nQuina mascota vols agregar:\n"
                + "1. gos / 2. gat / 3. canari / 4. lloro / 0. Eixir");

        int num = lector.nextInt();

        while (num != 0) {
            System.out.print("Nom: ");
            lector.nextLine();
            nom = lector.nextLine();

            System.out.print("Edat: ");
            edat = lector.nextInt();
            
            System.out.print("Estat: ");
            lector.nextLine();
            estat = lector.nextLine();

            System.out.print("Data de Naixement: ");
            dataNaixement = lector.nextLine();

            switch (num) {
                case 1:
                    animalet = new Perro(nom, edat, estat, dataNaixement);
                    i.anyadirMascota(animalet);
                    break;
                case 2:
                    animalet = new Gato(nom, edat, estat, dataNaixement);
                    i.anyadirMascota(animalet);
                    break;
                case 3:
                    animalet = new Canario(nom, edat, estat, dataNaixement);
                    i.anyadirMascota(animalet);
                    break;

                case 4:
                    animalet = new Loro(nom, edat, estat, dataNaixement);
                    i.anyadirMascota(animalet);
                    break;
                case 0:
                    System.out.println("Adeu");
                default:
                    System.out.println("Opció invàlida");
            }

            System.out.println("\nQuina mascota vols agregar:\n"
                    + "1. gos / 2. gat / 3. canari / 4. lloro / 0. Eixir");
            num = lector.nextInt();
        }

        //mostrar totes les dades per pantalla
        System.out.println("***Llistat inventari:");
        i.imprimirTodos();
        //3.- obrir el fitxer inventari.dat d'escriptura, guardar l'inventari i tancar el fitxer
        try {
            FileOutputStream archivo2 = new FileOutputStream("inventario.dat");
            ObjectOutputStream oops = new ObjectOutputStream(archivo2);

            oops.writeObject(i);
           
            oops.close();
            
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero");
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("No se puede cerrar el fichero");
            System.out.println(e.getMessage());
        }

    }}
