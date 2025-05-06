/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ceps.controller;

import com.mycompany.ceps.model.CepsUsers;
import com.mycompany.ceps.service.viaUserCep;
import org.json.JSONObject;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class controllerCadastro {
     
    public boolean emailValido(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(regex);
    }

  
    public CepsUsers  buscarEnderecoPorCep(String cep) throws Exception {
        JSONObject enderecoJson =  viaUserCep.buscarCep(cep);

       
        if (enderecoJson.has("erro")) {
            return null;
        }

        
        return new CepsUsers(
            enderecoJson.getString("logradouro"),
            enderecoJson.getString("bairro"),
            enderecoJson.getString("localidade"),
            enderecoJson.getString("uf")
        );
    }
}
