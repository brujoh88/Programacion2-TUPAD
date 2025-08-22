/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author gtiseira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gallina gallina1 = new Gallina();
        gallina1.setInformacionCompleta(1,2 ,0 );
        System.out.println("Gallina 1");
        System.out.println(gallina1.getDescripcion());
        gallina1.ponerHuevo();
        gallina1.setEdad(3);
        gallina1.ponerHuevo();
        System.out.println(gallina1.getDescripcion());
        System.out.println("Gallina 2");
        Gallina gallina2 = new Gallina();
        gallina2.setInformacionCompleta(2, 1, 0);
        System.out.println(gallina2.getDescripcion());
        gallina2.ponerHuevo();
        gallina2.setEdad(0);
        gallina2.ponerHuevo();
        System.out.println(gallina2.getDescripcion());
        gallina2.setHuevosPuestos(-5); // Intento de establecer un valor
        gallina2.setEdad(-1); // Intento de establecer un valor inválido
        System.out.println("Gallina 2 después de intentos inválidos:");
        System.out.println(gallina2.getDescripcion());
    }
    
}
