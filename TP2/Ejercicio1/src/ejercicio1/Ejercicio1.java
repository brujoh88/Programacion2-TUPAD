/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;

import java.util.Scanner;

/**
 *
 * @author gtiseira
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Solicitar al usuario un año y determinar si es bisiesto
        System.out.println("Bienvenido al programa de verificación de años bisiestos.");
        // Utilizar Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        // Pedir al usuario que ingrese un año        
        System.out.print("Ingrese un año: ");
        // Leer el año ingresado por el usuario        
        int anio = Integer.parseInt(scanner.nextLine());
        // Verificar si el año es negativo
        if (anio < 0) {
            System.out.println("El año no puede ser negativo. Por favor, ingrese un año válido.");
            return; // Terminar el programa si el año es negativo
        }
        // Determinar si el año es bisiesto
        boolean esBisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);        
        if (esBisiesto) {
            System.out.println(anio + " es un año bisiesto.");
        } else {
            System.out.println(anio + " no es un año bisiesto.");
        }
    }        
}
