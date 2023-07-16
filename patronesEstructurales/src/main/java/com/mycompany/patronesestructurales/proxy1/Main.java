/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.proxy1;

/**
 * El uso del patrón de diseño Proxy permite controlar el acceso al objeto real
 * y agregar funcionalidad adicional sin que el cliente tenga que preocuparse
 * por ello. Esto puede ser útil en situaciones como la gestión de recursos, la
 * implementación de un caché, el control de acceso, etc.
 */
public class Main {
public static void main(String[] args) {
        ProxyService service = new ProxyService();
        service.executeOperation();
    }
}
