package ClassObject;

public class RectangleDemo {
    public static void main(String[] args) {
     Rectangle r1 = new Rectangle(6,4);
     Rectangle r2 = new Rectangle(5, 10);
     Rectangle r3 = new Rectangle();
     System.out.println(Rectangle.getNumRectangles());

     System.out.println(r1.area());
     System.out.println("perimeter is " + r1.perimeter());
     System.out.println(r2.area());
     System.out.println("perimeter is " + r2.perimeter());
    }
}
