/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

import kata1.Auto;
import Kata2.Circulo;
import Kata2.Rectangulo;
import Kata2.Figura;
import Kata3.EmpleadoPlanta;
import Kata3.EmpleadoTemporal;
import Kata3.Empleado;
import Kata4.Animal;
import Kata4.Gato;
import Kata4.Perro;
import Kata4.Vaca;
import Kata5.Efectivo;
import Kata5.Pagable;
import Kata5.TarjetaCredito;
import Kata5.Transferencia;

/**
 *
 * @author gtiseira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("=== KATA 1: VEHÍCULOS Y HERENCIA BÁSICA ===\n");
        Auto miAuto = new Auto("Toyota", "Corolla", 4);
        miAuto.mostrarInfo();

        System.out.println("\n=== KATA 2: FIGURAS GEOMÉTRICAS ===\n");
        Figura[] figuras = {
            new Circulo(5),
            new Rectangulo(4, 6),
            new Circulo(3)
        };
        
        for (Figura figura : figuras) {
            figura.mostrarInfo();
        }

        System.out.println("\n=== KATA 3: EMPLEADOS Y POLIMORFISMO ===\n");
        Empleado[] empleados = {
            new EmpleadoPlanta("Juan Pérez", 50000),
            new EmpleadoTemporal("María García", 150, 120),
            new EmpleadoPlanta("Carlos López", 60000),
            new EmpleadoTemporal("Ana Martínez", 200, 80)
        };
        
        for (Empleado emp : empleados) {
            System.out.println(emp.getNombre() + " - Sueldo: $" + emp.calcularSueldo());
            
            // Uso de instanceof para clasificar
            if (emp instanceof EmpleadoPlanta) {
                System.out.println("  Tipo: Empleado de Planta");
            } else if (emp instanceof EmpleadoTemporal) {
                System.out.println("  Tipo: Empleado Temporal");
            }
        }

        System.out.println("\n=== KATA 4: ANIMALES Y COMPORTAMIENTO SOBRESCRITO ===\n");
        Animal[] animales = {
            new Perro(),
            new Gato(),
            new Vaca(),
            new Perro()
        };
        
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println();
        }
        System.out.println("=== KATA 5: SISTEMA DE PAGOS ===\n");
        Pagable[] mediosPago = {
            new TarjetaCredito("4532-1234-5678-9012"),
            new Transferencia("0123456789012345678901"),
            new Efectivo()
        };
        
        double[] montos = {1500.50, 3200.00, 850.75};
        
        for (int i = 0; i < mediosPago.length; i++) {
            procesarPago(mediosPago[i], montos[i]);
        }
        
        System.out.println("=== FIN DEL TRABAJO PRÁCTICO ===");
    }
    public static void procesarPago(Pagable medio, double monto) {
        System.out.println("Procesando pago...");
        medio.pagar(monto);
        System.out.println("Pago procesado exitosamente.\n");
    }
    
}
