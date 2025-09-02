/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author gtiseira
 */
public class Empleado {
    private int id;
    // Se agrego este atributo para manejar IDs únicos
    private static java.util.HashSet<Integer> idsUsados = new java.util.HashSet<>();
    private String nombre;
    private String puesto;
    private double salario;
    static int totalEmpleados = 0;

    public Empleado(int id, String nombre, String puesto, double salario) {
        setId(id);
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto ) {
        int nuevoId = idsUsados.isEmpty() ? 1 : java.util.Collections.max(idsUsados) + 1;
        setId(nuevoId);
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000; // Salario por defecto
        totalEmpleados++;
    }
    public void setId(int id) {
        if (idsUsados.contains(id)) {
            throw new IllegalArgumentException("El id " + id + " ya está en uso");
        }
        idsUsados.add(id);
        this.id = id;
    }

    public double actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            salario += salario * (porcentajeAumento / 100);
        }
        return salario;
    }
    
    public double actualizarSalario(double montoFijo, boolean esMontoFijo) {
        if (esMontoFijo && montoFijo > 0) {
            salario += montoFijo;
        }
        return salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + '}';
    }

    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
}
