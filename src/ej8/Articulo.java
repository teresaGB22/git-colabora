/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej8;

/**
 *
 * @author teres
 */
public class Articulo {
    private int codigo;
    private String descripcion;
    private double precioCompra;
    private double precioVenta;
    private int stock;
    
    public Articulo(int codigo, String descripcion, double precioCompra, double precioVenta, int stock){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stock = stock;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public void incrementarStock(int n){
        this.stock += n;
    }
    public void decrementarStock(int n){
        if(n <= this.stock){
            this.stock-= n;
        }else{
            System.out.println("No se pudo decrementar el Stock");  
        }
    }

    @Override
    public String toString() {
        return "Articulo: " + "codigo=" + codigo + ", descripcion=" + descripcion + ", precioCompra=" + precioCompra + ", precioVenta=" + precioVenta + ", stock=" + stock ;
    }
    
}
