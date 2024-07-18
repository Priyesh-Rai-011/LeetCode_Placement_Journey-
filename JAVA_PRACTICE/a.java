import java.util.Scanner;

class Triangle{
    int a,b,c;
    double s,area,perim;
    void set_dim(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of triangle : ");
        System.out.print("a : ");        this.a= sc.nextInt();
        System.out.print("b : ");        this.b= sc.nextInt();
        System.out.print("c : ");        this.c= sc.nextInt();
    }
    void area(){
        this.s = (a+b+c)/2;
        this.area = Math.pow(s*(s-a)*(s-b)*(s-c),0.5);
        System.out.println("Area of the triangle is : "+area);
    }
    void perimeter(){
        this.perim = a+b+c;
        System.out.println("Perimeter of the triangle is : "+perim);
    }
}
public class a{
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.set_dim();
        t.area();
        t.perimeter();
    }
}
