/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author gtiseira
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al programa de clasificación de etapas de vida.");
        // Solicitar al usuario que ingrese su edad
        System.out.print("Ingrese su edad: ");
        // Leer la edad ingresada por el usuario
        int edad = Integer.parseInt(scanner.nextLine());
        String etapaVida;
        // Clasificar la etapa de vida según la edad ingresada
        if (edad < 12) {
            etapaVida = "Niño";
        } else if (edad >= 12 && edad <= 17) {
            etapaVida = "Adolescente";
        } else if (edad >= 18 && edad <= 59) {
            etapaVida = "Adulto";
        } else {
            etapaVida = "Adulto mayor";
        }
        // Mostrar la etapa de vida al usuario
        System.out.println("Su etapa de vida es: " + etapaVida);        
    }
    
}
