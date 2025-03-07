/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clas;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class Clas {

   public abstract class Cla {
    private String nomeDoCla;
    private String lider;

    public Cla(String nomeDoCla, String lider) {
        this.nomeDoCla = nomeDoCla;
        this.lider = lider;
    }

    public abstract void habilidadeEspecial();

    public void exibirDetalhes() {
        System.out.println("Clã: " + nomeDoCla + ", Líder: " + lider);
    }

    public abstract void ataqueEspecial();
}

}
