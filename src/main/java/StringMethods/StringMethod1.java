package StringMethods;

public class StringMethod1 {
    public static void main(String[] args) {
        String name = "John baugh";
        String name2 = "John baugh";
        String name3 = "Rob percival";
        String name4 = "Mike hallen";

        for (int i = 0; i < name.length(); i++) {
            System.out.print(name.charAt(i) + " ");
        }
        System.out.println();
        if (name.equals(name2)) {
            System.out.println(" name are equal");
        } else {
            System.out.println("names are not equal");
            System.out.println();
        }
        if (name.compareTo(name3) > 0) {
            System.out.println("name > name3");
        }
        else{
            System.out.println("name<= name3");
        }
        System.out.println();
        if(name.equals(name4)){
            System.out.println( " name is equal to name4");
        }
        else {
            System.out.println("name is not equal to name4");
        }
        System.out.println();
        if(name3.compareTo(name4) > 0){
            System.out.println("name3 > name4 ");

        }
        else{
            System.out.println("name3 <= name4");
        }
    }
}