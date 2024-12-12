/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Pableras
 * @fecha  27 mar 2024 22:43:55
 * @company Ciclo superior de informatica
 */
public class EjerColec1 {

    public static void main(String[] args) {
        ArrayList<String> listaPaises=new ArrayList<>();
        listaPaises.add("Alemania");
        listaPaises.add("España");
        Iterator iter=listaPaises.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
    }
}
