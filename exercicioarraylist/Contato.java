/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exercicioarraylist;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class Contato {
    private String nome;
    private String telefone;

public Contato(String nome,String telefone){
this.nome = nome;
this.telefone = telefone;
}



public String getNome(){
return nome;
}

public void setNome(String nome){
this.nome = nome;
}

public String getTelefone(){
return telefone;
}

public void setTelefone(String telefone){
this.telefone=telefone;
}

@Override 
public String toString(){
    return nome + "-" + telefone;
}

}