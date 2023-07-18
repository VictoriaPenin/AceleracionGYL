/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.agendaStrategy.service;

import com.example.agendaStrategy.entity.ContactEntity;
import java.util.List;

/**
 *
 * @author vicky
 */
public interface ContactService {
    List<ContactEntity> getAllContacts();
    ContactEntity getContactById(Integer id);
    ContactEntity createContact(ContactEntity contact);
        ContactEntity updateContact(Integer id, ContactEntity contactDetalles);
    void deleteContact(Integer id);

    public List<ContactEntity> findAll();
}