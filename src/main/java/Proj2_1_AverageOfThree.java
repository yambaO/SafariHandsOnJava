import java.util.Scanner;
public class Proj2_1_AverageOfThree {
    public static void main( String [] args){
        Scanner keyboard = new Scanner(System.in);
        double realNumber1;
        double realNumber2;
        double realNumber3;
        double mean;
        System.out.println("Please enter number one");
        realNumber1 = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Please enter number two");
        realNumber2 = keyboard.nextDouble();
        keyboard.nextLine();
        System.out.println("Please enter  realNumber3");
        realNumber3 = keyboard.nextDouble();
        mean = (realNumber1 + realNumber2 + realNumber3) / 3;
        System.out.println(" The mean number is : " + mean);
    }
}
