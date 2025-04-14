/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliomvc.DateBase;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class CreateTables {
    public static void createTables(Connection connection) throws SQLException{
      String sql =" CREATE TABLE IF NOT EXISTS books(" 
              + " id INTEGER PRIMARY KEY AUTOINCREMENT," 
              + "title VARCHAR(190) NOT NULL," 
              + "author VARCHAR(255) NOT NULL," 
              + "price REAL NOT NULL,"
              +"year INTEGER NOR NULL)"; 
      try(Statement stmt = connection.createStatement()){
      stmt.execute(sql);
      System.out.println("table created");
    }catch(SQLException error){
        JOptionPane.showMessageDialog(null,"error:"+ error.getMessage());
        
        
       }
    }
}
