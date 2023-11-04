package Methods;

public class MethodOverloading {
    public static void main(String[] args){
   int result = getResult(28);
   System.out.println(result);

   result = getResult(23, 34);
   System.out.println(result);

   result = getResult( 23, "23" );
   System.out.println(result);
   String resultName = getResult("mi", "ke");
   System.out.println(resultName);

    }
    public static int getResult(int numb){
        return numb * 2;
    }
    public static int getResult(int num1 , int num2){
        return num1 * num2;
    }
    public static int getResult(int num1, String value){
        return num1 * Integer.parseInt((value));
    }
    public static String getResult(String name1, String name2){
        return name1 + name2;
    }
}
