package Inheritance.Super;
import java.util.Scanner;

class Rectangle{
    float length,bredth;
//    public Rectangle(){}
    public Rectangle(float l,float b){this.length=l;this.bredth=b;}
    public double calcArea(){return length*bredth;}

}
class Square extends Rectangle {
//    float side;
    public Square(float s){
        super(s,s);
    }
    @Override
    public double calcArea() {return super.calcArea();}
}

public class Q2 {
    public static void main(String[] args) {
        System.out.println("----  SHAPES  ----\n\n");
        Scanner sc = new Scanner(System.in);
        System.out.println("RECTANGLE");
        System.out.print("Enter the length : "); float len = sc.nextFloat();
        System.out.print("Enter the breadth : "); float br = sc.nextFloat();
        Rectangle R = new Rectangle(len,br);
        System.out.println("Area of the rectangle : "+R.calcArea());

        System.out.println("------------------------------------------");

        System.out.println("SQUARE");
        System.out.print("Enter the side of square : "); float s = sc.nextFloat();
        Square S = new Square(s);
        System.out.println("Area of the square : "+S.calcArea());
    }
}
