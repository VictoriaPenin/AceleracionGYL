/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.agendaContactosBuilder.controller;

import com.example.agendaContactosBuilder.builder.ContactBuilder;
import com.example.agendaContactosBuilder.entity.ContactEntity;
import com.example.agendaContactosBuilder.service.ContactService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }
    
    @GetMapping("/all")
    public ResponseEntity<List<ContactEntity>> findAll() {
        List<ContactEntity> contacts = contactService.findAll();
        return ResponseEntity.ok(contacts);
    }

        @GetMapping("/list")
     public ResponseEntity<List<ContactEntity>> getAllContacts() {
        List<ContactEntity> contacts = contactService.getAllContacts();
        return ResponseEntity.ok(contacts);
    }

    @GetMapping("/{id}")
       public ResponseEntity<ContactEntity> getContactById(@PathVariable Integer id) {
        ContactEntity contact = contactService.getContactById(id);
        if (contact != null) {
            return ResponseEntity.ok(contact);
        } else {
            return ResponseEntity.notFound().build();
        }}

    @PostMapping("/create")
public ResponseEntity<ContactEntity> createContact(@RequestBody ContactEntity contact) {
    ContactEntity createdContact = new ContactBuilder()
        .setNombre(contact.getNombre())
        .setApellido(contact.getApellido())
        .setTelefono(contact.getTelefono())
        .setDomicilio(contact.getDomicilio())
        .build();

    // Lógica adicional, como guardar el contacto en la base de datos
    ContactEntity savedContact = contactService.createContact(createdContact);

    return ResponseEntity.status(HttpStatus.CREATED).body(savedContact);
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
