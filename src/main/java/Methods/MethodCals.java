package Methods;

public class MethodCals {
    public static void main(String[] args){
      doSomething();
    }
    public static void doSomething(){
        System.out.println("Loading .......");
        int result = getValue();
        System.out.println("the result is : " + result);
    }
    public static int getValue(){
        return 120;
    }

}
