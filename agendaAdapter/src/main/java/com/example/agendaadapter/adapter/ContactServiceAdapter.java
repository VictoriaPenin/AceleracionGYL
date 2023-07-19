/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.agendaadapter.adapter;

import com.example.agendaadapter.entity.ContactEntity;
import com.example.agendaadapter.service.ContactService;
import com.example.agendaadapter.service.ContactServiceImp;
import java.util.List;

/**
 * Esta clase es el adaptador que se encarga de convertir las llamadas de la
 * interfaz ContactService a las llamadas reales del ContactServiceImp
 */
public class ContactServiceAdapter implements ContactService {

    private final ContactServiceImp contactService;

    /* implemento los métodos de la interfaz ContactService.
    Cada método del adaptador invoca el método correspondiente de ContactServiceImp  */
    
    public ContactServiceAdapter(ContactServiceImp contactService) {
        this.contactService = contactService;
    }

    @Override
    public List<ContactEntity> findAll() {
        return contactService.getAllContacts();
    }

    @Override
    public ContactEntity getContactById(Integer id) {
        return contactService.getContactById(id);
    }

    @Override
    public ContactEntity createContact(ContactEntity contact) {
        return contactService.createContact(contact);
    }

    @Override
    public ContactEntity updateContact(Integer id, ContactEntity contactDetails) {
        return contactService.updateContact(id, contactDetails);
    }

    @Override
    public void deleteContact(Integer id) {
        contactService.deleteContact(id);
    }

    @Override
    public List<ContactEntity> getAllContacts() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
