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
public class AllContactsSearchStrategy implements ContactSearchStrategy{
    
      private final ContactService contactService;

    public AllContactsSearchStrategy(ContactService contactService) {
        this.contactService = contactService;
    }

    @Override
    public List<ContactEntity> searchContacts() {
        return contactService.getAllContacts();
    }
}

