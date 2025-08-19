/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;


/**
 *
 * @author gtiseira
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Variable global para el descuento especial
        final double DESCUENTO_ESPECIAL = 0.10;
        
        // Solicitar al usuario el precio del producto
        System.out.print("Ingrese el precio del producto: ");
        double precio = scanner.nextDouble();
        
        // Calcular y mostrar el descuento especial
        calcularDescuentoEspecial(precio, DESCUENTO_ESPECIAL);        
    }

    public static void calcularDescuentoEspecial(double precio, double descuentoEspecial) {
        // Calcular el descuento aplicado
        double descuentoAplicado = precio * descuentoEspecial;
        
        // Calcular el precio final con descuento
        double precioFinal = precio - descuentoAplicado;
        
        // Mostrar los resultados
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }
    
}