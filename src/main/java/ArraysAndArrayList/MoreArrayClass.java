package ArraysAndArrayList;

public class MoreArrayClass {
    public static void main(String[] args){
        int[] array;
        array = new int[10];

        for(int i = 0; i < array.length; i++){
            array[i] = i +1;
            System.out.println(array[i] );
        }
        for (int element : array){
            System.out.println(element);
        }
    }
}
