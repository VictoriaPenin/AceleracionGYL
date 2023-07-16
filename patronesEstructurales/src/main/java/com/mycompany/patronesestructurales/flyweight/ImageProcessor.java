/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.flyweight;

import java.util.ArrayList;
import java.util.List;



// Clase ImageProcessor: utiliza píxeles para construir una imagen
class ImageProcessor {
    private PixelFactory pixelFactory;
    private List<PixelData> pixels;

    public ImageProcessor(PixelFactory pixelFactory) {
        this.pixelFactory = pixelFactory;
        this.pixels = new ArrayList<>();
    }

    public void addPixel(int x, int y, String color) {
        Pixel pixel = pixelFactory.getPixel(color);
        pixels.add(new PixelData(x, y, pixel));
    }

    public void showImage() {
        for (PixelData pixelData : pixels) {
            System.out.print("Posición: (" + pixelData.getX() + ", " + pixelData.getY() + ") ");
            pixelData.getPixel().showColor();
        }
    }
}
