/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cepcomapi.controller;

import com.mycompany.cepcomapi.model.Endereco;
import com.mycompany.cepcomapi.service.ViaCepService;
import org.json.JSONObject;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class CadastroController {
    // Valida o formato do e-mail usando expressão regular (Regex)
    public boolean emailValido(String email) {
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(regex);
    }

    // Busca o endereço pelo CEP e retorna um objeto Endereco ou null se houver erro
    public Endereco buscarEnderecoPorCep(String cep) throws Exception {
        JSONObject enderecoJson = ViaCepService.buscarCep(cep);

        // Verifica se a resposta contém a chave "erro" (CEP inválido)
        if (enderecoJson.has("erro")) {
            return null;
        }

        // Cria e retorna um objeto Endereco com os dados obtidos
        return new Endereco(
            enderecoJson.getString("logradouro"),
            enderecoJson.getString("bairro"),
            enderecoJson.getString("localidade"),
            enderecoJson.getString("uf")
        );
    }
}
