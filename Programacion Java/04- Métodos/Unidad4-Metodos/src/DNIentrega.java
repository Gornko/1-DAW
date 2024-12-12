/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Pableras
 */
public class DNIentrega {
    
    public static void letradni(int dni){
        int resto= dni%23;
        String letra= "a";
        switch(resto){
            case 0-> letra= "T";
            case 1-> letra= "R";
            case 2-> letra= "W";
            case 3-> letra= "A";
            case 4-> letra= "G";
            case 5-> letra= "M";
            case 6-> letra= "Y";
            case 7-> letra= "F";
            case 8-> letra= "P";
            case 9-> letra= "D";
            case 10-> letra= "X";
            case 11-> letra= "B";
            case 12->  letra= "N";
            case 13-> letra= "J";
            case 14-> letra= "Z";
            case 15-> letra= "S";
            case 16-> letra= "Q";
            case 17-> letra= "V";
            case 18-> letra= "H";
            case 19-> letra= "L";
            case 20-> letra= "C";
            case 21-> letra= "K";
            case 22-> letra= "E";
        }
        System.out.println(letra);
    }
    
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        int dni=sc.nextInt();
        System.out.print(dni);
        letradni(dni);
    }
}
