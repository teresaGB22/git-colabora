/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej6;

import static ej6.TarjetaRegalo.fusionar;

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
        TarjetaRegalo n1 = new TarjetaRegalo(50);
        TarjetaRegalo n2 = new TarjetaRegalo(10);
        
        System.out.println(n1);
        System.out.println(n2);
        n1.gastar(20);
        System.out.println(n1);
        System.out.println(fusionar(n1,n2));
    }

    
    
}
