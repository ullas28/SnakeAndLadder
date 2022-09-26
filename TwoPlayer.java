/*Play the game with 2 Player. In this case if a
Player gets a Ladder then plays again.
Finally report which UC 7 Player won the game*/

package com.bridgelabz.com;

import java.util.Random;
import java.util.Scanner;

public class TwoPlayer {
    public static void main(String[] args) {
        int player1 = 0;
        int player2 = 0;
        Random a = new Random();
        int dice;
        System.out.println("Welcome to snake and ladder program with 2 players");
        do {
            dice = a.nextInt(6) + 1;
            int option = (int) Math.floor(Math.random() * 10) % 3;
                switch (option) {
                    case 0:
                        player1 += dice;
                        System.out.println("Ladder");
                        if (player1 > 100) {
                            player1 -= dice;
                        }
                        System.out.println("Position of the player1 after the ladder is : " + player1);
                        break;

                    case 1:
                        player1 -= dice;
                        System.out.println("Snake");
                        if (player1 < 0) {
                            player1 = 0;
                            System.out.println("Player restart from zero: ");
                        }
                        System.out.println("Position of the player1 after the Snake is : " + player1);
                        break;

                    case 2:
                        System.out.println("No play");
                        System.out.println("Position of the player1 remains same");
                        break;
                }
                if (player1 == 100) {
                    System.out.println("Player1 is the winner");
                    return;
                }
                int option1 = (int) Math.floor(Math.random() * 10) % 3;

                switch (option1) {
                    case 0:
                        player2 += dice;
                        System.out.println("Ladder");
                        if (player2 > 100) {
                            player2 -= dice;
                        }
                        System.out.println("Position of the player2 after the ladder is : " + player2);
                        break;

                    case 1:
                        player2 -= dice;
                        System.out.println("Snake");
                        if (player2 < 0) {
                            player2 = 0;
                            System.out.println("Player2 restart from zero: ");
                        }
                        System.out.println("Position of the player2 after the Snake is : " + player2);
                        break;

                    case 2:
                        System.out.println("No play");
                        System.out.println("Position of the player2 remains same");
                        break;
                }
                if (player2 == 100) {
                    System.out.println("Player2 is the winner");
                    return;
                }
        }while (player1 < 100 && player2 < 100) ;
    }
}