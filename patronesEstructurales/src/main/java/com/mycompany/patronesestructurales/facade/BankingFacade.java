/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.facade;

// Fachada que proporciona una interfaz unificada para los subsistemas

public class BankingFacade {
    private BankAccount bankAccount;
    private IdentityVerification identityVerification;
    private AuditLogger auditLogger;

    public BankingFacade() {
        this.bankAccount = new BankAccount();
        this.identityVerification = new IdentityVerification();
        this.auditLogger = new AuditLogger();
    }

    public void performTransaction(String accountNumber, String name, String address, double amount) {
        boolean isIdentityVerified = identityVerification.verifyIdentity(name, address);
        
        if (isIdentityVerified) {
            bankAccount.verifyAccount(accountNumber);
            bankAccount.processTransaction(accountNumber, amount);
            auditLogger.logTransaction(accountNumber, amount);
        } else {
            System.out.println("Fallo la verificacion de identidad, operacion cancelada");
        }
    }
}
