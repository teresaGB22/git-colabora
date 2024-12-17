/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej5;

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
       Ameba a1 = new Ameba();
       Ameba a2 = new Ameba();
       
       a1.comer(2);
        System.out.println(a1);
        a1.comer(1);
        System.out.println(a1);
        a1.comer(a2);
        System.out.println(a1);
        
    }
    
}
