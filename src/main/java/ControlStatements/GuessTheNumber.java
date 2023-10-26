package ControlStatements;
import java.util.Scanner;
import java.util.Random;
public class GuessTheNumber {
    public static void main(String[] args){
        int computerNumber;
        int numberGuessed;
        Scanner keyboard = new Scanner(System.in);
        Random number = new Random();
        computerNumber = number.nextInt(100)+ 1;
        //        System.out.println("Computer number is : " + computerNumber);

        for(int i = 1; i > 0; i++){
            System.out.println("Please guess a number : \t");
            numberGuessed = keyboard.nextInt();

            if(numberGuessed == computerNumber){
                System.out.println("You guessed the right number in " + i + " guesses! Thanks for playing");
                break;
            }
            else if(numberGuessed < computerNumber && numberGuessed >= 0) {
                System.out.println("number too low");
            }
            else if(numberGuessed > computerNumber && numberGuessed <= 100){
                System.out.println("number too high");
            }
            else {
                System.out.println("That was a wasted guess ! Pick a number between 1 and 100, inclusive!");
            }
        } // end of for loop


    }
}
