package ControlStatements;
import java.util.Scanner;
public class DivisibleByThreeProject {
    public static void main( String[] args){
        int number;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please enter a number: \t");
        number = keyboard.nextInt();

        if(number % 3 == 0){
            System.out.println( number + " is divisible by 3");
        }
        else{
            System.out.println( number + " is not divisible by 3");
        }
    }
}
