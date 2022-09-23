/*The Player rolls the die to get a number between 1 to 6. - Use ((RANDOM)) to get the
number between 1 to 6*/

package com.bridgelabz.com;
public class RollsTheDie {
    public static void main(String[] args) {
        RollsTheDie a = new RollsTheDie();
        a.rollDie();

        }
        public void rollDie(){
            int die = (int) Math.floor(Math.random() * 10) % 6 + 1;
            System.out.println("Die value is " + die);
        }
    }

