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
        // Crear una placa madre
        PlacaMadre placaMadre = new PlacaMadre("ASUS ROG STRIX", "Z490");

        // Crear una computadora con la placa madre
        Computadora computadora = new Computadora("Dell", "12345XYZ", placaMadre);

        // Crear un propietario
        Propietario propietario = new Propietario("Juan Perez", "98765432");

        // Asociar el propietario con la computadora (asociación bidireccional)
        computadora.setPropietario(propietario);

        // Mostrar la información
        System.out.println(computadora);
        System.out.println(propietario);
    }
    
}
