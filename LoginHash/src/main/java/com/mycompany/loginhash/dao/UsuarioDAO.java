/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loginhash.dao;

import com.mycompany.loginhash.database.ConnectionSQL;
import com.mycompany.loginhash.model.usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import org.mindrot.jbcrypt.BCrypt;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class UsuarioDAO {
    public boolean registrarUsuario(usuario usuario) {
    String sql = "INSERT INTO usuarios (usuario, senha) VALUES (?, ?)";
    //String senhaHash = BCrypt.hashpw(usuario.getSenha(), BCrypt.gensalt());//vai em criptar a senha,iria ter que trocar getsenha.usuario por senhahash

    try (Connection conn = ConnectionSQL.conectar(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, usuario.getEmail());
        stmt.setString(2, usuario.getSenha());//
        stmt.executeUpdate();
        return true;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
  }
    
    public boolean validarLogin(usuario usuario) {
    String sql = "SELECT senha FROM usuarios WHERE usuario = ?";

    try (Connection conn = ConnectionSQL.conectar(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, usuario.getEmail());
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) { //rs = list
            String senhaHash = rs.getString("senha");
            boolean login = BCrypt.checkpw(usuario.getSenha(), senhaHash);
           
            
            if(login == true){
               System.out.println("a senha esta certa :)");
            }else{
                   System.out.println("erro, arruma agora");
            }
            return login;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
  }
    public usuario buscarUsuarioPorEmail(String email) {
    String sql = "SELECT * FROM usuarios WHERE usuario = ?";

    try (Connection conn = ConnectionSQL.conectar(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        //criar id que esqueci
        stmt.setString(1, email);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            usuario usuario = new usuario(rs.getString("usuario"), rs.getString("senha"));
            return usuario;
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return null;
}
    
    public boolean atualizarSenha(String email, String novaSenha) {
    String sql = "UPDATE usuarios SET senha = ? WHERE usuario = ?";
    String senhaHash = BCrypt.hashpw(novaSenha, BCrypt.gensalt());

    try (Connection conn = ConnectionSQL.conectar(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, senhaHash);
        stmt.setString(2, email);
        return stmt.executeUpdate() > 0;
    } catch (SQLException e) {
        e.printStackTrace();
        return false;
    }
  }
    
    
    
    public List<usuario> listarUsuarios() {
    List<usuario> usuarios = new ArrayList<>();
    String sql = "SELECT usuario FROM usuarios";

    try (Connection conn = ConnectionSQL.conectar(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            usuario usuario = new usuario(rs.getString("usuario"), ""); // senha não exibida
            usuarios.add(usuario);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    return usuarios;
}
}
