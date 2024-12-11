/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha 1 mar 2024 18:44:17
 * @company Ciclo superior de informatica
 */
//Enumerado de formatos para el atributo formato de la clase Multimedia
enum Formato {
    wav, mp3, midi, avi, mov, mp4, cdAudio, dvd
}

//Clase Multimedia
class Multimedia {

    private String titulo;
    private String autor;
    private Formato formato;
    private int duracion;

    //Constructor
    public Multimedia(String titulo, String autor, Formato formato, int duracion) {
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
    }

    //Metodos get
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public Formato getFormato() {
        return formato;
    }

    public int getDuracion() {
        return duracion;
    }

    //Metodo toString con StringBuilder
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Titulo: ").append(titulo).append("\n")
                .append("Autor: ").append(autor).append("\n")
                .append("Formato: ").append(formato).append("\n")
                .append("Duracion: ").append(duracion).append(" minutos").append("\n");
                
        return info.toString();
    }

    /*Metodo. Compara atributos titulo-titulo y autor-autor, devuelve true si 
    los dos son iguales, si solo es uno o ninguno devuelve false*/
    public boolean equals(Multimedia m) {
        if (this.titulo == m.titulo && this.autor == m.autor) {
            return true;
        } else {
            return false;
        }
    }

}

//Clase Pelicula hija de Multimedia
class Pelicula extends Multimedia {

    private String actorPrincipal;
    private String actrizPrincipal;

    //Constructor
    /*Permite  que actor o actriz sean nulos, pero no los dos al mismo tiempo,
    en ese caso sale una excepcion*/
    public Pelicula(String titulo, String autor, Formato formato, int duracion, String actor, String actriz) {
        super(titulo, autor, formato, duracion);
        if (actor == null && actriz == null) {
            throw new IllegalArgumentException("No se pueden asignar valores nulos a actor y actriz al mismo tiempo.");
        }
        this.actorPrincipal = actor;
        this.actrizPrincipal = actriz;
    }

    //Metodo toString
    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        cadena.append(super.toString()).append("Actor: ").append(actorPrincipal).append("\n")
                .append("Actriz: ").append(actrizPrincipal).append("\n");
        return cadena.toString();
    }
}

//Clase Disco hija de Multimedia
class Disco extends Multimedia {

    private String genero;

    //Constructor
    public Disco(String titulo, String autor, Formato formato, int duracion, String genero) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    //Metodo get
    public String getGenero() {
        return genero;
    }

    //Metodo toString
    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        cadena.append(super.toString()).append("Genero: ").append(genero).append("\n");
        return cadena.toString();
    }
}

//Clase ListaMultimedia
/*Contiene un array de objetos Multimedia y metodos*/
class ListaMultimedia {

    private Multimedia[] lista;
    /*Atributo
    Lleva la cuenta de los objetos que contiene la lista*/
    private int cuentaLista = 0;

    //Constructor
    /*Crea un objeto ListaMultimedia indicando la longitud del array*/
    public ListaMultimedia(int maximoLista) {
        this.lista = new Multimedia[maximoLista];
    }

    /*Metodo. 
    Recorre el array, cuenta los elementos que no son nulos y devuelve la cuenta*/
    public int Size() {
        int cuenta = 0;
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                cuenta++;
            }
        }
        return cuenta;
    }

    /*Metodo add
    Añade objetos al array, mientras quede espacio not null, suma 1 a la cuenta
    de objetos del array. Si el array esta lleno devuelve false*/
    public boolean add(Multimedia m) {
        if (cuentaLista == lista.length) {
            return false;
        } else {
            this.lista[cuentaLista] = m;
            cuentaLista++;
            return true;
        }
    }

    //Metodo get de objetos de la lista
    public Multimedia get(int posicion) {
        return lista[posicion];
    }

    /*Metodo
    Devuelve la posicion de la lista en la que se encuentra el objeto pasado 
    como parametro, si no existe devuelve -1*/
    public int indexOf(Multimedia m) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] == m) {
                return i;
            }
        }
        return -1;
    }

    //Metodo toString
    @Override
    public String toString() {
        StringBuilder cadena = new StringBuilder();
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null) {
                cadena.append(lista[i]);
                cadena.append("--------\n");
            }
        }
        return cadena.toString();
    }

}

public class Exercicis3 {
 //faltaria comentar el main
    public static void main(String[] args) {
        Multimedia multi1 = new Multimedia("peli1", "autor1", Formato.avi, 154);
        Multimedia multi2 = new Multimedia("peli2", "autor2", Formato.dvd, 90);
        Multimedia multi3 = new Multimedia("peli3", "autor3", Formato.dvd, 120);

        ListaMultimedia lista1 = new ListaMultimedia(10);

        lista1.add(multi1);
        lista1.add(multi2);
        lista1.add(multi3);

        System.out.println(lista1.toString());

        Pelicula peli1 = new Pelicula("peli4", "autor4", Formato.avi, 98, "Carrey", null);
        Pelicula peli2 = new Pelicula("peli5", "autor5", Formato.avi, 150, "Paul", "Marie");
        Pelicula peli3 = new Pelicula("peli6", "autor6", Formato.avi, 79, null, "Charlote");
        
        lista1.add(peli1);

        System.out.println("Peli1 se encuentra en la posicion: " + lista1.indexOf(peli1));
        System.out.println("");

        System.out.println(lista1.get(lista1.indexOf(peli1)));

        System.out.println("------------------------");

        ListaMultimedia lista2 = new ListaMultimedia(10);
        
        Disco disco1 = new Disco("titulo1", "autor1", Formato.mp3, 60, "rock");
        Disco disco2 = new Disco("titulo2", "autor2", Formato.mp3, 70, "heavy");
        Disco disco3 = new Disco("titulo3", "autor3", Formato.mp3, 52, "clasica");
        
        lista2.add(disco1);
        lista2.add(disco2);
        lista2.add(disco3);
        
        System.out.println(lista2.toString());
        
        ListaMultimedia lista3 =new ListaMultimedia(10);
        
        lista3.add(disco1);
        lista3.add(disco2);
        lista3.add(disco3);
        
        lista3.add(peli1);
        lista3.add(peli2);
        lista3.add(peli3);
        
        System.out.println("Ejercicio 4:\n");
        System.out.println(lista3.toString());
        
        int duracion=0;
        for (int i = 0; i < lista3.Size(); i++) {
            duracion+=lista3.get(i).getDuracion();
        }
        System.out.println("La duracion total de los elementos de la lista3 es de: "+duracion+" minutos");
        
        

    }
}
