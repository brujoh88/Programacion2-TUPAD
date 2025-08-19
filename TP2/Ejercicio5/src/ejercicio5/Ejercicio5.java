/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author gtiseira
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        int numero;
        int sumaPares = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número (0 para terminar): ");
        numero = Integer.parseInt(scanner.nextLine());
        while (numero != 0) {
            if (numero % 2 == 0) {
                sumaPares += numero;
            }
            System.out.print("Ingrese un número (0 para terminar): ");
            numero = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("La suma de los números pares es: " + sumaPares);
    }
}
