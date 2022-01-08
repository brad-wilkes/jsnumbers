import java.io;
import javax.swing.*;
import java.util.Random;
import java.util.Scanner;


 public static boolean guessMath(Scanner input, int answer) {
        boolean correct = false;
        int numTries = 0;
        do {
            System.out.print(String.format("Guess %d: ", ++numTries));
            int guess = Integer.parseInt(input.nextLine());
            if (guess < MIN_VALUE) {
                System.out.println(String.format("Guess %d is below minimum %d", guess, MIN_VALUE));
            } else if (guess > MAX_VALUE) {
                System.out.println(String.format("Guess %d is above maximum %d", guess, MAX_VALUE));
            } else if (guess < answer) {
                System.out.println(String.format("Guess %d is too low. Try again.", guess));
            } else if (guess > answer) {
                System.out.println(String.format("Guess %d is too high. Try again.", guess));
            } else {
                System.out.println("Woo hoo!  You got it right!");
                correct = true;
                break;
            }
        } while (numTries < MAX_TRIES);
        return correct;