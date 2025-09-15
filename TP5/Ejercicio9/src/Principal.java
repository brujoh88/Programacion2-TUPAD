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
        // Crear instancias de Paciente y Profesional
        Paciente paciente = new Paciente("Juan Perez", "OSDE");
        Profesional profesional = new Profesional("Dra. Maria Gomez", "Cardiologia");

        // Crear una instancia de CitaMedica
        CitaMedica cita = new CitaMedica("2024-10-15", "10:30", paciente, profesional);

        // Mostrar los detalles de la cita medica
        System.out.println(cita);        
    }
    
}
