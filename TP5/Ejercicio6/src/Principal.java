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

        // Crear una mesa
        Mesa mesa1 = new Mesa(1, 4);
        // Crear un cliente
        Cliente cliente1 = new Cliente("Andres Gonzalez", "123456789");
        // Crear una reserva
        Reserva reserva1 = new Reserva("2023-10-15", "20:00", mesa1);
        reserva1.setCliente(cliente1);  
        // Mostrar detalles de la reserva
        System.out.println(reserva1);                
    }
    
}
