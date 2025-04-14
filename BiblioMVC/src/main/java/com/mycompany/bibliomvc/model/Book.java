/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliomvc.model;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class Book {
    private int id;
    private String tible;
    private String author;
    private double price;
    private int year;

    public Book(int year, String tible, String author) {
        this.tible = tible;
        this.author = author;
        this.price = price;
        this.year = year;
    }

    public String getTible() {
        return tible;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getYear() {
        return year;
    }

    public void setTible(String tible) {
        this.tible = tible;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    
}
