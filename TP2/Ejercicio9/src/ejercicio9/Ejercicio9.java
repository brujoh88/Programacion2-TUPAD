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
        // Ejercicio 9: Cálculo de costo de envío y total de compra
        Scanner scanner = new Scanner(System.in);
                System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(scanner.nextLine());
        
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.nextLine();
        
        double costoEnvio = calcularCostoEnvio(peso, zona);
        double totalCompra = calcularTotalCompra(precioProducto, costoEnvio);
        
        System.out.printf("El costo de envío es: %.2f%n", costoEnvio);
        System.out.printf("El total a pagar es: %.2f%n", totalCompra);
    }
    
    // Método para calcular el costo de envío
    static double calcularCostoEnvio(double peso, String zona) {
        double costoPorKg = zona.equalsIgnoreCase("Nacional") ? 5.0 : 10.0;
        return peso * costoPorKg;
    }
    // Método para calcular el total de la compra
    static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }
}
