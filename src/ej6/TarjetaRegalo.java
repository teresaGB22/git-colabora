/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej6;

/**
 *
 * @author teres
 */
import java.util.Random;
public class TarjetaRegalo {
    private double saldo;
    private int num ;
    Random r = new Random();
    public TarjetaRegalo(double saldo){
        this.saldo = saldo;
        this.num = 10000 + r.nextInt(900000);
    }

    public double getSaldo() {
        return saldo;
    }
    
    public void gastar(double n){
        if(this.saldo - n > 0){
            this.saldo -= n;
        }else{
            System.err.println("Error, no puedes gastar más de lo que tienes.");
        }
        
    
    }
      public static TarjetaRegalo fusionar(TarjetaRegalo n, TarjetaRegalo l){
          double saldoFusionado = n.getSaldo() + l.getSaldo();
          TarjetaRegalo m = new TarjetaRegalo(saldoFusionado);
          n.saldo=0;
          l.saldo=0;
          return m;
      }

    @Override
    public String toString() {
        return "TarjetaRegalo: " + "saldo: " + saldo + ", num: " + num ;
    }
      
}
