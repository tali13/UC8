/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clas;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class Konoha {
    public static void main(String[] args) {
        // Criando instâncias de cada clã
        Clas uchiha = new ClaUchiha("Sasuke Uchiha");
        Clas hyuga = new ClaHyuuga("Hinata Hyuga");
        Clas nara = new ClaNara("Shikamaru Nara");
        Clas akimichi = new ClaAkimichi("Choji Akimichi");

        // Chamando os métodos habilidadeEspecial() e exibirDetalhes() para cada clã
        Clas[] clanList = {uchiha, hyuga, nara, akimichi};

        for (Clas clan : clanList) {
            clan.exibirDetalhes();
            clan.habilidadeEspecial();
            System.out.println();  // Adiciona uma linha em branco para melhor legibilidade
        }
    }
}