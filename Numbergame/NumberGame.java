import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // taking random entry
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        //System.out.println("Random number is " + randomNumber);

        // exicution starts
        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println("well " + name + " GAME STARTS (but remember you have only 5 chances to find the number)");

        //Score counting
        int tries = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println(" Think a number between 1 to 100:-");
            int guess = sc.nextInt();
            tries++;
            if (randomNumber==guess) {
                System.out.println("wow! you get it");
                System.out.println("it takes " + tries + " tries");
                break;
            } else if (randomNumber > guess) {
                System.out.println("nope! Choose a higher number. Guess again.");
            } else {
                System.out.println("nope! Choose a lower number. Guess again.");
            }

        }
       // sc.close();
    }
    }