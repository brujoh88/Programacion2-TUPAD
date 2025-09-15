/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio13;

/**
 *
 * @author mflor
 */
public class CodigoQR {
	private String valor;
	private Usuario usuario; // Asociación unidireccional a Usuario

	public CodigoQR(String valor) {
		this.valor = valor;
		}

	public String getValor() {
		return valor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

    public Usuario setUsuario(Usuario usuario) {
        this.usuario = usuario;
        return usuario;
    }


	@Override
	public String toString() {
		return "CodigoQR{" +
				"valor='" + valor + '\'' +
				", usuario=" + usuario +
				'}';
	}
}
