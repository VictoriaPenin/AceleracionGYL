/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.proxy1;

/**
 * Cuando el cliente llama al método executeOperation() en el proxy, se
 * realizan tareas adicionales (en este caso, impresiones de mensajes) antes y
 * después de llamar al método en el RealService.
 */
public class ProxyService {

    public ProxyService() {
    }

    private RealService realService;

    public void executeOperation() {
        // Verificar si el servicio real existe
        if (realService == null) {
            realService = new RealService();
        }

        // Realizar tareas adicionales antes de llamar al servicio real
        System.out.println("Realizando tareas adicionales antes de llamar al servicio real...");

        // Llamar al realService
        realService.executeOperation();

        // Realizar tareas adicionales después de llamar al servicio real
        System.out.println("Realizando tareas adicionales después de llamar al servicio real...");
    }
}
