import java.util.Random;
import java.util.Scanner;

public class NumberGuessing {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        int num = rand.nextInt(10);

        int count = 3;
        while(count != 0){
            System.out.print("Enter your guess: ");
            int guess = input.nextInt();
            
            if(guess < num) {
                System.out.println("Too low");
            }    else if(guess > num) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct guess!");
                break;
            }
            
            count--;
            if(count == 0) 
                System.out.println("You lose!");
        }
    }
}