package Randomnumber;
import java.util.Random;
public class DiceSimulationClass {
    public static void main(String[] args){
        int diceSide;
        Random random = new Random();
        for( int i = 0; i < 10; i++){
            diceSide = random.nextInt(6) + 1;
            System.out.println("Simulation "+ i + " is " + diceSide);
        }
    }

}
