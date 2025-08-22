/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author gtiseira
 */
public class Gallina {
    private int idGallina;
    private int edad;
    private int huevosPuestos;

    public int getIdGallina() {
        return idGallina; 
    }
    public void setIdGallina(int idGallina) {
        this.idGallina = idGallina;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
        } else {
            System.out.println("Edad inválida. Debe ser un número no negativo.");
        }
    }
    public int getHuevosPuestos() {        
        return huevosPuestos;
    }
    public void setHuevosPuestos(int huevosPuestos) {
        if (huevosPuestos >= 0) {
            this.huevosPuestos = huevosPuestos;
        } else {
            System.out.println("Número de huevos puestos inválido. Debe ser un número no negativo.");
        }
    }

    public void setInformacionCompleta(int idGallina, int edad, int huevosPuestos) {
        setIdGallina(idGallina);
        setEdad(edad);
        setHuevosPuestos(huevosPuestos);
    }

    public String getDescripcion() {
        return "ID Gallina: " + getIdGallina() + ", Edad: " + getEdad() + ", Huevos Puestos: " + getHuevosPuestos();
    }

    public void ponerHuevo() {
        if (edad >= 1) { // Asumiendo que la gallina debe tener al menos 1 año para poner huevos
            huevosPuestos++;
            System.out.println("Huevo puesto. Total de huevos: " + huevosPuestos);
        } else {
            System.out.println("La gallina es demasiado joven para poner huevos.");
        }
    }

    public void envejecer() {
        edad++;
        System.out.println("La gallina ha envejecido. Nueva edad: " + edad);
    }
}
