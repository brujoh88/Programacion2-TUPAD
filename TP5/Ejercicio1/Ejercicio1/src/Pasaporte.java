/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gtiseira
 */
public class Pasaporte {
    private String numero;    
    private String fechaEmision;    
    private Titular titular; // Asociación bidireccional
    private Foto foto; // Composición


    public Pasaporte(String numero, String fechaEmision, String foto, String formato) {
        this.numero = numero;        
        this.fechaEmision = fechaEmision;        
        this.foto = new Foto(foto, formato); // La foto se crea junto con el pasaporte
    }
    
    // Método para gestionar la asociación bidireccional
    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }    
    
    // Getters y Setters
    public Titular getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

     
    public void getmostrarFoto(){
        System.out.println(foto.getImagen());
    }
    
    @Override
    public String toString() {
        return "Pasaporte{"
        + "numero=" + numero 
        + ", fechaEmision=" + fechaEmision 
        + ", titular=" + titular 
        + ", foto=" + foto
        + '}'; 
    }
}
