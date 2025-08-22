/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1;

/**
 *
 * @author gtiseira
 */
public class Principal {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();
        estudiante.setInformacionCompleta("Gustavo", "Tiseira", "A", 0);
        System.out.println(estudiante.getInformacionCompleta());
        estudiante.subirCalificacion(7.8);
        System.out.println("Después de subir la calificación:");
        System.out.println(estudiante.getInformacionCompleta());
        estudiante.bajarCalificacion(2.3);
        System.out.println("Después de bajar la calificación:");
        System.out.println(estudiante.getInformacionCompleta());
        estudiante.bajarCalificacion(10.0); // Intento de bajar más allá de 0
        System.out.println("Después de intentar bajar la calificación más allá de 0:");
        System.out.println(estudiante.getInformacionCompleta());
        estudiante.subirCalificacion(15.0); // Intento de subir más allá de 10
        System.out.println("Después de intentar subir la calificación más allá de 10:");
        System.out.println(estudiante.getInformacionCompleta());
        estudiante.subirCalificacion(4.5); // Subir dentro del rango
        System.out.println("Después de subir la calificación dentro del rango:");
        System.out.println(estudiante.getInformacionCompleta());
    }
    
}
