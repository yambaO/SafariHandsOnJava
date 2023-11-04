package Methods;

import java.util.ArrayList;

public class Proj6_1_SumElements {
    public static void main(String[] args){
     ArrayList <Integer> someList = new ArrayList();
     someList.add(22);
     someList.add(121);
     someList.add(55);
     someList.add(10);

     int result = sumElements(someList);
     System.out.println(result);
    }
    public static int sumElements(ArrayList<Integer> sumElements){
        int sum = 0;
        int n = sumElements.size();
        for(int i = 0; i < n; i++){
             sum += sumElements.get(i);
        }
        return sum;
    }
}
