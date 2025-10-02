/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kata5;

/**
 *
 * @author gtiseira
 */
public class TarjetaCredito implements Pagable {
    private String numeroTarjeta;
    
    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    @Override
    public void pagar(double monto) {
        System.out.println("Pagando $" + monto + " con tarjeta de crédito terminada en " + 
                           numeroTarjeta.substring(numeroTarjeta.length() - 4));
    }
}
