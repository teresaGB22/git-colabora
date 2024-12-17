/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

/**
 *
 * @author teres
 */
public class Banco {
    private  final String nombre;
    private double capital;
    private String direccionCentral;
    
    public Banco(String nombre){
        this.nombre = nombre;
        this.capital = 5.2;
        this.direccionCentral = "Sin dirección";
    }
    public Banco(String nombre, double capital, String direccionCentral){
        this.nombre = nombre;
        this.capital = capital;
        this.direccionCentral = direccionCentral;
        
    }

    public String getNombre() {
        return nombre;
    }

    public double getCapital() {
        return capital;
    }

    public String getDireccionCentral() {
        return direccionCentral;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public void setDireccionCentral(String direccionCentral) {
        this.direccionCentral = direccionCentral;
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", capital=" + capital + ", direccionCentral=" + direccionCentral + '}';
    }
    
    
}
