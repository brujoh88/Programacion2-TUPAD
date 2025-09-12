/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gtiseira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear un autor
        Autor autor = new Autor("Gabriel García Márquez", "Colombiana");
        
        // Crear una editorial
        Editorial editorial = new Editorial("Editorial Sudamericana", "Buenos Aires, Argentina");
        
        // Crear un libro asociado al autor y a la editorial
        Libro libro = new Libro("Cien Años de Soledad", "978-3-16-148410-0", editorial);
        libro.setAutor(autor);
        // Mostrar información del libro
        System.out.println(libro);
    }
    
}
