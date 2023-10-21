package ControlStatements;

public class ControlStatementsIntro {
    public static void main (String[] args){
        // Sequential control statement
        int age = 19;
        System.out.println("Your age is : " + age);

        // Selection  control statement (Decision)
        if(age >= 16) {
           System.out.println("You can drive");
       }
       else {
           System.out.println("You cannot drive yet!");

       }
       //Repetition  control statement (loops)
       System.out.println();
       for(int i = 1; i<= age; i++){
           System.out.println("Happy Birthday " + i);
       } // end of loop
    }//end main
}
