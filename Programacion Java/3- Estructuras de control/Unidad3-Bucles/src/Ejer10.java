
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Pableras
 */
public class Ejer10 {

    public static void main(String[] args) {
        int tiradas, cuenta, cara = 0, cruz = 0;

        Scanner sc = new Scanner(System.in);
        tiradas = sc.nextInt();

        for (int i = 0; i < tiradas; i++) {
            cuenta = (int) (Math.random() * (1 - 0 + 1) + 0);
            System.out.println(cuenta);
            if (cuenta == 0) {
                cara++;
            } else {
                cruz++;
            }
        }
        System.out.println(cara);
        System.out.println(cruz);

    }
}
