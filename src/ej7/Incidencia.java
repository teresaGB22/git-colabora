/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej7;

import java.util.Random;

/**
 *
 * @author teres
 */
public class Incidencia {
    private int codigo ;
    private static int contadorC = 1;
    private String estado;
    private int puesto;
   private String resolver;
    public Incidencia(int puesto){
        this.puesto = puesto;
        this.codigo = contadorC++;
        this.estado="pendiente";
        this.resolver = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public int getPuesto() {
        return puesto;
    }

    public String getEstado() {
        return estado;
    }
   
    public void Resuelta(String resuelta){
        this.estado= "resuelta";
        this.resolver = resuelta;
    }

    @Override
    public String toString() {
        return "Incidencia{" + "codigo=" + codigo  + ", estado: " + estado + ", puesto: " + puesto + ", resolver: " + resolver ;
    }
    
}
