package Lab6;
import java.util.Scanner;
class Area{
    static void area(float rad){
        System.out.println("Calculating area of a Circle");
        float A = (3.14f*rad*rad);
        System.out.println("Area of Circle is : "+A);
    }
    static void area(int a){
        System.out.println("Calculating area of a Square");
        int A = (a*a);
        System.out.println("Area of Square is : "+A);
    }
    void area(float b, float h){
        System.out.println("Calculating area of a Triangle");
        float A = (0.5f*b*h);
        System.out.println("Area of Triangle is : "+A);
    }
}
public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("---- Finding Area ----");
        Area obj = new Area();
        System.out.println("1.Circle | 2. Square | 3. Triangle");
        System.out.print("Enter your option : ");
        int option = sc.nextInt();
        switch (option){
            case 1 -> obj.area(2.5f);
            case 2 -> obj.area(12,7.3f);
            case 3 -> obj.area(10);
        }
    }
}
