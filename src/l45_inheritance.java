import java.util.Scanner;
class Base{    int x;
    public void set_x(int x){  System.out.print("Setting x in Base class...! --------> ");    this.x=x;    }
    public int get_x(){
        return x;
    }
}
class Derived extends Base{    int y;
    public void set_y(int y){    System.out.print("Setting y in Derived class...! --------> ");   this.y=y;   }
    public int get_y(){
        return y;
    }
}
public class l45_inheritance {
    public static void main(String[] args) {
        System.out.println("-- Inheritance --");
        Base b     = new Base();
        b.set_x(20);
        System.out.println(b.get_x());

        Derived d1 = new Derived();
        d1.set_y(30);
        System.out.println(d1.get_y());

        Derived d2 = new Derived();
        d2.set_x(40);
        System.out.println(d2.get_x());
    }
}
