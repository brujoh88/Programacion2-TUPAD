/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.util;


import ecommerce.model.Producto;
import java.util.Comparator;

/**
 *
 * @author gtiseira
 */
public final class ComparadoresProducto {
    private ComparadoresProducto() {}


    public static final Comparator<Producto> POR_PRECIO_ASC =
            Comparator.comparingDouble(Producto::getPrecio);


    public static final Comparator<Producto> POR_PRECIO_DESC =
            Comparator.comparingDouble(Producto::getPrecio).reversed();


    public static final Comparator<Producto> POR_NOMBRE_ASC =
            Comparator.comparing(p -> p.getNombre().toLowerCase());
}