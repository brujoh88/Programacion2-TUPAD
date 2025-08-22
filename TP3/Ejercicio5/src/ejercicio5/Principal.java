/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

/**
 *
 * @author gtiseira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        NaveEspacial nave1 = new NaveEspacial();
        nave1.setInformacionCompleta("Pandora", 500);
        nave1.mostrarEstado();
        
        nave1.despegar();
        nave1.mostrarEstado();
        
        nave1.avanzar(200);
        nave1.mostrarEstado();
        
        nave1.recargarCombustible(300);
        nave1.mostrarEstado();
        
        nave1.avanzar(13556); // Intento de avanzar más allá del combustible disponible
        nave1.mostrarEstado();
        
        nave1.recargarCombustible(6000); // Intento de recargar más allá del límite
        nave1.mostrarEstado();
    }
    
}
