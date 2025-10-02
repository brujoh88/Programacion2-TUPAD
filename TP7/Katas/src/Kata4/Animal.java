/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kata4;

/**
 *
 * @author gtiseira
 */
public class Animal {
    private String especie;
    
    public Animal(String especie) {
        this.especie = especie;
    }
    
    public void hacerSonido() {
        System.out.println("El animal hace un sonido");
    }
    
    public void describirAnimal() {
        System.out.println("Soy un " + especie);
    }
}