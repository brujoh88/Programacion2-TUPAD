/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author gtiseira
 */
public class Usuario {    
    private String nombre;
    private String dni;
    private Celular celular; // bi-direccional 1 a 1    

    //constructor
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public void asignarCelular(Celular celular){
        this.celular = celular;        
        if(celular!= null && celular.getUsuario() != this){            
            celular.asignarUsuario(this);
        }
    }    
     
    //getters y setters

    public Celular getCelular() {
        return celular;
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

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", dni=" + dni + ", celular=" + celular + '}';
    }   

}
