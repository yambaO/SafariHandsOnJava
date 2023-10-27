package ArraysAndArrayList;

import java.util.ArrayList;

public class WrapperClass {
    public static void main(String[] args){
        ArrayList<Integer> myAl = new ArrayList<>();
        myAl.add(10);
        myAl.add(22);
        for( Integer number : myAl){
            System.out.println(number);
        }
        String someValue = "450";
        int numericValue = Integer.parseInt(someValue);
        numericValue +=10;
        System.out.println(numericValue);

        String value = "3.14159";
        double numValue = Double.parseDouble(value);
        System.out.println(numValue);
    }
}
