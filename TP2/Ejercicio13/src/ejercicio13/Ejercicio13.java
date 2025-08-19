/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

/** 
 * @author gtiseira
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        
        // a. Declare e inicialice un array con los precios de algunos productos.
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        
        // b. Use una función recursiva para mostrar los precios originales.
        System.out.println("Precios originales:");
        mostrarPreciosOriginalesRecursivo(precios, 0);
        
        // c. Modifique el precio de un producto específico.
        int indiceProducto = 2; // Tercer producto (índice 2)
        precios[indiceProducto] = 129.99; // Modificando el precio de $149.75 a $129.99
        
        // d. Use otra función recursiva para mostrar los valores modificados.
        System.out.println("Precios modificados:");
        mostrarPreciosModificadosRecursivo(precios, 0);
    }
    
    public static void mostrarPreciosOriginalesRecursivo(double[] precios, int indice) {
        // Caso base: si el índice es mayor o igual a la longitud del array, terminar
        if (indice >= precios.length) {
            return;
        }
        
        // Mostrar el precio actual con formato específico
        System.out.printf("Precio: $%.1f%n", precios[indice]);
        
        // Llamada recursiva con el siguiente índice
        mostrarPreciosOriginalesRecursivo(precios, indice + 1);
    }
    
    public static void mostrarPreciosModificadosRecursivo(double[] precios, int indice) {
        // Caso base: si el índice es mayor o igual a la longitud del array, terminar
        if (indice >= precios.length) {
            return;
        }
        
        // Mostrar el precio actual con formato específico
        System.out.printf("Precio: $%.2f%n", precios[indice]);
        
        // Llamada recursiva con el siguiente índice
        mostrarPreciosModificadosRecursivo(precios, indice + 1);
    }
}