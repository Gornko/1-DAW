/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Pableras
 * @fecha 31 ene 2024 11:10:48
 * @company Ciclo superior de informatica
 */
public class Ejercicio11 {

    //Ejercicios 11,12,13,14
    public static double acceso_por_indice(double[] v, int j) throws RuntimeException {
        try {
            if ((0 <= j) && (j <= v.length)) {
                return v[j];
            } else {
                throw new RuntimeException("El indice " + j+ " no existe en el vector");
            }
        } catch (RuntimeException exc) {
            throw exc;
        }
    }

    public static void main(String[] args) {
        double[] v = new double[15];
        acceso_por_indice(v, 16);
    }

}
