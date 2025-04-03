/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bancodedados;

import java.sql.Connection;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class BancoDeDados {

    public static void main(String[] args) {
        // instaciar o objeto da classe conexaoSQLite
        ConexaoSQLite conexaoSQLite = new ConexaoSQLite();
        // chamando o metodo conectar e armazenar e ele usa depois
        Connection conexao = conexaoSQLite.conectar();
      
       CriarTabela.criarTabelaUsuarios(conexao);
       
       //InserirUsuario.inserirUsuario(conexao, "jake","jakedomfort@gmail.com");  
       //AtualinarUsuario.atualizarUsuarios(conexao,2, "alastor", "alastorsannymoon@gmail.com");
       //DeletarUsuario.deletarUsuario(conexao, 2);
       System.out.println(ListarUsuario.listarUsuarios(conexao));
    }
}
