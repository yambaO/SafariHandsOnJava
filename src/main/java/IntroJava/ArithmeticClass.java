package IntroJava;

public class ArithmeticClass {
    public static void main (String[] Args){
        int a = 10;
        int b = 15;

       // binary operators
        int result = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a;
        System.out.println("Result is  " + result);
        System.out.println("Difference  is  " + difference);
        System.out.println("product is  " + product);
        System.out.println("quotient is " + quotient);
        System.out.println("Quotient is " + remainder);

        result += 20; // result = result + 20
        System.out.println("Result is now " + result);

        product *= 2; // product = product * 2

        System.out.println("Product is now " + product);

        // unary operators
        result ++; // result = result + 1
        System.out.println("Result++ is " + result);

        result --; // result = result - 1
        System.out.println("Result-- is " + result);

    }
}
