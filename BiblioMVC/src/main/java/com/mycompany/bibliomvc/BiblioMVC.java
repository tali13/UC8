/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bibliomvc;

import com.mycompany.bibliomvc.DateBase.Connect;
import com.mycompany.bibliomvc.DateBase.CreateTables;
import com.mycompany.bibliomvc.dao.BooksDAO;

import com.mycompany.bibliomvc.model.Book;
import com.mycompany.bibliomvc.view.NewLibraryFrame;
import static java.awt.SystemColor.info;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;


/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class BiblioMVC {

    public static void main(String[] args) throws SQLException {
        
        
       new NewLibraryFrame().setVisible(true);
       
       
        Book mybook;
        
        
         
      

       
        
        
//        Connect myconnect = new Connect();
//       Connection myconnection = myconnect.connect();
//       
//  
//        CreateTables.createTables(myconnection);
//        
//        Book myBook = new Book("joe","????",999.99,2000);
//        
//        //BooksDAO.addBook(myBook, myconnection);
//        
//       // BooksDAO.updateBook(myconnection, 2, "os sete espelhos", "talita", 100000.000, 1000000);
//        //BooksDAO.deleteBook(myconnection, 1);
//        
//        String[] info = BooksDAO.findBook(myconnection, 1);
//        System.out.println(info[0] + " " + info [1]+ " " + info [2] + " " + info[3] + " " + info[4]);
//        
//        
//      //  System.out.println(info[0]+info[3]+" "+ info[2]+" " +info[1]);
//      
//      
//              ArrayList<Book> infoBook = BooksDAO.findBooks(myconnection);
//
//      
//      for (Book book : infoBook){
//          System.out.println(book.getClass() + "" + book.getTible()+ "" + book.getAuthor() + "" + book.getPrice() + "" + book.getYear());
//      }
      
      
      
      
    }
    
    
    
}

