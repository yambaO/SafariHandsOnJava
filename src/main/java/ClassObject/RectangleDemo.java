package ClassObject;

public class RectangleDemo {
    public static void main(String[] args) {
     Rectangle r1 = new Rectangle(4,4);
     Rectangle r2 = new Rectangle(5, 10);
     System.out.println(Rectangle.getNumRectangles());

     System.out.println(r1.area());
    }
}
