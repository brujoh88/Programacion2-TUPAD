/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gtiseira
 */
public class Propietario {
	private String nombre;
	private String dni;
	private Computadora computadora; // Asociación bidireccional

	public Propietario(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
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

	public Computadora getComputadora() {
		return computadora;
	}

	// Asociación bidireccional
	public void setComputadora(Computadora computadora) {
		this.computadora = computadora;
		if (computadora != null && computadora.getPropietario() != this) {
			computadora.setPropietario(this);
		}
	}

	@Override
	public String toString() {
		return "Propietario{" +
				"nombre='" + nombre + '\'' +
				", dni='" + dni + '\'' +
				", computadora=" + (computadora != null ? computadora.getMarca() : "null") +
				'}';
	}
}
