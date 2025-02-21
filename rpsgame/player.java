/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;

import java.util.Scanner;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class player {

    static void start() {
        throw new UnsupportedOperationException();
    }

    private String name;

    public player() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        this.name = scanner.nextLine();
    }

    public String getName() {
        return name;
    }
}
