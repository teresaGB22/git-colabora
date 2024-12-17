/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej9;

/**
 *
 * @author teres
 */
public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
     private static final int RESULTADO_BAJO_PESO = -1;
    private static final int RESULTADO_PESO_IDEAL = 0;
    private static final int RESULTADO_SOBREPESO = 1;
    public Persona(){
        this.nombre = "";
        this.edad=0;
        this.sexo='H';
        this.peso=0;
        this.altura=0;
    }
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String dni, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public int calcularIMC(){
        double imc = peso /(altura*altura);
        if (imc < 20) {
            return RESULTADO_BAJO_PESO;
        } else if (imc >= 20 && imc <= 25) {
           return RESULTADO_PESO_IDEAL;
        } else {
            return RESULTADO_SOBREPESO;
        }
    }
    public boolean esMayorDeEdad(){
        if(edad >= 18){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
    
    public String generaDNI(){
        
        long numAleatorio = (long) (Math.random() * 100000000);
        String dniGenerado =String.valueOf(numAleatorio);
         return dniGenerado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}
