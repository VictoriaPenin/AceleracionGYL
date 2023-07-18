/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.agendaStrategy.strategy;

import com.example.agendaStrategy.entity.ContactEntity;
import com.example.agendaStrategy.service.ContactService;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author vicky
 */
public class ContactByIdSearchStrategy implements ContactSearchStrategy {
    private final ContactService contactService;
    private final Integer contactId;

    public ContactByIdSearchStrategy(ContactService contactService, Integer contactId) {
        this.contactService = contactService;
        this.contactId = contactId;
    }

    @Override
    public List<ContactEntity> searchContacts() {
        ContactEntity contact = contactService.getContactById(contactId);
        return contact != null ? Collections.singletonList(contact) : Collections.emptyList();
    }

}
