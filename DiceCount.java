/*Report the number of times the dice was played to win the game
and also the position after every die role*/

package com.bridgelabz.com;

public class DiceCount {
    public static void main(String[] args) {
        System.out.println("Player Exact Winning Position is: ");

        int EXACT_POSITION = 100;
        int position = 0;
        int count = 0;
        while (position < EXACT_POSITION) {


            int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("DiceNumber is : " + dice);

            int option = (int) Math.floor(Math.random() * 10) % 2;
            System.out.println("Selected player option : " + option);

            switch (option) {
                case 0:
                    position += dice ;
                    System.out.println("Ladder");
                    if (position > 100) {
                        position -= dice;
                    }
                    System.out.println("Position for the player after the ladder is : " + position);
                    break;

                case 1:
                    position -= dice;
                    System.out.println("Snake");
                    if (position < 0) {
                        position = 0;
                        System.out.println("Player restart from zero: ");
                    }
                    System.out.println("Position for the player after the Snake is : " + position);
                    break;

                case 2:
                    System.out.println("No play");
                    System.out.println("Position of the player remains same");
                    break;
            }
            count++;
            System.out.println("The number of times dicerolled : " + count);
        }

    }
}
