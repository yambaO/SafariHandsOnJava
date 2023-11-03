package ArraysAndArrayList;
import java.util.Scanner;
import java.util.ArrayList;
public class Proj4_3_Parallel {
    public static void main(String[] args){
        String inputName;
        int inputAge;
        Scanner keyboard = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();
        for(int i = 0 ; i < 5 ; i ++ ){

            System.out.println("Please enter your name");
            inputName = keyboard.next();
            System.out.println("please enter your age");
            inputAge = keyboard.nextInt();
            names.add(inputName);
            ages.add(inputAge);
        }
        for(int i = names.size() -1 ; i >= 0 ; i--) {

                System.out.println(names.get(i) + " is " + ages.get(i) + " years old");

        }
    }  // end of main
}

