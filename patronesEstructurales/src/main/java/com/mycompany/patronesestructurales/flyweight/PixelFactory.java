/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.flyweight;

import java.util.HashMap;
import java.util.Map;


// Clase PixelFactory: actúa como la fábrica de píxeles


class PixelFactory {
    private Map<String, Pixel> pixelMap;

    public PixelFactory() {
        pixelMap = new HashMap<>();
    }

    public Pixel getPixel(String color) {
        if (!pixelMap.containsKey(color)) {
            pixelMap.put(color, new Pixel(color));
        }
        return pixelMap.get(color);
    }
}