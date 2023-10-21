package ControlStatements;
import java.util.Scanner;
public class SumClass {
    public static void main(String[] args){
        int input;
        int sum = 0;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter a non negative number");
        System.out.println("or please enter a negative number to exit");
        input = keyboard.nextInt();

        while( input >= 0){
           sum += input;
            System.out.println("Please enter a non negative number");
            System.out.println("or please enter a negative number to exit");
            input = keyboard.nextInt();
        }
        System.out.println("the is sum is:  " + sum);



    }
}
