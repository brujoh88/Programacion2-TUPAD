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
        // Crear un motor
        Motor motor = new Motor("V8", "12345XYZ");

        // Crear un vehículo con el motor
        Vehiculo vehiculo = new Vehiculo("ABC123", "Toyota", motor);

        // Crear un conductor
        Conductor conductor = new Conductor("Juan Perez", "LIC123456");

        // Asociar el conductor con el vehículo (asociación bidireccional)
        vehiculo.setConductor(conductor);

        // Mostrar información
        System.out.println(vehiculo);
        System.out.println(vehiculo.getMotor());
        System.out.println(vehiculo.getConductor());
        System.out.println(conductor.getVehiculo());        
    }
    
}
