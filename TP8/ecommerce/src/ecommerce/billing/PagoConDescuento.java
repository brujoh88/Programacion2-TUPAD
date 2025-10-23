/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.billing;


/**
 * Permite aplicar un descuento antes de procesar el pago.
 */
/**
 *
 * @author gtiseira
 */
public interface PagoConDescuento {
    /** Devuelve el monto con descuento aplicado. */
    double aplicarDescuento(double monto);
}