/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.flyweight1;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase VehicleRequested gestiona la lista de opciones así como la lista
 * de los precios de venta. Ambas listas se gestionan en paralelo. El precio de
 * venta de una opción se encuentra con el mismo índice en la lista
 * precioDeVentaOpciones que la opción en la lista opciones. La clase
 * VehicleRequested incluye dos métodos que permiten gestionar estas listas
 * aunque no intervienen directamente en el patrón: los métodos addOptions y
 * muestraOpciones. El método addOptions recibe como parámetros el nombre de
 * la opción (estado intrínseco), el precio de venta (estado extrínseco) y la
 * fábrica de opciones que debe usar. Cuando se invoca el método visualiza de
 * una opción, su precio de venta se pasa como parámetro tal y como se puede ver
 * en el método showOptions.
 */
public class VehicleRequested {
    protected List<VehicleOption> options = new ArrayList<VehicleOption>();
    protected List<Integer> salePriceOptions = new ArrayList<Integer>();

    public void addOptions(String brand, String model, int year, int salePrice, FactoryOption factory) {
        VehicleOption option = factory.getOption(brand, model, year);
        options.add(option);
        salePriceOptions.add(salePrice);
    }

    public void showOptions() {
        int index, width;

        width = options.size();
        for (index = 0; index < width; index++) {
            System.out.println("Opción " + (index + 1));
            options.get(index).visualize(salePriceOptions.get(index));
            System.out.println();
        }
    }
}
