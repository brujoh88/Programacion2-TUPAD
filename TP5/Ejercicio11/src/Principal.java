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
        // Crear artistas
        Artista artista1 = new Artista("The Beatles", "Rock");
        Artista artista2 = new Artista("Adele", "Pop");

        // Crear canciones y asignarles artistas
        Cancion cancion1 = new Cancion("Hey Jude");
        cancion1.setArtista(artista1);

        Cancion cancion2 = new Cancion("Rolling in the Deep");
        cancion2.setArtista(artista2);

        // Crear reproductor
        Reproductor reproductor = new Reproductor();

        // Reproducir canciones
        reproductor.reproducir(cancion1);
        reproductor.reproducir(cancion2);
    }
    
}
