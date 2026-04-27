/**
        * File: ProblemSet unit 4
        * Author: Mansoor Muhammad
        * Date Created: April 23, 2026
        * Date Last Modified: April 27, 2026
        */

import java.util.Random;//imports Input and Random
import java.util.Scanner;

public class ProblemSet {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the High Low Guessing Game.");// Welcomes the user

        int rounds = 0;
        boolean validRounds = false;

        while (!validRounds) { 
            System.out.print("Input a number of rounds to play: ");

            if (scanner.hasNextInt()) { //checks input for only integer numbers and rounds left
                rounds = scanner.nextInt();
                if (rounds > 0) {
                    validRounds = true;
                } else {
                    System.out.println("Invalid Input!");
                }
            } else {
                System.out.println("Invalid Input!");
                scanner.next();
            }
        }

        int score = 0;

        for (int i = 1; i <= rounds; i++) {
            System.out.println("\nRound " + i + ":");

            int choice = 0;
            boolean validChoice = false;

            while (!validChoice) {  
                System.out.println("\nPlease select High, Low or Even:");// displays choices
                System.out.println("1. High (11 to 20)");
                System.out.println("2. Low (0 to 9)");
                System.out.println("3. Even (10)");

                if (scanner.hasNextInt()) {//
                    choice = scanner.nextInt();
                    if (choice >= 1 && choice <= 3) {
                        validChoice = true;
                    } else {
                        System.out.println("\nInvalid Input!");
                    }
                } else {
                    System.out.println("\nInvalid Input!");
                    scanner.next();
                }
            }

            int number = random.nextInt(21);

            boolean correct = false;

            if (choice == 1 && number >= 11 && number <= 20) {
                correct = true;
            } else if (choice == 2 && number >= 0 && number <= 9) {
                correct = true;
            } else if (choice == 3 && number == 10) {
                correct = true;
            }

String result;
if (correct){
       result = "correct";
}

else {result = "incorrect";}
       

               
               
            System.out.println("\nThe number was " + number + ". You were " + result)
            if (correct) {
                score = score + 1;
            }

            System.out.println("Current Score: " + score);
        }

        System.out.println("\nTotal Score: " + score);

        if (score >= rounds / 2.0) {
            System.out.println("Congratulations you got " + score + " out of " + rounds + " rounds right!");
        } else {
            System.out.println("Better luck next time! You got " + score + " out of " + rounds + ".");
        }
    }
}
