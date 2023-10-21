package ControlStatements;
import java.util.Scanner;
public class FraternityClass {
    public static void main(String[] args){
        int age;
        char gender;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter your age");
        age = keyboard.nextInt();
        keyboard.nextLine();
        System.out.println("Enter your gender");
        gender = keyboard.next().charAt(0);
        if( age >= 19 && (gender == 'M' || gender == 'm')){
            System.out.println("You are eligible to join the fraternity");
        }
        else {
            System.out.println("you are not eligible");
        }
    }
}
