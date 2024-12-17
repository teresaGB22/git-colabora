/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej4;

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
        Scanner t = new Scanner(System.in);
        Pizza[] pizzas = new Pizza[3];
        for(int i = 0; i < pizzas.length; i++){
            System.out.println("Inserte la pizza " + (i+1));
            System.out.println("Inserte el tamaño de la pizza: (mediana o familiar)");
            String tamanyo = t.nextLine();
            System.out.println("Inserte el tipo de pizza(margarita, cuattro quesos o funghi)");
            String tipo = t.nextLine();
            
            pizzas[i] = new Pizza(tamanyo, tipo);
            t.nextLine();
            
        }
        pizzas[2].servir();
        System.out.println("El total de pizzas pedidas son: " + Pizza.getTotalPedida() );
        System.out.println("El total de pizzas servidas es: " + Pizza.getTotalServida());
    }
    
}
