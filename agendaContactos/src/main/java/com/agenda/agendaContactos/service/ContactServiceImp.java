/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.agenda.agendaContactos.service;

import com.agenda.agendaContactos.entity.ContactEntity;
import com.agenda.agendaContactos.repository.ContactRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author vicky
 */
@Service
public class ContactServiceImp implements ContactService {
    private final ContactRepository contactRepository;

    @Autowired
    public ContactServiceImp(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    //para traer todos los contactos
    @Override
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