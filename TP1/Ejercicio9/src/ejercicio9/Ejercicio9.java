/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

import java.util.Scanner;

/**
 *
 * @author gtiseira
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombre: ");
        //String nombre = scanner.nextInt(); // ERROR
        // ERROR ORIGINAL:
        // String nombre = scanner.nextInt();
        // Motivo: nextInt() devuelve un entero (int) y no un String,
        // por lo que no se puede asignar directamente a una variable de tipo String.

        // SOLUCIÓN:
        // Usar nextLine() para leer texto completo (tipo String).
        String nombre = scanner.nextLine();
        System.out.println("Hola, " + nombre);
    }
    
}
