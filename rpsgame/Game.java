/*
 */
package com.mycompany.rpsgame;
 import java.util.Scanner;
/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class Game {
   


    private RPSValidator Validator = new RPSValidator(); 
    private Scanner scanner = new Scanner(System.in);

    public void start() {
        System.out.println("Bem-vindo ao RPS o jogo Pedra, Papel e Tesoura!");
        System.out.println("Escolha 1 para Pedra, 2 para Papel, 3 para Tesoura:");

        int playerChoice = scanner.nextInt();
        int computerChoice = (int) (Math.random() * 3) + 1; 

    
        if (Validator.validateChoice(playerChoice, computerChoice)) {
            System.out.println("Você ganhou,parabens :)");
        } else {
            System.out.println("Você perdeu tente de novo mais tarde. :( ");
        }

        System.out.println("Computador escolheu: " + Validator.choiceToString(computerChoice));
    }
}
