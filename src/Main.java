import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String player1 = "";
        String player2 = "";

        System.out.print("\nPlayer 1 enter your move [R,P,S]: ");
        if (in.hasNextLine()) {
            player1 = in.nextLine();

            System.out.print("\nYou said your move is " + player1);
        }


        System.out.print("\nPlayer 2 enter your move [R,P,S]: ");
        if (in.hasNextLine()) {
            player2 = in.nextLine();

            System.out.print("\nYou said your move is " + player2);
        }


        if (player1.equalsIgnoreCase("R")) {
            //playerB code crossed against Player A rock move
            if (player2.equalsIgnoreCase("R")) {
                System.out.println("\nRock vs Rock It's a TIE!");
            }
            if (player2.equalsIgnoreCase("P")) {
                System.out.println("\nPaper covers Rock! Player 2 wins!");
            }
            if (player2.equalsIgnoreCase("S")) {
                System.out.println("\nRock breaks Scissors! Player 1 wins!");
            } else {
                System.out.println("\nPlayer 2 entered a wrong input");
            }
        } else if (player1.equalsIgnoreCase("P")) {
            if (player2.equalsIgnoreCase("R")) {
                System.out.println("\nPaper covers Rock! Player 1 wins!");
            }
            if (player2.equalsIgnoreCase("P")) {
                System.out.println("\nPaper vs Paper! Its a TIE!");
            }
            if (player2.equalsIgnoreCase("S")) {
                System.out.println("\nScissors cuts Paper! Player 2 wins!");
            } else {
                System.out.println("\nPlayer 2 entered a wrong input");
            }

        } else if (player1.equalsIgnoreCase("S")) {
            if (player2.equalsIgnoreCase("R")) {
                System.out.println("\nRock breaks Scissors! Player 2 wins!");
            }
            if (player2.equalsIgnoreCase("P")) {
                System.out.println("\nScissors cuts Paper! PLayer 1 wins!");
            }
            if (player2.equalsIgnoreCase("S")) {
                System.out.println("\nScissors vs Scissors! It's a TIE!");
            } else {
                System.out.println("\nPlayer 2 entered a wrong input");
            }

        } else {
            System.out.println("\nPlayer 1 entered a wrong input");
        }

    }
}
