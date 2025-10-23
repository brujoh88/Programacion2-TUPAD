/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.payment;

import ecommerce.billing.Pago;  
import ecommerce.billing.PagoConDescuento;

/**
 *
 * @author gtiseira
 */
public class PayPal implements Pago, PagoConDescuento {
    private final String cuenta;


    public PayPal(String cuenta) { this.cuenta = cuenta; }


    @Override
    public double aplicarDescuento(double monto) {
// Ejemplo: 5% de descuento general
        return monto * 0.95;
    }


    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal (" + cuenta + ") por $" + String.format("%.2f", monto));
    }
}