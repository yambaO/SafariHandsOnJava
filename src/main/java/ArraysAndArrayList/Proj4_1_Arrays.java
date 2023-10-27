package ArraysAndArrayList;
import java.util.Scanner;
public class Proj4_1_Arrays {
    public static void main(String[] args){
        int input;
        int[] arrayMultiplier = new int[5];
        Scanner keyboard = new Scanner(System.in);

        for(int i = 0; i < arrayMultiplier.length; i++){
            System.out.print("Please enter a number: \t");
            input = keyboard.nextInt();
            arrayMultiplier[i] = input * 2;
        }
        for(int multiplyValue : arrayMultiplier){
            System.out.println("the result is : " + multiplyValue);
        }

    }
}
