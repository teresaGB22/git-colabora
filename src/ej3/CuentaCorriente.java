/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author teres
 */
public class CuentaCorriente  {
    private double saldo;
    private double limiteDescubierto;
    public String nombre;
    String dni;
    private static String banco;
    private Banco b;

    public CuentaCorriente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = 0;
        this.limiteDescubierto = -50;
        this.b = null;
                
    }
    public double SacarDinero(double n){
        if( saldo - n >= limiteDescubierto){
            saldo -= n;
        }else{
            saldo = limiteDescubierto;
        }
        return saldo;
    }
    
    public double IngresarDinero(double n){
        saldo += n;
        return saldo;
    }

    
    public void mostrarInformacion() {
        if (b != null) {
            System.out.println("Cuenta corriente: " + " Nombre: " + nombre + " dni " + dni + " saldo " + saldo + " limite de descubierto " + limiteDescubierto + " Banco: " + b.toString());
        } else {
            System.out.println("Cuenta corriente: " + " Nombre: " + nombre + " dni " + dni + " saldo " + saldo + " limite de descubierto " + limiteDescubierto + " Banco: No asignado");
        } 
    }
    
    public CuentaCorriente(double saldoIn){
        this.saldo = saldoIn;
        this.limiteDescubierto =0;
        this.dni = null;
    }
    public CuentaCorriente(double saldoIn, double limite, String dni){
        this.saldo = saldoIn;
        this.limiteDescubierto = limite;
        this.dni = dni;
        
    }
    public String cambiarNombreBanco(String b){
        banco = b;
        return banco;
    }
    public static String getBanco(){
        return banco;
    }
}
