/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej5;

/**
 *
 * @author teres
 */
public class Ameba {
    private int peso;
    
    public Ameba(){
        this.peso = 3;
    }

    public int getPeso() {
        return peso;
    }
    
    public void comer(int n){
        if(this.peso > 0){
             this.peso+= n-1;
        }
       
        
    }
    public void comer(Ameba otra){
        if(otra != null && otra.peso >0){
            this.peso += otra.peso -1;
            otra.peso = 0;
        }
    }

    @Override
    public String toString() {
        return  "peso: " + peso + " microgramos";
    }
    
    
}
