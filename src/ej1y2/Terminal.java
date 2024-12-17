/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1y2;

/**
 *
 * @author teres
 */
public class Terminal {
    private String numero;
    private int conversacion;

    public Terminal(String numero) {
        this.numero = numero;
        this.conversacion = 0;
    }
    
    public void llama(Terminal n, int i){
        this.conversacion += i;
        n.conversacion += i;
    }

    @Override
    public String toString() {
        return  "Nº " + numero + "- " +conversacion + "s de conversación" ;
    }
    
    
    
}
