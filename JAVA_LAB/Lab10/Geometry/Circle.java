package Lab10.Geometry;
import java.util.Scanner;
public class Circle {
    public double radius;
    void set_radius(){
        System.out.println("Enter the value of radius :");
        Scanner sc =new Scanner(System.in);
        double rad=sc.nextDouble();
        this.radius=rad;
    }
    void get_radius(){
        System.out.println("Radius of the circle is : "+this.radius);
    }
}
