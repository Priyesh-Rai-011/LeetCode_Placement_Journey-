package Inheritance.Super;

class SuperClass{
    public void doSomething(){
        System.out.println("Doing some work.");
    }
}
class SubClass extends SuperClass{
    @Override
    public void doSomething() {
        super.doSomething();
        System.out.println("Doing some extra work...!!!");
    }
}
public class Q3 {
    public static void main(String[] args) {
        SuperClass S = new SuperClass();
        S.doSomething();
        System.out.println("--------------------");
        SubClass s = new SubClass();
        s.doSomething();

    }
}
