/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.facade;

// Subsistema 3: Módulo de Registro de Auditoría

public class AuditLogger {
    public void logTransaction(String accountNumber, double amount) {
        System.out.println("Registro de transaccion: " + accountNumber);
        System.out.println("Monto: " + amount);
    }
}
