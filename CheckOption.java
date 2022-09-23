/*The Player then checks for a Option. They are No Play,
Ladder or Snake. - Use ((RANDOM)) to check for Options - In Case of No Play the player stays in the same
position
- In Case of Ladder the player moves ahead by the number of position received in the die
- In Case of Snake the player moves behind*/

package com.bridgelabz.com;
public class CheckOption {
    public static void main(String[] args) {
        int position = 0;

        int dice = (int) Math.floor(Math.random() * 10) % 6 + 1;
        System.out.println("DiceNumber is : " + dice);

        int option = (int) Math.floor(Math.random() * 10) % 3;
        System.out.print("Player option is : ");

        switch (option) {
            case 0:
                position += dice;
                System.out.println("Ladder");
                System.out.println("Position of the player after the ladder is : " + position);
                break;

            case 1:
                position -=  dice;
                System.out.println("Snake");
                System.out.println("Position of the player after the Snake is : " + position);
                break;

            case 2:
                System.out.println("No play");
                System.out.println("Position of the player remains same");
                break;
        }
     }
}
