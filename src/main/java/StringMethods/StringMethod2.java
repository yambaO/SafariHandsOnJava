package StringMethods;

public class StringMethod2 {
    public static void main(String[] args) {
        String myName = "John Baugh";
        String upper = myName.toUpperCase();
        String lower = myName.toLowerCase();
        int whereIsB = myName.indexOf("B");
        String lastName = myName.substring(5);
        System.out.println("upper is " +  upper);
        System.out.println("lower is " +  lower);
        System.out.println("whereIsb is " +  whereIsB);
        System.out.println("lastName is " +  lastName);

    }
}