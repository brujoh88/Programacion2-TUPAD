/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

/**
 *
 * @author gtiseira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mascota mascota = new Mascota();
        mascota.setNombre("Gumy");
        mascota.setEspecie("Perro");
        mascota.setEdad(3);

        System.out.println(mascota.getInformacionCompleta());

        mascota.cumplirAnios();
        System.out.println("Después de cumplir años:");
        System.out.println(mascota.getInformacionCompleta());
    }
    
}
