package app;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int chips = 100;

        boolean continueBetting = true;

        String bets[] = new String[10];
        int betValues[] = new int[10];

        for (int i = 0; i < 10; i++) {

            if (continueBetting == true) {

                System.out.println("Would you like to make an inside or an outside bet?");

                String betType = input.nextLine();

                if (betType.equals("inside")) {
                    System.out.println("What humber would you like to bet on?");
                    bets[i] = input.nextLine();
                    System.out.println("How much would you like to bet on " + bets[i]);
                    betValues[i] = input.nextInt();
                    input.nextLine();

                    System.out.println("You bet $" + betValues[i] + " on " + bets[i]);

                }

                else if (betType.equals("outside")) {
                    System.out.println("Would you like to bet on Red, Black, Even, or Odd?");
                    bets[i] = input.nextLine();
                    System.out.println("How much would you like to bet on " + bets[i]);
                    betValues[i] = input.nextInt();
                    input.nextLine();

                    System.out.println("You bet $" + betValues[i] + " on " + bets[i]);

                }

                else {
                    System.out.println("invalid bet type");
                }

                System.out.println("Would you like to make another bet?");
                System.out.println("You have " + (10 - i - 1) + " bets remaining");
                String answer = input.nextLine();

                if (answer.equals("yes")) {
                    continueBetting = true;
                } else {
                    continueBetting = false;
                }
            }

        }

        int rolledNumber = rand.nextInt(37);

        for 




    }
}