/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej8;

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
        int n = 0;

        Articulo[] almacen = new Articulo[10];
        int contador = 0;

        do {
            System.out.println("1. Listado");
            System.out.println("2. Alta");
            System.out.println("3. Baja");
            System.out.println("4. Modificaci�n");
            System.out.println("5. Entrada de mercanc�a");
            System.out.println("6. Salida de mercanc�a");
            System.out.println("7. Salir");

            n = t.nextInt();
            t.nextLine();

            switch (n) {
                case 1:
                    System.out.println("\n--- Listado de Art�culos ---");
                    if (contador == 0) {
                        System.out.println("El almac�n est� vac�o.");
                    } else {
                        for (int i = 0; i < contador; i++) {
                            System.out.println(almacen[i]);
                        }
                    }
                    break;

                case 2:
                    System.out.println("\n--- Alta de Art�culo ---");
                    if (contador < almacen.length) {
                        System.out.print("Introduce el c�digo: ");
                        int codigoAlta = t.nextInt();
                        t.nextLine();
                        boolean existe = false;
                        for (int i = 0; i < contador; i++) {
                            if (almacen[i].getCodigo() == codigoAlta) {
                                existe = true;
                                break;
                            }
                        }
                        if (existe) {
                            System.out.println("Ya existe un art�culo con ese c�digo.");
                        } else {
                            System.out.print("Descripci�n: ");
                            String descripcion = t.nextLine();
                            System.out.print("Precio de compra: ");
                            double precioCompra = t.nextDouble();
                            System.out.print("Precio de venta: ");
                            double precioVenta = t.nextDouble();
                            System.out.print("Stock inicial: ");
                            int stock = t.nextInt();

                            almacen[contador] = new Articulo(codigoAlta, descripcion, precioCompra, precioVenta, stock);
                            contador++;  
                            System.out.println("Art�culo a�adido correctamente.");
                        }
                    } else {
                        System.out.println("No hay espacio disponible");
                    }
                    break;

                case 3:
                    System.out.println("\n--- Baja de Art�culo ---");
                    System.out.print("Introduce el c�digo del art�culo a eliminar: ");
                    int codigoBaja = t.nextInt();
                    boolean eliminado = false;
                    for (int i = 0; i < contador; i++) {
                        if (almacen[i].getCodigo() == codigoBaja) {
                           
                            for (int j = i; j < contador - 1; j++) {
                                almacen[j] = almacen[j + 1];
                            }
                            almacen[contador - 1] = null; 
                            contador--;  
                            eliminado = true; 
                           
                        }
                    }

                    
                    if (eliminado) {
                        System.out.println("Art�culo eliminado correctamente.");
                    } else {
                        System.out.println("No se encontr� ning�n art�culo con ese c�digo.");
                    }
                    break;

                case 4:
                    System.out.println("\n--- Modificaci�n de Art�culo ---");
                    System.out.print("Introduce el c�digo del art�culo a modificar: ");
                    int codigoMod = t.nextInt();
                    t.nextLine();
                    boolean encontrado = false;
                    for (int i = 0; i < contador; i++) {
                        if (almacen[i].getCodigo() == codigoMod) {
                            encontrado = true;
                            System.out.print("Nueva descripci�n (deja en blanco para mantener): ");
                            String nuevaDescripcion = t.nextLine();
                            if (!nuevaDescripcion.isEmpty()) {
                                almacen[i].setDescripcion(nuevaDescripcion);
                            }
                            System.out.print("Nuevo precio de compra (deja 0 para mantener): ");
                            double nuevoPrecioCompra = t.nextDouble();
                            if (nuevoPrecioCompra > 0) {
                                almacen[i].setPrecioCompra(nuevoPrecioCompra);
                            }
                            System.out.print("Nuevo precio de venta (deja 0 para mantener): ");
                            double nuevoPrecioVenta = t.nextDouble();
                            if (nuevoPrecioVenta > 0) {
                                almacen[i].setPrecioVenta(nuevoPrecioVenta);
                            }
                            t.nextLine(); 
                            System.out.println("Art�culo modificado correctamente.");
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("No se encontr� ning�n art�culo con ese c�digo.");
                    }
                    break;

                case 5: 
                    System.out.println("\n--- Entrada de Mercanc�a ---");
                    System.out.print("Introduce el c�digo del art�culo: ");
                    int codigoEntrada = t.nextInt();
                    t.nextLine();
                    boolean entradaEncontrada = false;
                    for (int i = 0; i < contador; i++) {
                        if (almacen[i].getCodigo() == codigoEntrada) {
                            entradaEncontrada = true;
                            System.out.print("Cantidad a a�adir: ");
                            int cantidadEntrada = t.nextInt();
                            almacen[i].incrementarStock(cantidadEntrada);
                            System.out.println("Stock actualizado: " + almacen[i].getStock());
                            break;
                        }
                    }
                    if (!entradaEncontrada) {
                        System.out.println("No se encontr� ning�n art�culo con ese c�digo.");
                    }
                    break;

                case 6: 
                    System.out.println("\n--- Salida de Mercanc�a ---");
                    System.out.print("Introduce el c�digo del art�culo: ");
                    int codigoSalida = t.nextInt();
                    t.nextLine(); 
                    boolean salidaEncontrada = false;
                    for (int i = 0; i < contador; i++) {
                        if (almacen[i].getCodigo() == codigoSalida) {
                            salidaEncontrada = true;
                            System.out.print("Cantidad a sacar: ");
                            int cantidadSalida = t.nextInt();
                            almacen[i].decrementarStock(cantidadSalida);
                            break;
                        }
                    }
                    if (!salidaEncontrada) {
                        System.out.println("No se encontr� ning�n art�culo con ese c�digo.");
                    }
                    break;

                case 7: 
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opci�n no v�lida.");
                    break;
            }
        } while (n != 7);

    }

}
