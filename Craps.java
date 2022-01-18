public class Craps {
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
    }
}
