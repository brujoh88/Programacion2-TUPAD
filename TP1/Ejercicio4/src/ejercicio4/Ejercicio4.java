/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author gtiseira
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = Integer.parseInt(input.nextLine());
        System.out.println("Usted ingreso: " + edad);
    }    
}
