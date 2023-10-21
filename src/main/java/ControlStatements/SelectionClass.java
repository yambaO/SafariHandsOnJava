package ControlStatements;
import java.util.Scanner;
public class SelectionClass {
    public static void main(String[] args){
        int age;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the Pub and Grille");
        System.out.println("What is your age?");
        age = keyboard.nextInt();
        if(age >= 21) {
            System.out.println("Have a beer");
        }
        else if ( age >= 16){
            System.out.println("here have a Coke!");
            System.out.println("At least you can drive");
        }
        else {
            System.out.println("have a cook");
        }
        System.out.println("Thank you for coming to the Pub and Grille");
    }
}
