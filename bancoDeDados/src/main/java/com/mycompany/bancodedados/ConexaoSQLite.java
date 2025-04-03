/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodedados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class ConexaoSQLite {
 public  Connection conectar(){
     
     Connection conexao = null;
     
     String url ="jdbc:sqlite:usuarios.db";
     
     try{
         conexao = DriverManager.getConnection(url);
            System.out.println("Conexão com SQLite estabelecida!");
     } catch (SQLException e) {
            System.out.println("Erro ao conectar ao banco: " + e.getMessage());
        }
        
        return conexao;
    }

    // Método para fechar a conexão
    public void desconectar(Connection conexao) {
        try {
            if (conexao != null) {
                conexao.close();
                System.out.println("Conexão fechada.");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao fechar a conexão: " + e.getMessage());
        }
    }
}
     
    
