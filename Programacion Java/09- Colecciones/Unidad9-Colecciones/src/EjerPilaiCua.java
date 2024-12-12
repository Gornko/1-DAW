/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;

/**
 *
 * @author Pableras
 * @fecha 29 mar 2024 0:07:18
 * @company Ciclo superior de informatica
 */
class Pila {

    private LinkedList pila;

    public Pila() {
        pila = new LinkedList();
    }
    
    public void set(Object objeto){
        pila.addFirst(objeto);
    }
    
    public Object get(){
        return pila.getFirst();
    }
    
    @Override
    public String toString(){
        String ret="";
        Iterator iter=pila.iterator();
        while(iter.hasNext()){
            ret+="\n"+iter.next();
        }
        return ret;
    }
}

class Cola {

    private LinkedList cola;

    public Cola() {
        cola = new LinkedList();
    }
    
    public void set(Object objecto){
        cola.addLast(objecto);
    }
    
    public Object get(){
        return cola.getFirst();
    }
    
    @Override
    public String toString(){
        String ret="";
        Iterator iter=cola.iterator();
        while(iter.hasNext()){
            ret+=" "+iter.next();
        }
        return ret;
    }
}

public class EjerPilaiCua {
    public static void main(String[]args){
        Pila pila=new Pila();
        pila.set(1);
        pila.set(2);
        pila.set(3);
        pila.set(4);
        pila.set(5);
        pila.set(6);
        Cola cola=new Cola();
        cola.set(1);
        cola.set(2);
        cola.set(3);
        cola.set(4);
        cola.set(5);
        cola.set(6);
        System.out.println(pila.toString());
        System.out.println("");
        System.out.println(cola.toString());
        
    }
}
