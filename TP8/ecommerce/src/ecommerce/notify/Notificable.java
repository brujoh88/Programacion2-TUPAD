/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ecommerce.notify;


/**
 * Contrato para recibir notificaciones de cambios de estado u otros eventos.
 */
/**
 *
 * @author gtiseira
 */
public interface Notificable {
    void notificar(String mensaje);
}