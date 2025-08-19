/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package ejercicio12;

/** 
 * @author gtiseira
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
               
        // ✔ Uso de arrays (double[]) para almacenar valores
        double[] precios = {199.99, 299.50, 149.75, 399.00, 89.99};
        
        // ✔ Recorrido del array con for-each para mostrar valores
        System.out.println("Precios originales:");
        mostrarPreciosForEach(precios);
        
        // ✔ Modificación de un valor en un array mediante un índice
        int indiceProducto = 2; // Tercer producto (índice 2)
        System.out.printf("%nModificando precio en índice %d...%n", indiceProducto);
        System.out.printf("Precio anterior: $%.2f%n", precios[indiceProducto]);
        precios[indiceProducto] = 129.99; // Modificando el precio
        System.out.printf("Precio nuevo: $%.2f%n", precios[indiceProducto]);
        
        // ✔ Reimpresión del array después de la modificación
        System.out.println("\nPrecios modificados:");
        mostrarPreciosForEach(precios);
    }        
 
    public static void mostrarPreciosForEach(double[] precios) {
        for (double precio : precios) {
            System.out.printf("Precio: $%.2f%n", precio);
        }
    }
}