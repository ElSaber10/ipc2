package ipc2.Juegos.Ahorcado;

import java.util.Scanner;

public class AhorcadoJugabilidad {

    public static void funciones( Scanner scanner, String palabra) {
         // Create a counter to keep track of the number of incorrect guesses.
     int incorrectGuesses = 0;

     // Start the game.
     while (incorrectGuesses < 8) {
      
         char letter = scanner.next().charAt(0);
 
         String displayedWord = "";
         for (int i = 0; i < palabra.length(); i++) {
            displayedWord += "_";
            }
    
     
         // Check if the letter is in the word.
         boolean found = false;
         for (int i = 0; i < palabra.length(); i++) {
             if (palabra.charAt(i) == letter) {
                 displayedWord = displayedWord.substring(0, i) + letter + displayedWord.substring(i + 1);
                 found = true;
             }
         }
 
         // If the letter is not in the word, draw a part of the hangman.
         if (!found) {
             System.out.println("The letter " + letter + " is not in the word.");
             incorrectGuesses++;
         }
 
         // If the user has guessed all the letters in the word, the user wins.
         if (displayedWord.equals(palabra)) {
             System.out.println("You win!");
             break;
         }
     }
 
     // If the user has made 6 incorrect guesses, the user loses.
     if (incorrectGuesses == 6) {
         System.out.println("You lose!");
     }
    }
    
}
