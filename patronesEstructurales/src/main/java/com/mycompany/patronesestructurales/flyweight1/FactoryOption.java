/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.flyweight1;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * La clase FactoryOption gestiona la comparticion de las opciones con ayuda de
 * un diccionario, cuya clave de acceso es el nombre de la opcion. El metodo
 * getOption busca en este diccionario y si no encuentra la opcion, la crea, la
 * agrega al diccionario y la devuelve
 */
public class FactoryOption {
    protected Map<String, VehicleOption> optionsCache = new HashMap<>();

    public VehicleOption getOption(String brand, String model, int year) {
        String key = brand + "-" + model + "-" + year;

        if (optionsCache.containsKey(key)) {
            return optionsCache.get(key);
        } else {
            VehicleOption result = new VehicleOption(brand, model, year);
            optionsCache.put(key, result);
            return result;
        }
    }
}