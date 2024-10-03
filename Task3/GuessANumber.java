import java.util.Random;
import java.util.Scanner;  

public class GuessANumber {
    private static int rnd_number;
	
    public static void main(String[] args) {
        // pick a random number
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
	System.out.println( "Can you guess what it is?...");
        makeAGuess();
    }


    private static void makeAGuess(){
	// Create a Scanner object 
    Scanner scan = new Scanner(System.in);
   

    // use hasNextDouble to check if input is numeric, if so... Read user input.
    // Compare it with the random number
    if (scan.hasNextDouble()){
        int guess = Integer.parseInt(scan.nextLine());

            if (guess == rnd_number){
                System.out.println("You guessed it!");
            } else if (guess < rnd_number){
                System.out.println("No. Guess higher.");
                makeAGuess();
            } else if (guess > rnd_number){
                System.out.println("No. Guess lower.");
                makeAGuess();
            } else if (scan.hasNextDouble()) {
                System.out.println("Please write a number between 0-100.");
            makeAGuess();
        }
        } else{
        System.out.println("Please write a number between 0-100.");
        makeAGuess();
    }
}

        // Let the user know the result of the comparison
        // Let the user try again by calling this method recursively
        // Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively
    
}
}