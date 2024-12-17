/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author teres
 */
public class Texto {
   private  String cadena;
   private int longitudMax;

   
    public Texto(int longitudMax) {
        this.cadena =  "";
        this.longitudMax = longitudMax;
        
    }
    
   
    public String AñadirCaracterinicio(String c){
        if (cadena.length() < longitudMax) {
            cadena= c + cadena;  
            
        } 
        return cadena;
    }
   public String AñadirCaracterfinal(String c){
        if (cadena.length() < longitudMax) {
            cadena= cadena + c;  
            
        } 
        return cadena;
    }
   public int contarVocales() {
        int count = 0;
        String vocales = "aeiouAEIOU";  
        for (int i = 0; i < cadena.length(); i++) {
            if (vocales.indexOf(cadena.charAt(i)) != -1) {
                count++;  
        }
            }
        return count;
    }

    @Override
    public String toString() {
        return "Texto: "  + cadena ;
    }
   
        
}
