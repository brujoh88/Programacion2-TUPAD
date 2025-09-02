/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleado;

/**
 *
 * @author gtiseira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado emp1 = new Empleado(1, "Juan Perez", "Desarrollador", 50000);
        Empleado emp2 = new Empleado("Ana Gomez", "Diseñadora");
        Empleado emp3 = new Empleado("Luis Martinez", "Analista");
        Empleado emp4 = new Empleado(4, "Marta Sanchez", "Gerente", 80000);
        System.out.println(emp1);
        System.out.println(emp2);
        System.out.println(emp3);
        System.out.println(emp4);
        System.out.println();
        System.out.println("Actualizando salario de " + emp1);
        emp1.actualizarSalario(15); // Aumento del 15%
        System.out.println("Nuevo salario: " + emp1);
        System.out.println("Actualizando salario de " + emp2);
        emp2.actualizarSalario(10); // Aumento del 10%
        System.out.println("Nuevo salario: " + emp2);        
        System.out.println("Actualizando salario de " + emp3);
        emp3.actualizarSalario(5000, true); // Aumento fijo de
        System.out.println("Nuevo salario: " + emp3);        
        System.out.println("Actualizando salario de " + emp4);
        emp4.actualizarSalario(5); // Aumento del 5%
        System.out.println("Nuevo salario: " + emp4);
        System.out.println();
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
    
}
