/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gtiseira
 */
public class CuentaBancaria {
	private String cbu;
	private double saldo;
	private ClaveSeguridad clave; // Composición
	private Titular titular; // Asociación bidireccional

	// Ahora el constructor solo recibe los datos de la clave, no el objeto
	public CuentaBancaria(String cbu, double saldo, String codigoClave, String ultimaModificacion) {
		this.cbu = cbu;
		this.saldo = saldo;
		this.clave = new ClaveSeguridad(codigoClave, ultimaModificacion);
	}

	public String getCbu() {
		return cbu;
	}

	public void setCbu(String cbu) {
		this.cbu = cbu;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public ClaveSeguridad getClave() {
		return clave;
	}

	public Titular getTitular() {
		return titular;
	}

	// Asociación bidireccional
	public void setTitular(Titular titular) {
		this.titular = titular;
		if (titular != null && titular.getCuenta() != this) {
			titular.setCuenta(this);
		}
	}

	@Override
	public String toString() {
		return "CuentaBancaria{" +
				"cbu='" + cbu + '\'' +
				", saldo=" + saldo +
				", clave=" + clave +
				", titular=" + (titular != null ? titular.getNombre() : null) +
				'}';
	}
}
