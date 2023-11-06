package ClassObject;

public class HouseDemo {

    public  static void main(String[] args) {
     House myHouse = new House(3, 10, "blue");
     House yourHouse = new House(4, 30, "brown");
      HouseDemo(myHouse);
      HouseDemo(yourHouse);
    }
    public static void HouseDemo(House theHouse){
        System.out.println("The house is " + theHouse.getColor() + " and has " + theHouse.getNumStories() + " stories and " + theHouse.getNumStories() + " windows. ");
    }
}

