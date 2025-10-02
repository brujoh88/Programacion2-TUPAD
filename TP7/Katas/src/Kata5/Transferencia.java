/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Kata5;

/**
 *
 * @author gtiseira
 */
public class Transferencia implements Pagable {
    private String cbu;
    
    public Transferencia(String cbu) {
        this.cbu = cbu;
    }
    
    @Override
    public void pagar(double monto) {
        System.out.println("Transfiriendo $" + monto + " a CBU: " + cbu);
    }
}
