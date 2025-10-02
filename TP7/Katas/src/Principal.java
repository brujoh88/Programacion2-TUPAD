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

import java.util.ArrayList;

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
        Circulo circulo1 = new Circulo(5);
        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        Circulo circulo2 = new Circulo(3);
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(circulo1);
        figuras.add(rectangulo1);
        figuras.add(circulo2);
        
        for (Figura figura : figuras) {
            figura.mostrarInfo();
        }

        System.out.println("\n=== KATA 3: EMPLEADOS Y POLIMORFISMO ===\n");
        EmpleadoPlanta empPlanta1 = new EmpleadoPlanta("Juan Pérez", 50000);
        EmpleadoTemporal empTemp1 = new EmpleadoTemporal("María García", 150, 120);
        EmpleadoPlanta empPlanta2 = new EmpleadoPlanta("Carlos López", 60000);
        EmpleadoTemporal empTemp2 = new EmpleadoTemporal("Ana Martínez", 200, 80);
        ArrayList<Empleado> empleados = new ArrayList<>();
        empleados.add(empPlanta1);
        empleados.add(empTemp1);
        empleados.add(empPlanta2);
        empleados.add(empTemp2);
        
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
        Perro perro1 = new Perro();
        Gato gato1 = new Gato();
        Vaca vaca1 = new Vaca();
        Perro perro2 = new Perro();
        ArrayList<Animal> animales = new ArrayList<>();
        animales.add(perro1);
        animales.add(gato1);
        animales.add(vaca1);
        animales.add(perro2);
        
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println();
        }
        System.out.println("=== KATA 5: SISTEMA DE PAGOS ===\n");
        TarjetaCredito tarjeta1 = new TarjetaCredito("4532-1234-5678-9012");
        Transferencia transferencia1 = new Transferencia("0123456789012345678901");
        Efectivo efectivo1 = new Efectivo();
        ArrayList<Pagable> mediosPago = new ArrayList<>();
        mediosPago.add(tarjeta1);
        mediosPago.add(transferencia1);
        mediosPago.add(efectivo1);
        
        double monto1 = 1500.50;
        double monto2 = 3200.00;
        double monto3 = 850.75;
        ArrayList<Double> montos = new ArrayList<>();
        montos.add(monto1);
        montos.add(monto2);
        montos.add(monto3);
        
        for (int i = 0; i < mediosPago.size(); i++) {
            procesarPago(mediosPago.get(i), montos.get(i));
        }
        
        System.out.println("=== FIN DEL TRABAJO PRÁCTICO ===");
    }
    public static void procesarPago(Pagable medio, double monto) {
        System.out.println("Procesando pago...");
        medio.pagar(monto);
        System.out.println("Pago procesado exitosamente.\n");
    }
    
}
