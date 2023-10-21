package ControlStatements;

import java.util.Scanner;

public class GradeClass {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        char grade;
        System.out.println("Enter your grade");
        grade = keyboard.next().charAt(0);
        switch(grade){
            case 'A':
            case 'a':
                System.out.println("Great Job");
                break;
            case 'B' :
            case 'b':
                System.out.println("Good job");
                break;
            case 'C':
            case 'c':
                System.out.println("You can do better");
                break;
            case 'D':
            case 'd':
                System.out.println("You are getting pretty close");
                break;
            case 'F':
            case 'f':
                System.out.println("You are failing the course");
                break;
            default:
                System.out.println("You have entered an invalid grade");
        }
    } //end main
}
