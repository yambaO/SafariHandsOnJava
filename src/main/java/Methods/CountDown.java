package Methods;

public class CountDown {
    public static void main (String[] args){
//        countDown(10);
        countToUp(3,10);
    }
    public static void countDown(int num){
        if(num >= 0){
            System.out.println(num);
            countDown(num -1);
        }
    }
    public static void countToUp( int num1 , int num2){
        if( num1 >= 0 &&  num1 <= num2){
            System.out.println(num1);
            countToUp(num1 + 1,num2);
        }
    }
}
