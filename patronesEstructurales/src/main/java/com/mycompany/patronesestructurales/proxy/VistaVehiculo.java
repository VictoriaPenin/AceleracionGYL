/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.proxy;

/**
 *
 * @author vicky
 */
public class VistaVehiculo {
    public static void main(String[] args){
        Animacion animacion = (Animacion) new AnimacionProxy();
        animacion.dibuja();
        animacion.clic();
        animacion.dibuja();
    }
}
