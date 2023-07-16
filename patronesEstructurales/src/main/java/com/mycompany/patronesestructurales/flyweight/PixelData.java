/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.flyweight;

// Clase PixelData: almacena la información del píxel y sus coordenadas


class PixelData {
    private int x;
    private int y;
    private Pixel pixel;

    public PixelData(int x, int y, Pixel pixel) {
        this.x = x;
        this.y = y;
        this.pixel = pixel;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Pixel getPixel() {
        return pixel;
    }
}
