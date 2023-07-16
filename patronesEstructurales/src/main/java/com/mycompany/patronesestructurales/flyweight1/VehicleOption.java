/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.flyweight1;

/**
 * La clase VehicleOption posee un constructor que permite definir el estado
 * intrínseco de la opción. En este ejemplo, a parte del nombre, los demás
 * atributos toman valores constantes o que están basados directamente en el
 * nombre. Normalmente, estos valores deberían provenir de una base de datos. El
 * método visualiza recibe el precio de venta como parámetro, que constituye el
 * estado extrínseco.
 */
public class VehicleOption {
    protected static int count = 0;
    protected int optionNumber;
    protected String brand;
    protected String model;
    protected int year;

    public VehicleOption(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.optionNumber = ++count;
    }

    public void visualize(int salePrice) {
        System.out.println("Marca: " + brand);
        System.out.println("Modelo: " + model);
        System.out.println("Año: " + year);
        System.out.println("Precio de Venta: " + salePrice);
    }
}