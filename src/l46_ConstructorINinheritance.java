import java.util.Scanner;
class Base1{
    Base1(){        System.out.println("Base1 --> Default constructor");}
    Base1(int a){        System.out.println("Base1 --> Parameterised constructor : "+a);}
    public int x=10;
    public void setX(int x){this.x=x;}
    public int getX(){return x;}
}
class Derived1 extends Base1{
    Derived1(){       System.out.println("Derived1 --> Default constructor");}
    Derived1(int a,int b){
//      this will ensure that during inheritance --- parameterised constructor is called --not-- default constructor
        super(a);
        System.out.println("Derived1 --> Parameterised constructor : "+a+","+b);
    }
    public int y;
    public void setY(int y){this.y=y;}
    public int getY(){return y;}
}
public class l46_ConstructorINinheritance {
    public static void main(String[] args) {
        System.out.println("-- Constructors in Inheritance --");
        Base1 obj1 = new Base1(1);
        obj1.setX(100);
        System.out.println(obj1.getX());

//        Derived1 obj3 = new Derived1();
        Derived1 obj2 = new Derived1(2,3);
        obj2.setY(201);
        System.out.println(obj2.getY());
    }
}
