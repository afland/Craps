/**
 * The Craps.java runs an interactive main program that allows the user to play Craps
 *
 * @author landerera
 * @version 1-19-2022
 */

import java.util.Scanner;

public class Craps {
    /**
     * Plays the interactive game Craps
     * @param args
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Would you like to play a game of craps? (Y/n) ");
        String play = in.nextLine();
        if (!play.equalsIgnoreCase("n"))
        {
            System.out.print("Do you need instructions on how to play the game? (y/N) ");
            if (in.nextLine().equalsIgnoreCase("y"))
            {
                System.out.println(
                    "1. A player rolls two six-sided dice and adds the numbers rolled together.\n" +
                    "2. On this first roll, a 7 or an 11 automatically wins, and a 2, 3, or 12 automatically loses, and play is\n" + 
                    "over. If a 4, 5, 6, 8, 9, or 10 are rolled on this first roll, that number becomes the \"point.\"\n" +
                    "3. The player continues to roll the two dice again until one of two things happens: either they roll the\n" +
                    "\"point\" from that first roll again, in which case they win; or they roll a 7, in which case they lose."
                );
            }
        }
        while (!play.equalsIgnoreCase("n"))
        {
            Die role = new Die();
            System.out.print("(press enter to role) ");
            in.nextLine();
            int point = role.roleTwo();
            if (point == 7 || point == 11) 
            {
                System.out.println("Congratulations! You rolled a " + point + " and won on your 1st role");
            }
            else if (point == 2 || point == 3 || point == 12)
            {
                System.out.println("Oops! You rolled a " + point + " and lost on your 1st role");
            }
            else { // if first role didn't immediately end the game (win or lose)
                System.out.println("You rolled a " + point + " as your point");
                while (true) {
                    System.out.print("(press enter to role again) ");
                    in.nextLine();
                    int currentRole = role.roleTwo();
                    if (currentRole == 7) {
                        System.out.println("You rolled a 7 and lost");
                        break;
                    }
                    else if (currentRole == point) {
                        System.out.println("Congratulations! You rolled a " + currentRole + ", your point");
                        break;
                    }
                    else {
                        System.out.println("You rolled a " + currentRole);
                    }
                }
            }
            System.out.print("Would you like to play again? (Y/n) ");
            play = in.nextLine();
        }
    }
}

/*

COMMENTS FROM THE INSTRUCTOR:

Wow. Anton. Outstanding work on this. You correctly implemented all the rules of the 
game, and I was especially happy to see that you included the "default Yes/No" feature
as described in the handout--it made it SO MUCH EASIER to play the game. You didn't annoy
with repeated questions about sseeing the rules, and you had good default answers, 
which encouraged me to keep playing.

Two issues. 1) In Craps.java, you didn't import java.util.Scanner, so the game wouldn't
even compile at first. Is there something you have in your development environment that
automatically imports utilities like that for you? 2) When I quit the game, you didn't
say "goodbye." It's a little thing, but acknowledging that things have concluded is
important. Next time!

Overall, *very* well done. Thank you!

SCORE: 49/50

*/

