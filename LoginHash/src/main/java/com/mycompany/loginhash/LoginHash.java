/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginhash;

import com.mycompany.loginhash.dao.UsuarioDAO;
import com.mycompany.loginhash.database.ConnectionSQL;
import com.mycompany.loginhash.model.usuario;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class LoginHash {

    public static void main(String[] args) {
       ConnectionSQL.conectar();
       
      usuario meuUser = new usuario("jake@gmail","541453");
       
      
      
       UsuarioDAO usuarioDAO = new UsuarioDAO();
       usuarioDAO.registrarUsuario(meuUser);
       
    }
}
