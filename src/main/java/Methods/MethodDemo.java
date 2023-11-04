package Methods;

public class MethodDemo {
    public static void main(String[] args){
        printHello();
        printNumber(3);
        int result = giveMe10();
        System.out.println(result);
        int sum = addTheseNumber(30, 10);
        System.out.println("the sum is : " + sum);
        double squareValue = square(8.4);
        System.out.println(squareValue);
    }
    public static void printHello(){
        System.out.println("hello there!!");
    }
    public static void printNumber(int a){
        System.out.println("the number is " + a);
    }
    public static int giveMe10(){
        return 10;
    }
    public static int addTheseNumber(int numb1 , int numb2){
        return numb1 + numb2;
    }
    public static double square(double value){
        return (value * value);
    }
}
