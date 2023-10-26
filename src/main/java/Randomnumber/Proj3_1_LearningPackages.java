package Randomnumber;
import java.util.Scanner;
public class Proj3_1_LearningPackages {
    public static void main (String[] args){
        String packageName;
        int numberOfCoursesEnrolled;
        int totalPrice;
        int baseCost;
        int costPerCourse;
        int numIncluded;
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Which package do you have? 1 , 2 or 3:\t");
        packageName = keyboard.nextLine();
        System.out.print("How many courses did you enrolled in this month? \t");
        numberOfCoursesEnrolled = keyboard.nextInt();
        switch (packageName){
            case "1":
                baseCost =10;
                costPerCourse = 6;
                numIncluded = 2;

                totalPrice = ((numberOfCoursesEnrolled - numIncluded ) * costPerCourse) + baseCost;
                System.out.println("The total price for learning package 1 this month is: " + "$" + totalPrice);
                break;
            case "2":
                baseCost =12;
                costPerCourse = 4;
                numIncluded = 4;
                totalPrice = ((numberOfCoursesEnrolled - numIncluded )* costPerCourse) + baseCost;
                System.out.println("The total price for learning package 2 this month is: " + "$" + totalPrice);
                break;
            case "3":
                baseCost =15;
                costPerCourse = 3;
                numIncluded = 6;
                totalPrice = ((numberOfCoursesEnrolled - numIncluded ) * costPerCourse) + baseCost;
                System.out.println("The total price for learning package 3 this month is: " + "$" + totalPrice);
                break;
            default :
                System.out.println("You have entered an invalid package");
        }
    }
}
