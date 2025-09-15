/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mflor
 */
public class EditorDeVideo {

	public void exportar(String formato, Proyecto proyecto) {
		Render render = new Render(formato);
        render.setProyecto(proyecto);
        System.out.println("Exportando proyecto: " + render);
	}	
}
