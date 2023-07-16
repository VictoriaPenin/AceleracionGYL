/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.flyweight;



// Clase Pixel: representa un píxel en una imagen


class Pixel {
    private String color;

    public Pixel(String color) {
        this.color = color;
    }

    public void showColor() {
        System.out.println("Color del píxel: " + color);
    }
}
