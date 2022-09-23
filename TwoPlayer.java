/*Play the game with 2 Player. In this case if a
Player gets a Ladder then plays again.
Finally report which UC 7 Player won the game*/

package com.bridgelabz.com;

import java.util.Random;
import java.util.Scanner;

public class TwoPlayer {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner keyboard = new Scanner(System.in);

        int Player1Score = 0;
        int Player2Score = 0;
        int PlayerSubTotal = 0;
        boolean run = true;
        String response;
        int roll = 0;

        do {
            System.out.println("Player1 Turn");
            run = true;
            do {
                roll = 1 + rand.nextInt(6);
                System.out.println("Player1 rolled " + roll + ".");


                if (roll == 1)
                {
                    System.out.println("Player1 score: " + Player1Score + " Player2 score: " + Player2Score);

                    run = false;
                } else {
                    Player2Score += roll;
                    System.out.println("Player1score: " + Player1Score + " Player2score: " + Player2Score);

                    if (Player1Score >= 100) {
                        run = false;
                    } else {
                        System.out.print("Enter 'r' to roll again or 'h' to hold: ");
                        response = keyboard.next();
                        if (response.equalsIgnoreCase("h")) {
                            run = false;
                        }
                    }

                }
            } while (run);

            if (Player1Score < 100) {
                System.out.println("\nPlayer2 Turn");

                Player2Score = 0;
                run = true;
                do {
                    roll = 1 + rand.nextInt(6);
                    System.out.println("Player2 rolled " + roll + ".");

                    if (roll == 1) {
                        System.out.println("Player1 score: " + Player1Score + " Player2 score: " + Player2Score);
                        run = false;
                    } else {
                        Player1Score += roll;
                        Player2Score += roll;
                        System.out.println("Player1 score: " + Player1Score + " Player2 score: " + Player2Score);

                        if (Player2Score >= 20) {
                            System.out.println("Player2 subtotal >= 20.");
                            run = false;
                        }

                        if (Player2Score >= 100) {
                            run = false;
                        }
                    }
                } while (run && Player2Score < 20);
            }
            System.out.println();
        } while (Player1Score < 100 && Player2Score < 100);

        if (Player1Score >= 100)
            System.out.println("Player1 win the game");
        else
            System.out.println("Player2 win the game");

        keyboard.close();
    }
}
