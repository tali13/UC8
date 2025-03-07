/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemadepagamento;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class PayPal implements Pagamento{
    
    private String email;

    public PayPal (String enderecoEmail) {
        this.email = enderecoEmail;
    }
    
    @Override
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$ " + valor + " processado via Paypal através da conta de email " + this.obterDetalhes() + ".");
    }

    @Override
    public String obterDetalhes() {
        return this.email;
    }
    
    
}