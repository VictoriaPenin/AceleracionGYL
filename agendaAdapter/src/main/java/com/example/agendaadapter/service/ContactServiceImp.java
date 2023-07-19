/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.agendaadapter.service;

import com.example.agendaadapter.entity.ContactEntity;
import com.example.agendaadapter.repository.ContactRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 Hago una implementacion de la interfaz ContacServicde creando una clase ContactServiceImp,
 * que es la que contiene la logica para las operacions crud de los contactos
 */
@Service
public class ContactServiceImp implements ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactServiceImp(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public ContactServiceImp() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //para traer todos los contactos
    public List<ContactEntity> getAllContacts() {
        return contactRepository.findAll();
    }

    
   
    @Override
    public ContactEntity getContactById(Integer id) {
        return contactRepository.findById(id).orElse(null);
    }

    
    //crear un contacto nuevo
    @Override
    public ContactEntity createContact(ContactEntity contact) {
        return contactRepository.save(contact);
    }

    //actualizar los contactos
   @Override
 public ContactEntity updateContact(Integer id, ContactEntity contact) {
        ContactEntity existingContact = contactRepository.findById(id).orElse(null);

        if (existingContact != null) {
            existingContact.setNombre(contact.getNombre());
            existingContact.setApellido(contact.getApellido());
            existingContact.setTelefono(contact.getTelefono());
            existingContact.setDomicilio(contact.getDomicilio());
            contactRepository.save(existingContact);
        }
            return existingContact;
        }


    

    //eliminar los contactos, seleccionando un id
    @Override
    public void deleteContact(Integer id) {
        contactRepository.deleteById(id);
    }

    @Override
    public List<ContactEntity> findAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}