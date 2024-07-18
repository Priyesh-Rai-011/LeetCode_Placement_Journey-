package AbstractClass_Interfaces;

abstract class Animals{
    abstract void makeSound();
}
class Dog2 extends Animals{
    @Override
    void makeSound() {
        System.out.println("DOG : WOOF WOOF..!!");
    }
}
class Cat2 extends Animals{
    @Override
    void makeSound() {
        System.out.println("CAT : MEOW MEOW ...!!");
    }
}
class Lion extends Animals{
    @Override
    void makeSound() {
        System.out.println("LION : ROAR ROAR ...!!");
    }
}
public class animal {
    public static void main(String[] args) {
        System.out.println("Generating sound of animals");

        Animals a;
        a = new Dog2(); a.makeSound();
        a = new Cat2(); a.makeSound();
        a = new Lion(); a.makeSound();
    }
}
