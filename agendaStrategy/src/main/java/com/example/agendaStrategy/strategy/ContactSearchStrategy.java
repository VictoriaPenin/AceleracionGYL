/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.agendaStrategy.strategy;

import com.example.agendaStrategy.entity.ContactEntity;
import java.util.List;

/**
 *
 * @author vicky
 */
public interface ContactSearchStrategy {
        List<ContactEntity> searchContacts();

}
