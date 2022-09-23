/*Repeat till the Player reaches the winning position 100.
 - Note In case the player position moves below 0, then the player restarts from 0*/

package com.bridgelabz.com;

public class WinningPosition {
    public static void main(String[] args) {

        System.out.println("Player initial Position is: ");

        int position = 0;

        while (position < 100) {

            int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("diceNumber is : " + dice);

            int option = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println("selected player option : " + option);

            switch (option) {
                case 0:
                    position += dice;
                    System.out.println("Ladder");
                    System.out.println("position for the player after the ladder is : " + position);
                    break;

                case 1:
                    position -=  dice;
                    System.out.println("Snake");
                    if (position < 0) {
                        position = 0;
                        System.out.println("Player restart from zero: ");
                    }
                    System.out.println("position for the player after the Snake is : " + position);
                    break;

                case 2:
                    System.out.println("No play");
                    System.out.println("Position of the player remains same");
                    break;
            }
        }
    }
}
