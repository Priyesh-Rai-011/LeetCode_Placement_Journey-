import java.util.Scanner;
class Phone{
    public void name(){System.out.println("Phone : My name is JAVA");}
    public void welcome(){System.out.println("Welcome to the device ..!");}
    public void greet(){System.out.println("Greetings ...!");}
}
class Samsung extends Phone{
    public void name(){System.out.println("Samsung : turning on ...!");}
    public void welcome(){System.out.println("Samsung --> welcome to the device");}
    public void music(){System.out.println("Samsung music");}
}
class Apple extends Phone{
    public void name(){System.out.println("Apple : Turning on ...!");}
    public void welcome(){System.out.println("Apple --> Welcome to the device");}
    public void music(){System.out.println("Apple music");}
}
public class l49_DynamicMethod_Dispatch {
    public static void main(String[] args) {
        System.out.println("-- Dynamic Method Dispatch --");
//        Phone obj = new Phone(); //Allowed
//        SmartPhone obj2 = new SmartPhone(); //Allowed
//        obj.name();
        Phone ref_obj;
    //  super class variable referring to subclass object
        ref_obj = new Samsung();
        ref_obj.name();
        ref_obj.greet();
        ref_obj.welcome();
//        ref_obj.music();  // this will not work ------------------  ???
        System.out.println("---------------------------");
        ref_obj = new Apple();
        ref_obj.name();
        ref_obj.greet();
        ref_obj.welcome();
    }
}
