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
        // Crear un titular
        Titular titular = new Titular("Daniel Tomassi", "12345678A");
        
        // Crear un pasaporte con foto
        Pasaporte pasaporte = new Pasaporte("A1234567", "2023-10-01", "foto1.jpg", "jpg");
        
        // Asociar el titular con el pasaporte (gestiona la bidireccionalidad)
        titular.setPasaporte(pasaporte);
        
        // o bien
        //pasaporte.setTitular(titular);
        
        // Mostrar información
        System.out.println(titular);
        System.out.println(titular.getPasaporte());
        System.out.println("Foto del pasaporte:");
        pasaporte.getmostrarFoto();        
    }
    
}
