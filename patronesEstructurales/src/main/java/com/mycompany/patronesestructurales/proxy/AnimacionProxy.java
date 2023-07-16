/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.patronesestructurales.proxy;

/**
 *
 * @author vicky
 */
public class AnimacionProxy implements Animacion {
    protected Video video = null;
    protected String foto = "Mostrar la foto";
    
    
    public void clic(){
     if(video == null){
         video = new Video();
         video.carga();
     }   
     video.reproduce();
    }
    
    public void dibuja(){
        if(video != null)
            video.dibuja();
        else
            dibuja(foto);
        
    }
    
    public void dibuja(String foto){
        System.out.println(foto);
    }
}
