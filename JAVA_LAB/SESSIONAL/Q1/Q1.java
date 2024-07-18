package SESSIONAL.Q1;
import java.util.Scanner;
import SESSIONAL.Q1.NoTriangleform_Exception;

class triangle{
    int a,b,c;      double area,perim;
    triangle(int a,int b,int c){
        this.a=a;   this.b=b;   this.c=c;
        System.out.println("----------------------------------");
        System.out.println("Side  -->  "+this.a+" || "+this.b+" || "+this.c);
        System.out.println("----------------------------------");
    }
    double find_area(){
        try {
            float s = (this.a+this.b+this.c)/2f;
            this.area = Math.sqrt(s*(s-this.a)*(s-this.b)*(s-this.c));
            if (((this.a+this.b)<this.c) || ((this.b+this.c)<this.a) || ((this.c+this.a)<this.b)){throw new NoTriangleform_Exception(a,b,c,".....X");}
        }
        catch (NoTriangleform_Exception e){System.out.println("Exception occurred :   incorrect dimensions");
            System.out.println("Doesn't follow : ((a+b)>c) && ((b+c)>a) && ((c+a)>b)");
            System.out.println("Triangle can't be constructed..!");
        }
        return area;
    }
    double find_perimeter(){
        try {
            this.perim=this.a+this.b+this.c;
            if (((this.a+this.b)<this.c) || ((this.b+this.c)<this.a) || ((this.c+this.a)<this.b)){throw new NoTriangleform_Exception(a,b,c,".....X");}
        }
        catch (NoTriangleform_Exception e){System.out.println("Exception occurred :   incorrect dimensions");
            System.out.println("Doesn't follow : ((a+b)>c) && ((b+c)>a) && ((c+a)>b)");
            System.out.println("Triangle can't be constructed..!");
        }
        return perim;
    }
}
public class Q1 {
    public static void main(String[] args) {
        System.out.println("------- Triangle -------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sides of the triangle : ");
        int a=0,b=0,c=0;
        try {
            a= sc.nextInt();            b= sc.nextInt();            c= sc.nextInt();
            if (a<0){throw new NoTriangleform_Exception(a,"A : This side is not possible");}
            if (b<0){throw new NoTriangleform_Exception(b,"B : This side is not possible");}
            if (c<0){throw new NoTriangleform_Exception(c,"C : This side is not possible");}
        }catch (NoTriangleform_Exception e){System.out.println("Exception occurred  :  -ve dimension");}

        triangle t = new triangle(a,b,c);

        System.out.println("------------  Calculating Area  -------------------");
        System.out.println("Area of the triangle is :"+t.find_area());
        System.out.println("--------------------------------------------------------");
        System.out.println("------------  Calculating Perimeter  -------------------");
        System.out.println("Perimeter of the triangle is :"+t.find_perimeter());
        System.out.println("--------------------------------------------------------");
//        try {
//            if (((a+b)>c) && ((b+c)>a) && ((c+a)>b)){throw new NoTriangleform_Exception(a,b,c,".....X");}
//        }catch (NoTriangleform_Exception e){System.out.println("Exception occurred :   incorrect dimensions");
//                                            System.out.println("Doesn't follow : ((a+b)>c) && ((b+c)>a) && ((c+a)>b)");
//                                            System.out.println("Triangle can't be constructed..!");}
    }
}
