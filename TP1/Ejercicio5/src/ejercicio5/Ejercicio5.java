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
        double num1, num2, suma, resta, mult, div;
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = Double.parseDouble(input.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        num2 = Double.parseDouble(input.nextLine());        
        suma = num1 + num2;
        resta = num2 - num1;
        mult = num1 * num2;
        if (num2 != 0) {
            div = num1 / num2;
        }else{
            System.out.println("NO PUEDE DIVIRSE POR CERO");
            div = 0;
        }
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("mult: " + mult);
        System.out.println("Division: " + div);

    }
    
}
