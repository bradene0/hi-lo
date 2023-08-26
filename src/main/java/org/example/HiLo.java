package org.example;

import java.util.Scanner;
import java.util.Random;

public class HiLo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


       /* System.out.println("Choose a difficulty level! h for hard, m for medium, or e for easy!");

            String choice = scanner.nextLine();

        switch (choice) {
            case "h" -> {
                int maxAttempts = 5;
                System.out.println("Expert Mode! 5 Attempts! Good Luck!");
            }
            case "m" -> {
                int maxAttempts = 10;
                System.out.println("Medium! 10 Attempts! You got this!!!");
            }
            case "e" -> {
                int maxAttempts = 20;
                System.out.println("Easy Mode! 20 attempts!");
            }
            default -> {
                int maxAttempts = 1;
                System.out.println("Default mode! Must be feeling lucky! 1 Attempt!");
            }
        }
*/
        int maxAttempts = 15;
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        System.out.println("Welcome to the number guessing game! you have 15 tries!");
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            System.out.print("Attempt " + attempt + "/" + maxAttempts + ": Enter your guess: ");
            int guess = scanner.nextInt();

            if (guess < randomNumber) {
                System.out.println("Too low!");
            } else if (guess > randomNumber) {
                System.out.println("Too high!");
            } else {
                System.out.println("Congratulations! You guessed the number.");
                break;
            }
        }

        System.out.println("The correct number was: " + randomNumber);
        System.out.println("Game over!");

        scanner.close();
    }
}