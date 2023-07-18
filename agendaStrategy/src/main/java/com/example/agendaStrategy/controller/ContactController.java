/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.agendaStrategy.controller;

import com.example.agendaStrategy.entity.ContactEntity;
import com.example.agendaStrategy.service.ContactService;
import com.example.agendaStrategy.strategy.AllContactsSearchStrategy;
import com.example.agendaStrategy.strategy.ContactByIdSearchStrategy;
import com.example.agendaStrategy.strategy.ContactSearchStrategy;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author vicky
 */
@RestController
@RequestMapping("/contacts")
public class ContactController {
    private final ContactService contactService;

    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/all")
    public ResponseEntity<List<ContactEntity>> findAll() {
        ContactSearchStrategy searchStrategy = new AllContactsSearchStrategy(contactService);
        List<ContactEntity> contacts = searchStrategy.searchContacts();
        return ResponseEntity.ok(contacts);
    }

    @GetMapping("/{id}")
    public ResponseEntity<List<ContactEntity>> getContactById(@PathVariable Integer id) {
        ContactSearchStrategy searchStrategy = new ContactByIdSearchStrategy(contactService, id);
        List<ContactEntity> contacts = searchStrategy.searchContacts();
        return ResponseEntity.ok(contacts);
    }
    

@PostMapping("/create")
   
    public ResponseEntity<ContactEntity> createContact(@RequestBody ContactEntity contact) {
        ContactEntity createdContact = contactService.createContact(contact);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdContact);
    }

   
       @PutMapping("/edit/{id}")
    public ResponseEntity<ContactEntity> updateContact(@PathVariable Integer id, @RequestBody ContactEntity contactDetalles) {
        ContactEntity updatedContact = contactService.updateContact(id, contactDetalles);
        if (updatedContact != null) {
            return ResponseEntity.ok(updatedContact);
        } else {
            return ResponseEntity.notFound().build();
        }}
    
        
    @DeleteMapping("/delete/{id}")
       public ResponseEntity<String> deleteContact(@PathVariable Integer id) {
        contactService.deleteContact(id);
        return ResponseEntity.ok("Contacto eliminado exitosamente.");
    
    }
}
