package SortString;

import java.util.Arrays;

public class BubbleSortString {
    public static void main(String[] args) {
    String[] countries = {"Zimbabwe", "South-Africa", "India", "America", "Yugoslavia", " Australia", "Denmark", "France", "Netherlands", "Italy", "Germany"};
    SortCountries(countries);
    }

    public static void SortCountries(String[] arrayCountries) {
        for (int i = arrayCountries.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if(arrayCountries[j].compareTo(arrayCountries[j+1])> 0){
                    String temp = arrayCountries[j];
                    arrayCountries[j] = arrayCountries[j+1];
                    arrayCountries[j+1]= temp;
                }
            }
        }
        System.out.println(Arrays.toString(arrayCountries));
    }
}
