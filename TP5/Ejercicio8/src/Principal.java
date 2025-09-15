/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author gtiseira
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        Usuario usuario = new Usuario("Gustavo Tiseira", "email@mail.com");
        FirmaDigital firma = new FirmaDigital("abc123", "2024-10-01", usuario);
        Documento documento = new Documento("Contrato", "Contenido del contrato...", firma.getCodigoHash(), firma.getFecha(), usuario); 
        System.out.println(documento);        
    }
    
}
