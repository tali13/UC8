/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfaces;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class teclado  implements instrumento{

    private String marca;

    @Override
    public void tocar() {
        System.out.println("a marca do seu teclado e " + this.marca + ".");
    }

    @Override
    public void afinar() {
    }
    
}
