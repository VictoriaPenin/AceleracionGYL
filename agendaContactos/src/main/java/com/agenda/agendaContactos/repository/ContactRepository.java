/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.agenda.agendaContactos.repository;

import com.agenda.agendaContactos.entity.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author vicky
 */
@Repository
public interface ContactRepository extends JpaRepository<ContactEntity, Integer> {
    
}
