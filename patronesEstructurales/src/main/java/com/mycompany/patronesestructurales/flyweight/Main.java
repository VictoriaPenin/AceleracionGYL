/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.flyweight;

// Clase Main: punto de entrada de la aplicación


public class Main {
    public static void main(String[] args) {
        PixelFactory pixelFactory = new PixelFactory();
        ImageProcessor processor = new ImageProcessor(pixelFactory);

        // Agregar píxeles a la imagen
        processor.addPixel(0, 0, "rojo");
        processor.addPixel(0, 1, "azul");
        processor.addPixel(1, 0, "verde");
        processor.addPixel(1, 1, "rojo");
        processor.addPixel(2, 2, "azul");

        // Mostrar la imagen
        processor.showImage();
    }
}






