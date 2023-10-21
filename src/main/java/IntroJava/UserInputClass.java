package IntroJava;

import java.util.Scanner;
public class UserInputClass {
    public static void main (String[] args){
        Scanner Keyboard = new Scanner(System.in);
        String name;
        int age;
        String city;
        double realNumber;

        System.out.println("What is your name?");
        name = Keyboard.nextLine();
        System.out.println("What is your age?");
        age =  Keyboard.nextInt();
        Keyboard.nextLine();
        System.out.println("What is the real number?");
        realNumber = Keyboard.nextDouble();
        Keyboard.nextLine();
        realNumber *= 2;
        System.out.println("What is the city where you live?");
        city = Keyboard.nextLine();

        System.out.println("Hello, " + name );
        System.out.println(" Age is " + age);
        System.out.println("the real number is " + realNumber);
        System.out.println("my city is "+ city);
    } //end main
}
