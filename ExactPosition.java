/*Ensure the player gets to exact winning position 100. - Note in case the player position go above
100, the player stays in the same previous position till the player gets the exact
number that adds to 100 */

package com.bridgelabz.com;

public class ExactPosition {
    public static void main(String[] args) {
        System.out.println("Player Exact Winning Position is: ");

        int EXACT_POSITION = 100;
        int position = 0;

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
        }
    }
}
