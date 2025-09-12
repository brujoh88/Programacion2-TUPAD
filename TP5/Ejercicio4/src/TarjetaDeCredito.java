/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gtiseira
 */
public class TarjetaDeCredito {
	private String numero;
	private String fechaVencimiento;
	private Cliente titular;
	private Banco banco;

	public TarjetaDeCredito(String numero, String fechaVencimiento, Banco banco) {
		this.numero = numero;
		this.fechaVencimiento = fechaVencimiento;
		this.banco = banco;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Cliente getTitular() {
		return titular;
	}

	// Asociación bidireccional
	public void setTitular(Cliente titular) {
		this.titular = titular;
		if (titular != null && titular.getTarjeta() != this ) {
			titular.setTarjeta(this);
		}
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	@Override
	public String toString() {
		return "TarjetaDeCredito{" +
				"numero='" + numero + '\'' +
				", fechaVencimiento='" + fechaVencimiento + '\'' +
				", banco=" + (banco != null ? banco.getNombre() : "null") +
				", titular=" + (titular != null ? titular.getNombre() : "null") +
				'}';
	}
}
