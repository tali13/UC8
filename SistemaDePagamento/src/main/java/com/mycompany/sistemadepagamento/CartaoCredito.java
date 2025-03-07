/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadepagamento;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class CartaoCredito implements Pagamento{
    private String numeroCartao;
    private int codigoSeguranca;

    public CartaoCredito (String numCard) {
       this.numeroCartao = numCard;
    }
    
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado no cartão de final " + this.obterDetalhes() + ".");
    }

    @Override
    public String obterDetalhes() {
        return numeroCartao.substring(numeroCartao.length() - 4);
    }
    
    
}