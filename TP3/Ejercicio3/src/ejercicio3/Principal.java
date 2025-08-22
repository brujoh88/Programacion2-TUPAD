/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author gtiseira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro = new Libro();
        libro.setTitulo("Cien Años de Soledad");
        libro.setAutor("Gabriel García Márquez");
        libro.setAnioPublicacion(1967);        
        System.out.println(libro.getDescripcion());
        libro.setAnioPublicacion(-5); // Prueba de validación
        System.out.println(libro.getDescripcion());
    }    
}
