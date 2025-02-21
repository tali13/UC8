/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rpsgame;

/**
 *
 * @author TALITANAIBERTDACOSTA
 */
public class RPSValidator {

    /**
     *
     * @param playerChoice
     * @param computerChoice
     * @return
     */
 
    
    
   public boolean validateChoice(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            System.out.println("empate tente novamente");
            return false;
            
        } else if ((playerChoice == 1 && computerChoice == 3) || 
                   (playerChoice == 2 && computerChoice == 1) ||
                   (playerChoice == 3 && computerChoice == 2)) { 
            return true; 
        } else {
            return false;
        }
    };

   
    public String choiceToString(int choice) {
        return switch (choice) {
            case 1 -> "Pedra";
            case 2 -> "Papel";
            case 3 -> "Tesoura";
            default -> "essa escolha não existe -_-";
        };
    }
    
}
