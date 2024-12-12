/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha  26 mar 2024 14:07:49
 * @company Ciclo superior de informatica
 */
interface Extrems{
    int min(int[] a);
    int max(int[] a);
    
}

public final class Math3 implements Extrems{
    
    @Override
    public int min(int[] a){
        int min= Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        return min;
    }
    
    @Override
    public int max(int[] a){
        int max= Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        return max;
    }
    
}

class Test{
    public static void main(String[] args) {
        int[] a={5, 3, 9, 1, 7};
        Math3 prueba= new Math3();
        System.out.println(prueba.min(a));
        System.out.println(prueba.max(a));
    }
}
