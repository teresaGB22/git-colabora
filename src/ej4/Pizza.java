/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej4;

/**
 *
 * @author teres
 */
public class Pizza {
    private String tamanyo;
    private String tipo;
    private String estado;
    private static int totalPedida = 0;
    private static int totalServida = 0;
    public Pizza(String tamanyo, String tipo) {
        this.tamanyo = tamanyo;
        this.tipo = tipo;
        this.estado = "pedida";
        totalPedida ++;
    }

    public static int getTotalPedida() {
        return totalPedida;
    }

    public static int getTotalServida() {
        return totalServida;
    }
    
      public void servir() {
        if (this.estado.equals("pedida")) {
            this.estado = "servida";
            totalServida++;
        } else {
            System.out.println("Esta pizza ha sido servida.");
        }
        
    }

    @Override
    public String toString() {
        return "Pizza = " + "tamaño: " + tamanyo + ", tipo: " + tipo + ", estado: " + estado;
    }
      
    
    
}
