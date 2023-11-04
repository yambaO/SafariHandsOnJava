package StringMethods;
import java.util.Scanner;
public class NameParser {
   public static void main(String[] args){
       String fullName;
       String firstName;
       String lastName;
       int whereIsSpace;
       Scanner keyboard = new Scanner(System.in);
       System.out.println("please enter your full name");
       fullName = keyboard.nextLine();
       whereIsSpace = fullName.indexOf(" ");
       firstName = fullName.substring(0,whereIsSpace);
       lastName = fullName.substring(whereIsSpace + 1);
       System.out.println("Your first name is " + firstName.toUpperCase());
       System.out.println("Your last name is " + lastName.toLowerCase());
   }
}
