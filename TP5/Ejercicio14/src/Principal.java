/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author mflor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proyecto proyecto = new Proyecto("Mi Proyecto", 120);
        EditorDeVideo editor = new EditorDeVideo();
        editor.exportar("MP4", proyecto);
    }
    
}
