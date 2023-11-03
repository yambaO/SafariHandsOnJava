package ArraysAndArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class Proj4_2_ArrayLists {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Double> reverseArraylist = new ArrayList<>();
        double input;
        System.out.print("Please enter number or -1 to exit: \t");
        input = keyboard.nextDouble();

        while (input >= 0) {
            reverseArraylist.add(input);
            System.out.print("Please enter number or -1 to exit: \t");
            input = keyboard.nextDouble();

        }
        for (int i = reverseArraylist.size() - 1; i >= 0; i--) {

            System.out.println(reverseArraylist.get(i));

        }
    }
}
