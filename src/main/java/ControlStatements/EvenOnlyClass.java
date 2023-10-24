package ControlStatements;

public class EvenOnlyClass {

    public static void main( String[] args){
//        int evenNumber= 0;
        for(int i = 0; i < 10; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
}
