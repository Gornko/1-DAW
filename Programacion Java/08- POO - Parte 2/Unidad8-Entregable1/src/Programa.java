/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Pableras
 */
abstract class CuentaBancaria{
    protected String numeroCuenta;
    protected double saldo;
    public static final double interesAnualBasico=2.5f;
    
    public CuentaBancaria(String numeroCuenta, double saldo){
        this.numeroCuenta=numeroCuenta;
        this.saldo=saldo;
    }
    
    public String getNumeroCuenta(){
        return numeroCuenta;
    }
    
    public double getSaldo(){
        return saldo;
    }
    public void ingresar(double x){
        saldo+=x;
    }
    public void retirar(double x){
        saldo-=x;
    }
    protected void anyadir(double cantidad){
        saldo+=cantidad;
    }
    public void traspaso(CuentaBancaria cc, double cant){
        anyadir(cant);
        cc.anyadir(-cant);
       
    }
    abstract public void calcularIntereses();
    public void mostrar(){
        System.out.println(numeroCuenta+" "+saldo);
    }
}

class CuentaCorriente extends CuentaBancaria{
    public CuentaCorriente(String numeroCuenta, double saldo){
        super(numeroCuenta, saldo);
    }
    public void calcularIntereses(){
        double interes=saldo*interesAnualBasico/100;
        anyadir(interes);
    }
}

class CuentaAhorro extends CuentaBancaria{
    final double saldoMinimo=3000f;
    public CuentaAhorro(String numeroCuenta, double saldo){
        super(numeroCuenta, saldo);
    }
    public void calcularIntereses(){
        double interes=0;
        if(saldo<saldoMinimo){
            interes=saldo*(interesAnualBasico/2.0)/100;
        }else{
        interes=saldo*(interesAnualBasico*2.0)/100;
        }
        anyadir(interes);
    }
}


