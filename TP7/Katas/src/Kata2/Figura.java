/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kata2;

/**
 *
 * @author gtiseira
 */
public abstract class Figura {
    private String nombre;
    
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    
    public abstract double calcularArea();
    
    public void mostrarInfo() {
        System.out.println(nombre + " - Área: " + calcularArea());
    }
}
