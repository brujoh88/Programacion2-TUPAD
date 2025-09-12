/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gtiseira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco("Banco Central", "30-12345678-9");
        Cliente cliente = new Cliente("Juan Perez", "12345678");
        TarjetaDeCredito tarjeta = new TarjetaDeCredito("1234-5678-9012-3456", "12/25", banco);   
        cliente.setTarjeta(tarjeta);
        System.out.println(cliente);
        System.out.println(tarjeta);
        System.out.println(banco);          
    }
    
}
