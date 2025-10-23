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
public class TarjetaCredito implements Pago, PagoConDescuento {
    private final String numero;
    private final String titular;


    public TarjetaCredito(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }


    @Override
    public double aplicarDescuento(double monto) {
// Ejemplo: 10% de descuento para compras >= 20.000
        if (monto >= 20_000) return monto * 0.90;
        return monto;
    }


    @Override
    public void procesarPago(double monto) {
// Ejemplo: recargo de 3% por uso de tarjeta
        double totalConRecargo = monto * 1.03;
        // Mostrar número de tarjeta enmascarado (últimos 4 dígitos)
        String ultimos4 = (numero != null && numero.length() > 4)
                ? numero.substring(numero.length() - 4)
                : numero;
        String enmascarado = (ultimos4 != null) ? "**** **** **** " + ultimos4 : "****";
        System.out.println("Pago con Tarjeta de " + titular + " (" + enmascarado + ") por $" + String.format("%.2f", totalConRecargo));
    }
}