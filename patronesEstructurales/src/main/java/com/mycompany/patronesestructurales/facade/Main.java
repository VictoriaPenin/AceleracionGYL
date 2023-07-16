/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.facade;


public class Main {
    public static void main(String[] args) {
        // Crear una instancia de la fachada bancaria
        BankingFacade bankingFacade = new BankingFacade();

        // Utilizar la fachada para realizar una transacción bancaria
        bankingFacade.performTransaction("123456789", "Juan Perez", "Alvear 698", 500.0);
    }
}
