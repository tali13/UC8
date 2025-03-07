/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sistemadepagamento;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class SistemaDePagamento {

    public static void main(String[] args) {
        CartaoCredito card = new CartaoCredito("8873727713");
        PayPal pay = new PayPal("jakedomfort@gmail.com");
        
        card.processarPagamento(9999.70);
        pay.processarPagamento(99.00);
    }
}