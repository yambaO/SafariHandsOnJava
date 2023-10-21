import java.util.Scanner;
public class Proj2_2_MadLibsClone {
    public static void main( String [] args){
        Scanner keyboard = new Scanner(System.in);
        String adjective1;
        String girlName;
        String adjective2;
        String occupation1;
        String place;
        String clothing;
        String hobby;
        String adjective3;
        String occupation2;
        String boysName;
        String manName;

        System.out.println("Enter adjective:\t");
        adjective1 = keyboard.nextLine();
        System.out.println("Enter girl name:\t");
        girlName = keyboard.nextLine();
        System.out.println("Enter adjective:\t");
        adjective2 = keyboard.nextLine();
        System.out.println("Enter occupation:\t");
        occupation1 = keyboard.nextLine();
        System.out.println("Enter place:\t");
        place = keyboard.nextLine();
        System.out.println("Enter clothing:\t");
        clothing = keyboard.nextLine();
        System.out.println("Enter hobby:\t");
        hobby = keyboard.nextLine();
        System.out.println("Enter adjective:\t");
        adjective3 = keyboard.nextLine();
        System.out.println("Enter occupation:\t");
        occupation2 = keyboard.nextLine();
        System.out.println("Enter boy name:\t");
        boysName = keyboard.nextLine();
        System.out.println("Enter man name:\t");
        manName = keyboard.nextLine();

        System.out.println("There once was a " + adjective1 + " girl named " + girlName + " who");
        System.out.println("was a " + adjective2 + " "+ occupation1 + " in the Kingdom of " + place + ".");
        System.out.println("She loved to wear " + clothing + " and to " + hobby + ". She wanted to");
        System.out.println("marry the " + adjective3 + " " + occupation2 + "named " + boysName + " but her");
        System.out.println("father, king " + manName + "forbid her from seeing him.");

    }
}
