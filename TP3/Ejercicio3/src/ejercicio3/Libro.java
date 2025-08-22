/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3;

/**
 *
 * @author gtiseira
 */
public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getAnioPublicacion() {
        return anioPublicacion;
    }
    public void setAnioPublicacion(int anioPublicacion) {                
        if (anioPublicacion > 0) {
            this.anioPublicacion = anioPublicacion;
        } else {
            System.out.println("Año de publicación inválido. Debe ser un año positivo.");
        }
    }

    public String getDescripcion() {
        return "Título: " + getTitulo() + ", Autor: " + getAutor() + ", Año de Publicación: " + getAnioPublicacion();
    }
}
