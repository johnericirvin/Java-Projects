import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        // Number Guessing Game

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int guess;
        int attempts = 0;
        int min = 1;
        int max = 100;
        int randomNumber = random.nextInt(min, max + 1);       // second number exclusive

        System.out.println("Number Guessing Game");

        System.out.printf("Guess a number bwteen %d-%d\n", min, max);

        do{
            System.out.println("Enter a guess: ");
            guess = scanner.nextInt();
            attempts++;
            
            if(guess < randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if(guess > randomNumber){
                System.out.println("TOO HIGH Try again");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attempts " + attempts);
            }
        }while(guess != randomNumber);

        scanner.close();


        
    }
}
