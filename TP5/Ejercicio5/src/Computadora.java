/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gtiseira
 */
public class Computadora {
	private String marca;
	private String numeroSerie;
	private PlacaMadre placaMadre; // Composición
	private Propietario propietario; // Asociación bidireccional

	public Computadora(String marca, String numeroSerie, PlacaMadre placaMadre) {
		this.marca = marca;
		this.numeroSerie = numeroSerie;
		this.placaMadre = placaMadre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public PlacaMadre getPlacaMadre() {
		return placaMadre;
	}

	public void setPlacaMadre(PlacaMadre placaMadre) {
		this.placaMadre = placaMadre;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	// Asociación bidireccional
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
		if (propietario != null && propietario.getComputadora() != this) {
			propietario.setComputadora(this);
		}
	}

	@Override
	public String toString() {
		return "Computadora{" +
				"marca='" + marca + '\'' +
				", numeroSerie='" + numeroSerie + '\'' +
				", placaMadre=" + placaMadre +
				", propietario=" + (propietario != null ? propietario.getNombre() : "null") +
				'}';
	}
}
