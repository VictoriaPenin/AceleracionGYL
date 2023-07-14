/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.agendaContactosBuilder.builder;

import com.example.agendaContactosBuilder.entity.ContactEntity;

/**
 * se crea la clase ContactBuilder que tiene métodos para establecer las
 * propiedades del contacto (nombre, apellido, telefono y domicilio). Cada uno
 * de estos métodos devuelve una referencia al propio ContactBuilder, lo que
 * permite encadenar los métodos de configuración. El método build() crea y
 * devuelve una instancia de ContactEntity utilizando las propiedades
 * configuradas en el ContactBuilder.
 */
public class ContactBuilder {

    private String nombre;
    private String apellido;
    private String telefono;
    private String domicilio;

    public ContactBuilder setNombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    public ContactBuilder setApellido(String apellido) {
        this.apellido = apellido;
        return this;
    }

    public ContactBuilder setTelefono(String telefono) {
        this.telefono = telefono;
        return this;
    }

    public ContactBuilder setDomicilio(String domicilio) {
        this.domicilio = domicilio;
        return this;
    }

    public ContactEntity build() {
        ContactEntity contact = new ContactEntity();
        contact.setNombre(nombre);
        contact.setApellido(apellido);
        contact.setTelefono(telefono);
        contact.setDomicilio(domicilio);
        return contact;
    }
}
