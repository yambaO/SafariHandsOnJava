package Randomnumber;
import java.util.Scanner;
public class Proj3_1_LearningPackages {
    public static void main (String[] args){
        String packageName;
        int numberOfCoursesEnrolled;
        int totalPrice;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please provide the type of package you have:\t");
        packageName = keyboard.nextLine();
        System.out.print("How many courses did you enrolled? : \t");
        numberOfCoursesEnrolled = keyboard.nextInt();
        switch (packageName){
            case "Learning Package 1":
                totalPrice = (numberOfCoursesEnrolled * 6) + 10;
                System.out.println("The total price for learning package 1 this month is: " + totalPrice + "$");
                break;
            case "Learning Package 2":
                totalPrice = (numberOfCoursesEnrolled * 4) + 12;
                System.out.println("The total price for learning package 2 this month is: " + totalPrice  + "$");
                break;
            case "Learning Package 3":
                totalPrice = (numberOfCoursesEnrolled * 3) + 15;
                System.out.println("The total price for learning package 3 this month is: " + totalPrice  + "$");
                break;
            default :
                System.out.println("You have entered an invalid package");
        }
    }
}
