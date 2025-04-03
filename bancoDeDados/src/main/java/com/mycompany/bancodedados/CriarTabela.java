/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bancodedados;

import java.sql.Connection;
import java.sql.Statement;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class CriarTabela {

    //static significa que não precisa estanciar
    public static void criarTabelaUsuarios(Connection conexao) {
        //criar tabela SQL(referencia pgAdmimin)
        String sql = "CREATE TABLE IF NOT EXISTS usuarios ("
                + "id INTEGER PRIMARY KEY AUTOINCREMENT, "
                + "nome VARCHAR(225) NOT NULL, "
                + "email VARCHAR(225) NOT NULL)";

        try (Statement stmt = conexao.createStatement()) {
            //faz uma consulta
            stmt.execute(sql);

            System.out.println("Tabela 'usuarios' criada ou já existente.");

        } catch (Exception e) {

            System.out.println("Erro ao criar tabela: " + e.getMessage());
        }
    }
}

