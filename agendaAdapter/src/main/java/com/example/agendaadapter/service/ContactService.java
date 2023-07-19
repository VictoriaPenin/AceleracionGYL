/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.agendaadapter.service;

import com.example.agendaadapter.entity.ContactEntity;
import java.util.List;

/**
 * El patrón de adaptador nos permite adaptar una interfaz existente a otra
 * interfaz que necesitamos sin modificar el código original. En este caso,
 * podemos crear un adaptador para el ContactService y así ocultar la
 * implementación específica de este servicio detrás de una interfaz más
 * genérica.
 */

/*
creo una interfaz llamada ContactService que contiene los métodos necesarios 
para las operaciones CRUD relacionadas con los contactos. Esta interfaz define
lo que el servicio debe cumplir para interactuar con el controlador.
 */
public interface ContactService {

    List<ContactEntity> findAll();

    ContactEntity getContactById(Integer id);

    ContactEntity createContact(ContactEntity contact);

    ContactEntity updateContact(Integer id, ContactEntity contact);

    void deleteContact(Integer id);

    public List<ContactEntity> getAllContacts();
}
