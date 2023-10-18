package week1day3.P2Game;

import java.util.Scanner;

public class GuessingGameTester {
    public void playing(){
        boolean gameFlag = true;
        while(gameFlag){
            System.out.println("Welcome to the Guessing Game");
            System.out.println("Enter the maximum number");
            Scanner scanner = new Scanner(System.in);
            int max = scanner.nextInt();
            System.out.println("Enter the number of guess allowed:");
            int maxGuessesAllowed = scanner.nextInt();
            GuessingGame guessingGame = new GuessingGame(max);
            guessingGame.newGame(maxGuessesAllowed);
            boolean guessFlag = false;
            while (!guessFlag){
                System.out.println("Enter your guess, remember it must be between 0 and " + max + ".");
                int newGuess = scanner.nextInt();
                guessingGame.guess(newGuess);
                guessFlag = guessingGame.isGameOver();
            }
            System.out.println("Would you like to play again, enter Y for yes, N for no.");
            String playAgainString = scanner.next();
            if(playAgainString.equals("N")){
                gameFlag = false;
            }
        }
    }
}
