/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gtiseira
 */

public class Cliente {
	private String nombre;
	private String dni;
	private TarjetaDeCredito tarjeta;

	public Cliente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.tarjeta = null;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public TarjetaDeCredito getTarjeta() {
		return tarjeta;
	}

	// Asociación bidireccional
	public void setTarjeta(TarjetaDeCredito tarjeta) {
		this.tarjeta = tarjeta;
		if (tarjeta != null && tarjeta.getTitular() != this) {
			tarjeta.setTitular(this);
		}
	}

	@Override
	public String toString() {
		return "Cliente{" +
				"nombre='" + nombre + '\'' +
				", dni='" + dni + '\'' +
				", tarjeta=" + (tarjeta != null ? tarjeta.getNumero() : "null") +
				'}';
	}
}
