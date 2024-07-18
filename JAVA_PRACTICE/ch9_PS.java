import java.util.Scanner;
//class Cylinder{
//    float radius,height;
//    public void set_parameters(){
//        System.out.println("Enter the radius & height of the Cylinder : ");
//        Scanner sc = new Scanner(System.in);
//        this.radius = sc.nextFloat();
//        this.height = sc.nextFloat();
//    }
//    public void get_parameters(){
//        System.out.println("------------------------");
//        System.out.print("Radius of the Cylinder is : "+radius+"\n"+"Height of the Cylinder is : "+height);
//        float s_area = 2*3.14*radius*height;
//        System.out.println("Surface area of Cylinder is : "+s_area);
//        float vol = 3.14*radius*radius*height;
//        System.out.println("Volume of Cylinder is : "+s_area);
//    }
//}
////  Question 1 & 2
//public class ch9_PS {
//    public static void main(String[] args) {
//        System.out.println("-- Cylinder --");
//        Cylinder c1 = new Cylinder();
//        c1.set_parameters();
//        c1.get_parameters();
//    }
//}

//  Question 4
class Rectangle{
    private int length,breadth;
    public Rectangle() {
        this.length=4;
        this.breadth=5;
    }

    public void getDimensions() {
        System.out.println("Length of Rectangle is : "+length+"\n"+" Breadth of Rectangle is : "+breadth);
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth=breadth;
    }
}
public class ch9_PS {
    public static void main(String[] args) {
        System.out.println("-- Rectangle --");
//        Rectangle r1 = new Rectangle();
        Rectangle r1 = new Rectangle(100,45);
        r1.getDimensions();
    }
}