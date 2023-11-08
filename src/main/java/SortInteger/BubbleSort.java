package SortInteger;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
     int[] sort = {2, 5, 6, 4, 7,1,8, 3};
     sortArraysInteger(sort);
    }
    public static void sortArraysInteger(int[] arr){
        for(int i = arr.length -1; i > 0 ; i--){
            for(int j = 0; j < i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
