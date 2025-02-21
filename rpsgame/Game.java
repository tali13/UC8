/*
 */
package com.mycompany.rpsgame;
 import java.util.Scanner;
/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class Game {
 
    public void start() {
        
            
        user = new player();
        
      while (true) {
            System.out.println("Escolha: 1 (Pedra), 2 (Papel), 3 (Tesoura)");
            int playerChoice = scanner.nextInt();

          
            int computerChoice = (int) (Math.random() * 3) + 1; 

           
            if (Validator.validateChoice(playerChoice, computerChoice)) {
                System.out.println("Você ganhou, parabéns :)");
            } else {
                System.out.println("Você perdeu, tente de novo mais tarde. :( ");
            }

            
            System.out.println("Deseja jogar novamente? (s/n)");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                break;
    }
}
    }
    
}
