/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliomvc.dao;
import com.mycompany.bibliomvc.DateBase.Connect;
import com.mycompany.bibliomvc.model.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class BooksDAO {
    public static void addBook(Book myBook){
        
        
        
        
        String sql = "INSERT INTO books (title,author,price,year) VALUES(?,?,?,?)";
        
        
               Connect connectSQLite = new Connect();
       Connection connection = connectSQLite.connect();
        
        try(PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1, myBook.getTible());
            pstmt.setString(2, myBook.getAuthor());
            pstmt.setDouble(3, myBook.getPrice());
            pstmt.setInt(4, myBook.getYear());
            
            pstmt.executeUpdate();
            

       
       
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null,"error:"+ error.getMessage());
            
      
            
    }
  }
    
    public static void updateBook(Book mybook){
        String sql = "UPDATE books SET title = ?,"
                + "author =?,"
                + "price =?,"
                + "year=?"
                + "WHERE id = ?";
        
       Connect connectSQLite = new Connect();
       Connection connection = connectSQLite.connect();
                
        try(PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setString(1,mybook.getTible());
            pstmt.setString(2,mybook.getAuthor());
            pstmt.setDouble(3,mybook.getPrice());
            pstmt.setInt(4,mybook.getYear());
            pstmt.setInt(5,mybook.getId());
            
            int rowsUpdated = pstmt.executeUpdate();
            
            if(rowsUpdated>0){
                System.out.println("book found. values update.");
            }else{
                System.out.println("id not found. please select a vallid id.");
            }
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null,"error:"+ error.getMessage());
            
    }
    }
    
    public static void deleteBook(int id){
        String sql = "DELETE FROM books  WHERE id = ?";
           Connect connectSQLite = new Connect();
       Connection connection = connectSQLite.connect();
       
        try(PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setInt(1, id);
            
            
            int rowsDeleted = pstmt.executeUpdate();
            
            if(rowsDeleted > 0){
                System.out.println("id found. the book was deleted.");
            }else{
                System.out.println("id not found. please select a valid id.");
            }
        }
        catch(SQLException error){
            JOptionPane.showMessageDialog(null,"error:"+ error.getMessage());
        }
        
        
     
    }
     
    public static String[] findBook(int id){
        String sql = "SELECT * FROM  books WHERE id = ?";
        String[]info = new String[5];
        
        Connect connectSQLite = new Connect();
       Connection connection = connectSQLite.connect();
       
        try(PreparedStatement pstmt = connection.prepareStatement(sql)){
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
                info[0]= rs.getString("title");
                info[1]= rs.getString("author");
                info[2]= rs.getString("price");
                info[3]= rs.getString("year");
            }
            
        } catch(SQLException error){
            JOptionPane.showMessageDialog(null,"error:"+ error.getMessage());
        }
        return info;
    }
    
    
    public static ArrayList <Book> findBooks(){
        String sql ="SELECT * FROM books";
        ArrayList<Book> info = new ArrayList<>();
        
        Connect connectSQLite = new Connect();
       Connection connection = connectSQLite.connect();
       
        
        try(Statement stmt = connection.createStatement()){
            ResultSet rs = stmt.executeQuery(sql);
            
            while(rs.next()){
                Book mybook = new Book (
                        rs.getInt("year"), rs.getString("title"),
                rs.getString("author"));
                mybook.setId(rs.getInt("id"));
                info.add(mybook);
            }
               
            
            
                
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null,"error:"+ error.getMessage());
        }
        return info;
    }
    
   
 public static void searchBook(Book mybook) {
        String sql = "SELECT id, title, author FROM books WHERE id = ? OR title = ? OR author = ?";

        Connect connectSQLite = new Connect();
        Connection connection = connectSQLite.connect();

        if (connection == null) {
            System.out.println("Erro ao conectar ao banco de dados.");
            return;
        }

        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {

            pstmt.setInt(1, mybook.getId());
            pstmt.setString(2, mybook.getTible()); 
            pstmt.setString(3, mybook.getAuthor());

            try (ResultSet rs = pstmt.executeQuery()) {

                if (rs.next()) {
                    int id = rs.getInt("id");
                    String title = rs.getString("title");
                    String author = rs.getString("author");

                    Book foundBook = new Book(id, title, author);
                    System.out.println("Livro encontrado: " + foundBook.toString());

                } else {
                    System.out.println("Livro não encontrado.");
                }
            }
        } catch (SQLException error) {
            System.out.println("Erro ao pesquisar o livro: " + error.getMessage());
        }
    }

   
       
    }
                
            
        
        
        
       
    













































