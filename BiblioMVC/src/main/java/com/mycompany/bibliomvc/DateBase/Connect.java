/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bibliomvc.DateBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class Connect {
    public Connection connect(){
        Connection connection = null;
        String url ="jdbc:sqlite:libraly.db";
        try{
            connection = DriverManager.getConnection(url);
            System.out.println("sucesso");
        }catch(SQLException error){
            JOptionPane.showMessageDialog(null,"error:"+ error.getMessage());
        }
        return connection;
        
    }
    public void disconnect(Connection connection){
        
   try{
        if(connection !=null){
            connection.close();
        } 
        }
   catch (SQLException error){
            JOptionPane.showMessageDialog(null,"error:"+ error.getMessage());
    }
    }
}