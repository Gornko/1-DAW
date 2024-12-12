/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha  26 feb 2024 11:32:51
 * @company Ciclo superior de informatica
 */

class Padre{
    protected int aa=0;
    public int aa(){
        return aa;
    }
}

class Hija extends Padre{
    public Hija(int bb){
        this.aa=bb+1;
    }
}

class Nieta extends Hija{
    public Nieta(int cc){
        super(cc+2);
    }
}

class Familia {
    private static Nieta f(Padre h){
        Nieta n= new Nieta(h.aa());
        return n;
    }
    
    public static void main(String[]args){
        Hija h=new Hija(4);
        h=f(h);
        System.out.println(h.aa());
    }
}
