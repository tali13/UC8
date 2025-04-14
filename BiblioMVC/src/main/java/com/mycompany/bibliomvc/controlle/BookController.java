/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliomvc.controlle;

import com.mycompany.bibliomvc.dao.BooksDAO;
import com.mycompany.bibliomvc.model.Book;
import java.util.ArrayList;
import javax.swing.JTextField;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class BookController {
    
    private static ArrayList <Book> currentBooks = new ArrayList<>();
    
      public static void addBook(String title, String author, String priceStr , String yearStr){
          
          
          double price = Double.parseDouble(priceStr);
          int year = Integer.parseInt(yearStr);
          
          
          
          Book mybook = new Book(year, title, author);
          BooksDAO.addBook(mybook);
      }
 public static void updateBook(int id,String titlez,String authorz,String newprice, String newyear){
 
     
    double price = Double.parseDouble(newprice);
    int year = Integer.parseInt(newyear);

    Book mybook = new Book(year, titlez, authorz); 

    mybook.setId(id);

    BooksDAO.updateBook(mybook);
}
 
 
 public static Book getBookByIndex(int index){
     if(index >=0 && index < currentBooks.size()){
         return currentBooks.get(index);
     }
     return null;
 }
 
 
 
 public static ArrayList<String> loaBooks(){
        ArrayList<String>formattedList = new ArrayList<>();
        
        
        
        currentBooks = BooksDAO.findBooks();
        
        for(Book book: currentBooks){
            String details = "id:" + book.getId() + "|"
           + "title" + book.getTible() + "|"
           + " author" + book.getAuthor()+"|"
           +"price"+book.getPrice()+"|"
           +"year" + book.getYear();
            formattedList.add(details);
        }
            
         return  formattedList;
        }
 
 

 //public static String searchBook(String title){ }

     

 
  }  

  
 
 
             


