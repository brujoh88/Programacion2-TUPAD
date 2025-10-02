/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kata4;

/**
 *
 * @author gtiseira
 */
public class Vaca extends Animal {
    public Vaca() {
        super("Vaca");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Muuu!");
    }
}