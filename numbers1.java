import javax.swing.*;
import java.util.Random;
import java.util.Scanner;

//import guessMath.*;

public class numbers1 {

public static final int MIN_VALUE = 1;
public static final int MAX_VALUE = 100;
public static final int MAX_TRIES = 10;


public static void main(String[] args)
{
    
		// USING SCANNER CLASESS BELOW
		//guessMath game = new guessMath(); //Create instance of guessMath object
        Random generator = new Random();
        Scanner input = new Scanner(System.in);
        String playAgain;
        do {
            int answer = MIN_VALUE + generator.nextInt(MAX_VALUE);
            System.out.println(String.format("You have %d tries to guess a number between %d and %d", MAX_TRIES, MIN_VALUE, MAX_VALUE));
            boolean correct = guessMath(input, answer);
            if (!correct) {
                System.out.println(String.format("The number was %d", answer));
            }
            System.out.print("Play again? [Y/N]: ");
            playAgain = input.nextLine();
        } while ("Y".equalsIgnoreCase(playAgain));
        
        // END OF SCANNER CLASSES
        	
    //USING JPANEL AND SWING CLASSES BELOW
	/*
	JFrame f = new JFrame(); //instance of JFrame
	JButton b = new JButton("Add"); //instance of JButton
	String title = new String("Math Tool");
	b.setBounds(130,100,100,40); //set axes, w, and h
	f.add(b); //add button to the JFrame
	f.setSize(400,500); //set w then h
	f.setLayout(null); //using no layout managers
	f.setVisible(true); //making the frame visible
	
	//END OF JPANEL AND SWING CLASSES
	*/
        	
    }

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
	
}
}