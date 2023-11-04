package StringMethods;
import java.util.ArrayList;
import java.util.Scanner;
public class Proj5_1_NamePermutations {
    public static void main (String[] args){
        String fullName;
        String firstName;
        String lastName;
        int spaceCharacter;
        ArrayList<String> firstNameArraylist = new ArrayList<>();
        ArrayList<String> lastnameArraylist= new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        for(int i = 0; i < 5; i++){
            System.out.println("Please enter your full name:");
            fullName = keyboard.nextLine();
            spaceCharacter = fullName.indexOf(" ");
            firstName = fullName.substring(0,spaceCharacter);
            lastName = fullName.substring(spaceCharacter + 1);
            firstNameArraylist.add(firstName);
            lastnameArraylist.add(lastName);
        }
//        for(int i = 0; i < firstNameArraylist.size(); i++){
//            System.out.println(firstNameArraylist.get(i) + lastnameArraylist.get(i));
//        }
        for (String name : firstNameArraylist){
            for (String lastname: lastnameArraylist ){
                System.out.println(name + " " + lastname);
            }
        }
    }
}
