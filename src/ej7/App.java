/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej7;

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

        int num;
        Incidencia[] incidencias = new Incidencia[10];
        int i = 0;

        do {

            System.out.println("1. Abrir incidencia");
            System.out.println("2. Resolver incidencia");
            System.out.println("3. Mostrar estadísticas. Con informacion: Nº incidencias abiertas, Nº incidencias pendientes, Nº incidencias resueltas");
            System.out.println("4. Salir");
            num = t.nextInt();
            switch (num) {
                case 1:
                    if (i < incidencias.length) {
                        System.out.println("Inserte el puesto de la incidencia");
                        int puesto = t.nextInt();
                        incidencias[i] = new Incidencia(puesto);
                        System.out.println("Incidencia abierta con código: " + incidencias[i].getCodigo());

                    } else {
                        System.out.println("Límite de incidencias alcanzado. No se pueden abrir más.");
                    }
                    break;
                case 2:
                    System.out.print("Inserte el código de la incidencia que desea resolver: ");
                    int codigo = t.nextInt();
                    t.nextLine(); 

                    boolean encontrada = false;
                    for (int j = 0; j < i; j++) {
                        if (incidencias[j] != null && incidencias[j].getCodigo() == codigo
                                && incidencias[j].getEstado().equals("pendiente")) {
                            System.out.print("Escribe la descripción de la resolución: ");
                            String descripcion = t.nextLine();
                            incidencias[j].Resuelta(descripcion);
                            System.out.println("Incidencia resuelta: " + incidencias[j]);
                            encontrada = true;
                        }
                    }

                    if (!encontrada) {
                        System.out.println("No se encontró una incidencia pendiente con el código especificado.");
                    }

                    break;
                case 3:
                    int pendientes = 0;
                    int resueltas = 0;
                    for (int j = 0; j < i; j++) {
                        if (incidencias[j] != null) {
                            if (incidencias[j].getEstado().equals("pendiente")) {
                                pendientes++;
                            } else if (incidencias[j].getEstado().equals("resuelta")) {
                                resueltas++;
                            }
                        }
                    }
                    System.out.println("\n--- Estadísticas de Incidencias ---");
                    System.out.println("Número total de incidencias abiertas: " + (i));
                    System.out.println("Número de incidencias pendientes: " + pendientes);
                    System.out.println("Número de incidencias resueltas: " + resueltas);
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

            }
            i++;
        } while (num != 4);
    }

}
