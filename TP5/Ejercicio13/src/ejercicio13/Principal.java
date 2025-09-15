/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author mflor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Usuario usuario = new Usuario("Gustavo", "test@test.com");
        GeneradorQR generadorQR = new GeneradorQR();
        generadorQR.generar("https://www.example.com", usuario);
    }
}
