/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author gtiseira
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        // Declaración de variables para almacenar los tres números
        int numero1, numero2, numero3;
        // Lectura de los números (en este caso, se asignan valores directamente)
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        numero1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el segundo número: ");
        numero2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el tercer número: ");
        numero3 = Integer.parseInt(scanner.nextLine());
        // Variable para almacenar el mayor número
        int mayor;
        // Lógica para determinar el mayor de los tres números
        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1; // Si numero1 es mayor o igual a los otros dos,
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2; // Si numero2 es mayor o igual a los otros dos,
        } else {
            mayor = numero3; // Si numero3 es el mayor
        }
        System.out.println("El mayor de los tres números es: " + mayor);
    }
    
}
