package week1day3.P2Game;

import java.util.Random;

public class GuessingGame {
    private int answer;
    private final Random randomGenerator;
    private boolean gameOver;
    private int differential;
    private int max;//maximum value of the number to guess.E.g.[0, 100]
    private int maxGuessesAllowed;
    private int numGuessesTaken;

    public GuessingGame() {
        this.randomGenerator = new Random();
        this.max = 0;
    }

    public GuessingGame(int max) {
        this.max = max;
        this.randomGenerator = new Random();
    }

    public void newGame(int maxGuessesAllowed){
        this.maxGuessesAllowed = maxGuessesAllowed;
        this.answer = randomGenerator.nextInt(this.max + 1);
//        System.out.println("Answer is: " + this.answer + ".");
        this.gameOver = false;
        this.differential = this.max;
        this.numGuessesTaken = 0;
    }

    public void guess(int newGuess){
        this.numGuessesTaken++;
        if(this.numGuessesTaken > this.maxGuessesAllowed){
            this.gameOver = true;
            System.out.println("You have taken too many guesses! Game is over.");
            return;
        }
        if(newGuess > this.max){
            System.out.println("Guess out of range. The guess must be between 0 and " + this.max + ".");
            return;
        }
        if(newGuess == this.answer){
            System.out.println("Congratulation!");
            System.out.println();
            gameOver = true;
            return;
        }else if(newGuess > this.answer){
            System.out.println("Too high.");
        }else{
            System.out.println("Too low.");
        }
        if(Math.abs(newGuess - this.answer) > this.differential){
            System.out.println("Getting Colder");
        }else if(Math.abs(newGuess - this.answer) < this.differential){
            System.out.println("Getting Warmer");
        }
        this.differential = Math.abs(newGuess - this.answer);
        System.out.println();
    }

    public boolean isGameOver(){
        return this.gameOver;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    public int getDifferential() {
        return differential;
    }

    public void setDifferential(int differential) {
        this.differential = differential;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMaxGuessesAllowed() {
        return maxGuessesAllowed;
    }

    public void setMaxGuessesAllowed(int maxGuessesAllowed) {
        this.maxGuessesAllowed = maxGuessesAllowed;
    }

    public int getNumGuessesTaken() {
        return numGuessesTaken;
    }

    public void setNumGuessesTaken(int numGuessesTaken) {
        this.numGuessesTaken = numGuessesTaken;
    }
}
