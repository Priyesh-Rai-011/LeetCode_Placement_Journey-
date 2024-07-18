import java.util.Scanner;

class A{    int a=6;
    public int method1(){        return 4;}
    public void method2(){        System.out.println("Class A : I am method 2");}
}
class B extends A{
    @Override  // this will just let you know that the function is overridden
    public void method2(){        System.out.println("Class B : I am method 2");}
    public void method3(){        System.out.println("Class B : I am method 3");}
}
public class l48_method_overriding {
    public static void main(String[] args) {
        System.out.println("-- Method overloading --");
        B obj1 = new B();
        A obj2 = new A();
        System.out.println(obj1.method1());
        obj2.method2();
        obj1.method2();
        obj1.method3();
    }
}
