package ControlStatements;

import java.util.Scanner;

public class RepetitionClass {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int input;

        System.out.println("Enter a non primitive integer");
        System.out.println("Or negative to exit");
        input = keyboard.nextInt();

//        int count = 0;

//        while (count < 10) {
//            System.out.println(count);
//            count++;
//        }
//        int counter2 = 0;
//        do {
//            System.out.println(counter2);
//            counter2++;
//        }
//        while (counter2 < 10);
//
//        for(int i = 0;i < 10;i++){
//            System.out.println(i);
//        }
        while (input >= 0) {
            System.out.println("Enter a non primitive integer");
            System.out.println("Or negative to exit");
            input = keyboard.nextInt();
        }
        System.out.println("Done");

    }// end while loop
}
