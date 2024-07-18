import java.security.NoSuchAlgorithmException;
import java.util.*;
//// QUESTION 1
//class Circle{
//    float radius;
//    Circle(){System.out.println("Circle : Non-Parameterised Constructor");}
//    Circle(float r){
//        System.out.println("Circle : Parameterised constructor");
//        this.radius=r;
//    }
//    void area(){
////        System.out.print("Enter the radius of the circle : ");
////        Scanner sc = new Scanner(System.in);
////        float rad = sc.nextFloat();
////        this.radius = rad;
//        float area = 3.14f*this.radius*this.radius;
//        System.out.println("Area of the circle is : ("+area+") sq Unit");
//    }
//}
//class Cylinder extends Circle{
//    float height;
//    Cylinder(){System.out.println("Cylinder : Non-Parameterised Constructor");}
//    Cylinder(float r,float h){
//        super(r);
//        System.out.println("Cylinder : Parameterised constructor");
////        this.radius=r;
//        this.height=h;
//    }
//    void volume(){
//        float volume = 3.14f*this.radius*this.radius*this.height;
//        System.out.println("Volume of the Cylinder is : "+volume);
//    }
//}
//public class ch10_PS {
//    public static void main(String[] args) {
//        System.out.println("-- Inheritance --");
////        Circle C1 = new Circle(10);
////        C1.area();
//        Cylinder C2 = new Cylinder(10,20);
//        C2.volume();
//    }
//}


////QUESTION 2
//class Rectangle2{
//    float length,breadth;
//}
//class Cuboid extends Rectangle2{
//    float height;
//}
//public class ch10_PS {
//    public static void main(String[] args) {
//        System.out.println("-- Inheritance --");
//    }
//}


//QUESTION 2
class Rectangle2{
    float length,breadth;
}
class Cuboid extends Rectangle2{
    float height;
}
public class ch10_PS {
    public static void main(String[] args) {
        System.out.println("-- Inheritance --");
    }
}
