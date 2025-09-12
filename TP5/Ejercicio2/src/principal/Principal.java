/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

/**
 *
 * @author gtiseira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Bateria bateria1 = new Bateria("Litio", 5000);
        Celular celular1 = new Celular("12345", "Samsung", "A10", bateria1);
        Usuario usuario1 = new Usuario("Gonzalo", "12345678");
        
        usuario1.asignarCelular(celular1);
        //celular1.asignarUsuario(usuario1);
        
        System.out.println(celular1);
        System.out.println(usuario1);
        
        celular1.mostrarBateria();
        
        Bateria bateria2 = new Bateria("NiMH", 3000);
        celular1.asignarBateria(bateria2);
        
        celular1.mostrarBateria();
        System.out.println(celular1);
    }
    
}
