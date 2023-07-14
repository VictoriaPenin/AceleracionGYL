/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.agendaContactosBuilder.service;

import com.example.agendaContactosBuilder.entity.ContactEntity;
import com.example.agendaContactosBuilder.repository.ContactRepository;
import jakarta.transaction.Transactional;
import java.util.List;
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

    @Override
    public List<ContactEntity> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public ContactEntity getContactById(Integer id) {
        return contactRepository.findById(id).orElse(null);
    }

    @Transactional
@Override
    public ContactEntity createContact(ContactEntity contact) {
        ContactEntity createdContact = contactRepository.save(contact);
        return createdContact;
    }

    @Override
    public ContactEntity updateContact(Integer id, ContactEntity contactDetalles) {
        ContactEntity existingContact = contactRepository.findById(id).orElse(null);

        if (existingContact != null) {
            existingContact.setNombre(contactDetalles.getNombre());
            existingContact.setApellido(contactDetalles.getApellido());
            existingContact.setTelefono(contactDetalles.getTelefono());
            existingContact.setDomicilio(contactDetalles.getDomicilio());
            return contactRepository.save(existingContact);
        } else {
            return null;
        }
    }

    @Override
    public void deleteContact(Integer id) {
        contactRepository.deleteById(id);
    }

    @Override
    public List<ContactEntity> findAll() {
        return contactRepository.findAll();
    }
    
}
