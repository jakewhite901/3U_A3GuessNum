/*
*Jake White
*Assignment started November 23, 2021
*This is a random number generator where the user can guess the number! The user will have 5 guesses to correctly predict the number that the computer chooses.
*/

import java.util.*;

public class A3GuessNum {
  
  
  public static void main(String[] args){

    Scanner input = new Scanner(System.in); // scanner
    Random numGenerator = new Random(); // random generator
    int numberOfGuesses = 0; // number of tries so far
    int state = 1; // changes the state of the program; 0 state = program is not in operation, 1 state = program in operation
    int answer = numGenerator.nextInt(101); // random number that the program generates
    final int maximumGuesses = 5; // maximum number of guesses allowed
    boolean correctGuess = false; // user has made the correct guess
    // the above section of the code defines variables

      System.out.println("Welcome to the World's Greatest Random Number Generator!!"); // a title that prints at the very beginning of the program for aesthetic purposes

      // the above section of the code allows the user to input their guess
      while (!correctGuess || numberOfGuesses < 5) {
       if (state == 1) {
          System.out.print("Enter a number from 0-100: ");
          int guess = input.nextInt();  
          numberOfGuesses++;

        // if the user inputs the correct guess, a unique message is printed for how many tries it took to get the number, and asks the user if they would like to play again
      if (guess == answer) {
        correctGuess = true;
        System.out.println("\nYou win!!");
        System.out.println("The correct number to guess was " + answer + "!");
        if (numberOfGuesses == 1) {
          System.out.println("Awesome! You guessed the number right away!");
        } else if (numberOfGuesses == 2) {
          System.out.println("Two guesses isn't bad! Try getting it in one guess next time!");
        } else if (numberOfGuesses == 3) {
          System.out.println("Three guesses is pretty good! See if you can go for less next time!");
        } else if (numberOfGuesses == 4) {
          System.out.println("Four guesses? You can do better! Try again, and see if you can get it in less guesses!");
        } else if (numberOfGuesses == 5) {
          System.out.println("It took you five guesses? I know for a FACT that you can do better! Keep at it!");
        } 
        System.out.println("\nDo you want to play again?");
        state = 0;
        } // close bracket for if statement

        // if guess is too low, program will tell you to guess higher
        else if (guess < answer) {
          System.out.println("\nYou're too low! Try guessing a higher number!");
          }
        
        // if guess is too high, program will tell you to guess lower
        else if (guess > answer) {
          System.out.println("\nYou're too high! Try guessing a lower number!");
          }

        // hints that are given depending on how close the user is to the number
        if (guess < 25 && answer < 25 && guess != answer) {
          System.out.print("The correct number is between 0 and 25!\n");
        } else if (guess >= 25 && guess <= 50 && answer >= 25 && answer <= 50 && guess != answer) {
              System.out.print("Good guess! The answer is between 25 and 50!\n");
        } else if (guess >= 50 && guess <= 75 && answer >= 50 && answer <= 75 && guess != answer) {
              System.out.println("Good guess! The answer is between 50 and 75!\n");
        } else if (guess > 75 && answer > 75 && guess != answer) {
              System.out.println("The correct number is between 75 and 100!\n");
        } 
        
        //lose statement if the user guesses too many times
        if (numberOfGuesses >= 5 && guess != answer) {
          System.out.println("\nYou lose! Better luck next time!");
          System.out.println("Do you want to play again? ");
          state = 0;
        } 
      } // close bracket for if statement on line 27

      if (state == 0) {
        String ans = input.nextLine();
        if(ans.toLowerCase().equals("yes")) {
          answer = numGenerator.nextInt(101);
          numberOfGuesses = 0;
          state = 1;
        } else if(ans.toLowerCase().equals("no")) {
          System.out.println("Thanks for playing! Play my game again sometime!");
            try
            {
              Thread.sleep(1000);
            }
              catch(InterruptedException ex)
            {
              Thread.currentThread().interrupt();
            }
          break;
          // if user says yes to playing again, code restarts, if player says no, code stops completely

          // extra part of the program, secret phrase that does something cool if you type it in the line for playing again
        } if(ans.toLowerCase().equals("jake is awesome")) {
          System.out.println("Wow, you found the secret phrase! You win a free pack of Oreos!");
            try
            {
              Thread.sleep(1000);
            }
              catch(InterruptedException ex)
            {
              Thread.currentThread().interrupt();
            } // try-catch code string for pauses in the program
          System.out.println("NOTE: The Oreos are not actually real.");
            try
            {
              Thread.sleep(1000);
            }
              catch(InterruptedException ex)
            {
              Thread.currentThread().interrupt();
            } // try-catch code string
          System.out.println("Thanks for finding this small part of my program! Good job!");
            try
            {
              Thread.sleep(1000);
            }
              catch(InterruptedException ex)
            {
              Thread.currentThread().interrupt();
            } // try-catch code string
          break;
        } // close bracket for else if statement on line 101
      } // close bracket for if statement on line 82
    } // close bracket for while statement on line 26
  } // close bracket for main method on line 12
} // close bracket for RNG class on line 9