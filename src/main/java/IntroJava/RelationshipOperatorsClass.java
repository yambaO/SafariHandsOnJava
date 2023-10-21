package IntroJava;

public class RelationshipOperatorsClass {
    public static void main (String [] args){
        boolean myBool = true;
        boolean yourBool = false;
        int myAge = 37;
        int yourAge = 20;
        int bobsAge = 20;

        System.out.println("myBool is " + myBool);
        System.out.println("yourBool is " + yourBool);
        // comparison
        boolean ageComparison = myAge > yourAge;
        System.out.println("myAge > yourAge?:" + ageComparison);

        boolean ageComp = myAge < yourAge;
        System.out.println("myAge < yourAge?: " + ageComp);

        int currentAge = 25;
        boolean isGreater21 =  currentAge >= 21;
        System.out.println("my age < 21? : " + isGreater21);

    } // end main
}
