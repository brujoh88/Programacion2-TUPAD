/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author gtiseira
 */
public class Celular {
    private String imei;
    private String marca;
    private String modelo;
    private Usuario usuario; // bi-direccional 1 a 1
    private Bateria bateria; // asignacion uni-direccional 1 a 1
    //constructor
    public Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei;
        this.marca = marca;
        this.modelo = modelo;
        this.bateria = bateria;
    }
    
    public void asignarUsuario(Usuario usuario){        
        this.usuario = usuario;        
        if(usuario != null && usuario.getCelular() != this){
            usuario.asignarCelular(this);            
        }
    }    

    public void asignarBateria(Bateria bateria){
        this.bateria = bateria;
    }

    public void mostrarBateria(){
        if(bateria != null){
            System.out.println(bateria);
        } else {
            System.out.println("No tiene bateria asignada");
        }
    }

    //getters y setters

    public Usuario getUsuario() {
        return usuario;
    }
    
    public String getImei() {
        return imei;
    }
    public void setImei(String imei) {
        this.imei = imei;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }    

    @Override
    public String toString() {
        return "Celular{" + "imei=" + imei + ", marca=" + marca + ", modelo=" + modelo + '}';
    }
}
