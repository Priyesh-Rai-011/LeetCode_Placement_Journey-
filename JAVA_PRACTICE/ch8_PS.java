import java.util.Scanner;
//  Question 1
//class Employee{
//    int id;
//    String name;
//    float salary;
//    public float get_salary(){ return salary;}
//    public String get_name() { return name;}
//    public void set_name(String n){name=n;}
//}
//public class ch8_PS {
//    public static void main(String[] args) {
//        System.out.println("-- Employee Class --");
//        Employee emp1 = new Employee();
//        emp1.set_name("Priyesh Rai");
//        emp1.salary = 90000;
//        System.out.println(emp1.get_name());
//    }
//}


//  Question 2
//class cellphone{
//    public void ring(){
//        System.out.println("Ringing...!");
//    }
//    public void vibrate(){
//        System.out.println("Vibrating...!");
//    }
//    void callfrind(){
//        System.out.println("Call Priyesh");
//    }
//}
//public class ch8_PS {
//    public static void main(String[] args) {
//        System.out.println("-- CELL PHONE --");
//        cellphone p1 = new cellphone();
//        p1.callfrind();
//        p1.ring();
//        p1.vibrate();
//    }
//
//}


//  Question 3
//class Square{
//    float a;
//    void set_side(float s){
//        a=s;
//    }
//    void get_side(){
//        System.out.println("Length of square's side is : "+a);
//        double dig =  Math.pow(((a*a)+(a*a)),0.5);
//        System.out.println("Length of the diagonal of Square is : "+dig);
//    }
//    void sq_area(){
//        float area = a*a;
//        System.out.println("Area of the square's side is : "+area);
//    }
//    void sq_parameter(){
//        float per = 4*a;
//        System.out.println("Perimeter of th square is : "+per);
//    }
//}
//public class ch8_PS{
//    public static void main(String[] args) {
//        System.out.println("-- SQUARE --");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the side of the square : ");
//        float side = sc.nextFloat();
//        Square s1 = new Square();
//        s1.set_side(side);
//        s1.get_side();
//        s1.sq_area();
//        s1.sq_parameter();
//    }
//}


//  Question 4
//class Rectangle{
//    float length;
//    float breadth;
//    void set_side(float l, float b){
//        length=l;
//        breadth=b;
//    }
//    void get_side(){
//        System.out.println("Length & Breadth of rectangle's is : "+length+" & "+breadth);
////        double dig =  Math.pow(((length*length)+(breadth*breadth)),0.5);
//        double dig2 =  Math.pow(Math.pow(length,2)+Math.pow(breadth,2),0.5);
//        System.out.println("Length of the diagonal of rectangle is : "+dig);
//        System.out.println("Length of the diagonal of rectangle is : "+dig2);
//    }
//    void sq_area(){
//        float area = length*breadth;
//        System.out.println("Area of the rectangle's side is : "+area);
//    }
//    void sq_parameter(){
//        float per = 2*length+2*breadth;
//        System.out.println("Perimeter of th rectangle is : "+per);
//    }
//}
//public class ch8_PS{
//    public static void main(String[] args) {
//        System.out.println("-- RECTANGLE --");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the length of sides of the rectangle : ");
//        System.out.print("Length : ");        float length = sc.nextFloat();
//        System.out.print("Breadth : ");       float breadth = sc.nextFloat();
//        Rectangle s1 = new Rectangle();
//        s1.set_side(length,breadth);
//        s1.get_side();
//        s1.sq_area();
//        s1.sq_parameter();
//    }


//  Question 5
//public class ch8_PS{
//    public static void main(String[] args) {
//        System.out.println();
//    }
//}


//  Question 6
//class Circle{
//    float rad;
//    void get_radius(){System.out.println("Radius of the circle is : "+rad); System.out.println("diameter of the circle is : "+2*rad);}
//    void set_radius(float r){rad=r;}
//    void cir_area(){float area = 3.14f*rad*rad; System.out.println("Area of the Circle is : "+area);}
//    void cir_para(){float para = 2*3.14f*rad; System.out.println("Parameter of the Circle is : "+para);}
//}
//public class ch8_PS{
//    public static void main(String[] args) {
//        System.out.println("-- CIRCLE --");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the radius of the circle : ");
//        float radius=sc.nextFloat();
//        Circle c1=new Circle();
//        c1.set_radius(radius);
//        c1.get_radius();
//        c1.cir_area();
//        c1.cir_para();
//    }
//}
//  Question 7
class TommyVicity{
    public void hit(){
        System.out.println("Hitting the Enemy...!");
    }
    public void run(){
        System.out.println("Running from the enemy...!");
    }
    public void fire(){
        System.out.println("Firing at the Enemy...!");
    }
}
public class ch8_PS{
    public static void main(String[] args) {
        System.out.println("-- GAME --");
        TommyVicity player1 = new TommyVicity();
        player1.fire();
        player1.hit();
        player1.run();
    }
}
