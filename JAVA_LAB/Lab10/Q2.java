package Lab10;
import Lab10.Geometry.*;

public class Q2 {
    public static void main(String[] args) {
        Circle obj = new Circle();
        double area = 3.14d*obj.radius* obj.radius;
        double perimeter = 2*3.14d* obj.radius;
        System.out.println("Area of Circle is :"+(area));
        System.out.println("Perimeter of circle is : "+(perimeter));
    }
}
