/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

import java.util.Scanner;

/**
 *
 * @author teres
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        CuentaCorriente num1 = new CuentaCorriente("Teresa", "hkaeuuhde");
        CuentaCorriente num2 = new CuentaCorriente(20);
        CuentaCorriente num3 = new CuentaCorriente(20,-3,"ahleuhhud");
        System.out.println("Mostrando informacion: ");
        num1.mostrarInformacion();
        num2.mostrarInformacion();
        num3.mostrarInformacion();
        System.out.println("Informacion cambiada: ");
        num1.IngresarDinero(30);
        num2.SacarDinero(7);
        num3.SacarDinero(22);
        num1.mostrarInformacion();
         num2.mostrarInformacion();
        num3.mostrarInformacion();
        
        num1.cambiarNombreBanco("ELleas");
        System.out.println("Informacion otra vez cambiada");
        num1.mostrarInformacion();
        System.out.println("Nombre de cuenta1: " + num1.nombre);
                }
    
}
