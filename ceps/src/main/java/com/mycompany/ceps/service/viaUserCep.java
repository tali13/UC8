/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ceps.service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class viaUserCep {
    public static JSONObject buscarCep(String cep) throws Exception {
        
        OkHttpClient client = new OkHttpClient();

       
        Request request = new Request.Builder()
            .url("https://viacep.com.br/ws/" + cep + "/json/")
            .build(); 

        
        try (Response response = client.newCall(request).execute()) {
      
            if (!response.isSuccessful()) {
                throw new Exception("Erro ao buscar CEP: " + response);
            }

          
            String jsonData = response.body().string();

           
            return new JSONObject(jsonData);
        }
    }
}
