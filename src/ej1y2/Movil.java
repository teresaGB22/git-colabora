/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1y2;

/**
 *
 * @author teres
 */
public class Movil extends Terminal{
    private String tarifa;
    private double coste;
    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.coste = 0;
    }
    @Override
    public void llama(Terminal otro, int segundos) {
        super.llama(otro, segundos);
        double costePorSegundo = 0;
        switch (this.tarifa) {
            case "rata":
                costePorSegundo = 0.06 / 60;
                break;
            case "mono":
                costePorSegundo = 0.12 / 60;
                break;
            case "bisonte":
                costePorSegundo = 0.30 / 60;
                break;
        }
        this.coste += costePorSegundo * segundos;
    }
    @Override
    public String toString() {
       
        return super.toString() + " - tarificados " + coste + " euros";
    }

}
