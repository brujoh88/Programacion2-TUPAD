/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author mflor
 */
public class GeneradorQR {
	public void generar(String valor, Usuario usuario) {
		CodigoQR codigoQR = new CodigoQR(valor);
        codigoQR.setUsuario(usuario);
        System.out.println("Generando código QR para el valor: " + valor);
        System.out.println("Asociado al usuario: " + usuario);
        System.out.println("Código QR generado: " + codigoQR);
	}
}
