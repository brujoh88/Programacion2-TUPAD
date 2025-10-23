/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.billing;

/**
 *
 * @author gtiseira
 */
public interface Pago {
    /** Procesa el pago del monto (ya con descuentos/tasas aplicadas). */
    void procesarPago(double monto);
}