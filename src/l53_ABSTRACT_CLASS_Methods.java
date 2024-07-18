//                      Abstract --> existing in thought and ideas
//Abstract class is a class which contains aa abstract method...!
abstract class Base2{
    public Base2()        {System.out.println("Base : Default Constructor");}
    public void sayHello(){System.out.println("Hello...! Priyesh");}
    abstract public void greet();
    abstract public void greet2();
}
class derived2 extends Base2{
    @Override
    public void greet(){System.out.println("Good Morning...!");}
    public void greet2(){System.out.println("Good Afternoon   ...!");}
}
abstract class derived3 extends Base2{
    public void th(){System.out.println("I am Good..!");}
}
public class l53_ABSTRACT_CLASS_Methods {
    public static void main(String[] args) {
        System.out.println("-- ABSTRACT CLASSES --");

    }
}
